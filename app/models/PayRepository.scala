package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */



@Singleton
class PayRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, orderRepository: OrderRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  import orderRepository.OrderTable

  private class PayTable(tag: Tag) extends Table[Pay](tag, "pay") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The age column */
    def order_id = column[Int]("order_id")

    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, order_id) <> ((Pay.apply _).tupled, Pay.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */

  import orderRepository.OrderTable

  private val pay = TableQuery[PayTable]
  private val order = TableQuery[OrderTable]
  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(order_id: Int): Future[Pay] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (pay.map(p => (p.order_id))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning pay.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((order_id),id) => Pay(id,order_id)}
      // And finally, insert the person into the database
      ) += (order_id)
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Pay]] = db.run {
    pay.result
  }


  //case class JoinedPay(id: Int, total: Int, order_id: Int)
  def get(basket_id: Int): Future[Seq[JoinedPay]] = db.run {
    println("inside of pay" + basket_id)
    order.filter(_.id=== basket_id).join(pay).on(_.id === _.order_id).
      result.map(s => s.map(
      a => new JoinedPay(a._2.id, a._1.total, a._1.id)))
  }


  def del(del_id: Int ) = db.run {
    println("inside of del method pay")
    pay.filter(_.id === del_id).delete
  }

}

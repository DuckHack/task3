package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */

@Singleton
class OrderRepository @Inject() (basketRepository: BasketRepository, dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */

  final class OrderTable(tag: Tag) extends Table[Order](tag, "orders") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The age column */
    def basket_id = column[Int]("basket_id")

    def total = column[Int]("total")
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, basket_id, total) <> ((Order.apply _).tupled, Order.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */

    import basketRepository.BasketTable

  private val orders = TableQuery[OrderTable]
  private val basket = TableQuery[BasketTable]

  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(basket_id: Int, total: Int): Future[Order] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (orders.map(o => (o.basket_id, o.total))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning orders.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((basket_id, total),id) => Order(id, basket_id, total)}
      // And finally, insert the person into the database
      ) += (basket_id, total)
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Order]] = db.run {
    orders.result
  }


  def get(in_basket_id: Int): Future[Seq[Order]] = db.run {
    println("inside of getOrder " + in_basket_id)
    orders.filter(_.basket_id === in_basket_id).result
  }


  def del(del_id: Int ) = db.run {
    println("inside of del method Order")
    orders.filter(_.id === del_id).delete
  }

}
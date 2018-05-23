package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import models.ProductRepository
import scala.concurrent.{ Future, ExecutionContext }

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class OpinionRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */

  import productRepository.ProductTable

  private class OpinionTable(tag: Tag) extends Table[Opinion](tag, "opinion") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def value = column[String]("value")

    def product_id = column[Int]("product_id")

    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, value, product_id) <> ((Opinion.apply _).tupled, Opinion.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */

  import productRepository.ProductTable

  private val opinion = TableQuery[OpinionTable]

  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */

  def create(value: String, product_id: Int): Future[Opinion] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (opinion.map(o => (o.value, o.product_id))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning opinion.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((value, product_id),id) => Opinion(id, value, product_id)}
      // And finally, insert the person into the database
      ) += (value, product_id)
  }


  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Opinion]] = db.run {
    opinion.result
  }
}

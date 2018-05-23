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
class ProductTypeRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]
  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  /**
    * Here we define the table. It will have a name of people
    */
  import dbConfig._
  import profile.api._

  class ProductTypeTable(tag: Tag) extends Table[ProductType](tag, "product_type") {
    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    /** The name column */
    def name = column[String]("name")
    def * = (id, name) <> ((ProductType.apply _).tupled, ProductType.unapply)
  }
  /**
    * The starting point for all queries on the people table.
    */
  private val product_type = TableQuery[ProductTypeTable]
  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(name: String): Future[ProductType] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (product_type.map(t => (t.name))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning product_type.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into ((name, id) => ProductType(id, name))
      // And finally, insert the person into the database
      ) += (name)
  }
  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[ProductType]] = db.run {
    product_type.result
  }
}
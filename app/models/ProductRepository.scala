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
class ProductRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, productTypeRepository: ProductTypeRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
   * Here we define the table. It will have a name of people
   */
  import productTypeRepository.ProductTypeTable

  class ProductTable(tag: Tag) extends Table[Product](tag, "product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The age column */
    def description = column[String]("description")

    def price = column[Int]("price")

    def type_id = column[Int]("type_id")


    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */
    def * = (id, name, description, price, type_id) <> ((Product.apply _).tupled, Product.unapply)
  }

  /**
   * The starting point for all queries on the people table.
   */

  private val product = TableQuery[ProductTable]

  /**
   * Create a person with the given name and age.
   *
   * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
   * id for that person.
   */
  def create(name: String, description: String, price: Int, type_id: Int): Future[Product] = db.run {
    println(product)
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (product.map(p => (p.name, p.description, p.price, p.type_id))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning product.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((name,description,price,type_id),id) => Product(id,name, description, price, type_id)}
    // And finally, insert the person into the database
    ) += (name, description, price, type_id)
  }

  /**
   * List all the people in the database.
   */
  def list(): Future[Seq[Product]] = db.run {
    product.result
  }

  def del(del_product_id: Int ) = db.run {
    println("inside of del method")
    product.filter(_.id === del_product_id).delete
  }


}

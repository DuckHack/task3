package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


@Singleton
class BasketProductRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, basketRepository: BasketRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  import productRepository.ProductTable
  import basketRepository.BasketTable

  private class BasketProductTable(tag: Tag) extends Table[BasketProduct](tag, "basket_product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def product_id = column[Int]("product_id")

    def basket_id = column[Int]("basket_id")

    def * = (id, product_id, basket_id) <> ((BasketProduct.apply _).tupled, BasketProduct.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */


  import basketRepository.BasketTable
  import productRepository.ProductTable


  private val basketProduct = TableQuery[BasketProductTable]

  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(product_id: Int, basket_id: Int): Future[BasketProduct] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (basketProduct.map(bP => (bP.product_id, bP.basket_id))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning basketProduct.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((product_id, basket_id),id) => BasketProduct(id, product_id, basket_id)}
      // And finally, insert the person into the database
      ) += (product_id, basket_id)
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[BasketProduct]] = db.run {
    basketProduct.result
  }
}

package models

import play.api.libs.json._

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


case class Product(id: Int, name: String, description: String, price: Int, type_id: Int)

object Product {
  implicit val productFormat = Json.format[Product]
}

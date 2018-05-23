package models

import play.api.libs.json._

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


case class BasketProduct(id: Int, product_id: Int, basket_id: Int)

object BasketProduct {
  implicit val basketProductFormat = Json.format[BasketProduct]
}

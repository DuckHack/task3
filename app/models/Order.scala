package models

import play.api.libs.json._

case class Order(id: Int, basket_id: Int, total: Int)

object Order{
  implicit val orderFormat = Json.format[Order]
}

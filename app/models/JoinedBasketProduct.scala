package models

import play.api.libs.json._

case class JoinedBasketProduct(basket_id:Int, user_id: Int,  product_id: Int, id: Int, name: String, description: String, price: Int)

object JoinedBasketProduct {
  implicit val JoinedBasketProductFormat = Json.format[JoinedBasketProduct]
}
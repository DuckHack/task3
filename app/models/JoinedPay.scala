package models

import play.api.libs.json._

case class JoinedPay(id: Int, total: Int, order_id: Int)

object JoinedPay {
  implicit val JoinedPayFormat = Json.format[JoinedPay]
}

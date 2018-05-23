package models

import play.api.libs.json._

case class ProductType(id: Int, name: String)

object ProductType {
  implicit val typeFormat = Json.format[ProductType]
}

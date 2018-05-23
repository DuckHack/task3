package models

import play.api.libs.json._

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


case class Pay(id: Int, order_id: Int)

object Pay {
  implicit val payFormat = Json.format[Pay]
}

package models

import play.api.libs.json._

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


case class Opinion(id: Int, value: String, product_id: Int)

object Opinion {
  implicit val opinionFormat = Json.format[Opinion]
}

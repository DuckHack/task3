package models

import play.api.libs.json._

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }


case class KeyWord(id: Int, word: String)

object KeyWord {
  implicit val keyWordFormat = Json.format[KeyWord]
}

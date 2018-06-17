package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class KeyWordController @Inject()(keyWordRepository: KeyWordRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val keyWordForm: Form[CreateKeyWordForm] = Form {
    mapping(
      "word" -> nonEmptyText
    )(CreateKeyWordForm.apply)(CreateKeyWordForm.unapply)
  }

  val delKeyWordForm: Form[DeleteKeyWordForm] = Form {
    mapping(
      "id" -> number
    )(DeleteKeyWordForm.apply)(DeleteKeyWordForm.unapply)
  }

  /**
    * The index action.
    */
  def keyWords = Action { implicit request =>
    // val productTypes = productTypeRepository.list()
    Ok(views.html.keyWords(keyWordForm))
  }


  def addKeyWord = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[KeyWord] = Seq[KeyWord]()
    val keyWord = keyWordRepository.list().onComplete{
      case Success(kw) => a= kw
      case Failure(_) => print("fail")
    }

    keyWordForm.bindFromRequest.fold(
     errorForm => {
        Future.successful(
          Redirect(routes.KeyWordController.keyWords).flashing("success" -> "Fucked")
        )
      },
      keyWord => {
        keyWordRepository.create(keyWord.word).map { _ =>
          Redirect(routes.KeyWordController.keyWords).flashing("success" -> "keyWord.created")
        }
      }
    )
  }

  def delKeyword = Action.async { implicit request =>

    delKeyWordForm.bindFromRequest.fold(


      errorForm => {
        println(errorForm);
        Future.successful(
          Redirect(routes.KeyWordController.keyWords).flashing("success" -> "product.deleted - fucked")
        )
      },
      // There were no errors in the from, so create the person.
      keyWord => {
        keyWordRepository.del(keyWord.id).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.KeyWordController.keyWords).flashing("success" -> "product.deleted")
        }
      }

    )
  }


  /**
    * A REST endpoint
    */
  def getKeyWords = Action.async { implicit request =>
    keyWordRepository.list().map { keyWords =>
      Ok(Json.toJson(keyWords))
    }
  }
}

case class DeleteKeyWordForm(id: Int)
case class CreateKeyWordForm(word: String)
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

class MainController @Inject()(basketRepository: BasketRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val userForm: Form[CreateUserForm] = Form {
    mapping(
      "user_id" -> number
    )(CreateUserForm.apply)(CreateUserForm.unapply)
  }


  def index = Action.async { implicit request =>
    val users = basketRepository.list()
    users.map(user => Ok(views.html.index(user)))
  }

  def getGodPage = Action { implicit request =>
    Ok(views.html.godPage())
  }

  def createUserPage = Action.async { implicit request =>
    val request_obj = userForm.bindFromRequest.get
    println(request_obj.user_id)
    userForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          Redirect(routes.MainController.index).flashing("success" -> "Fucked")
        )
      },
      basket => {
        Future(
          Ok(views.html.userPage(request_obj.user_id))
        )
      }
    )
  }
}

case class CreateUserForm(user_id: Int)
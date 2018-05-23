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

class BasketController @Inject()(basketRepository: BasketRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val basketForm: Form[CreateBasketForm] = Form {
    mapping(
      "user_id" -> number
    )(CreateBasketForm.apply)(CreateBasketForm.unapply)
  }

  /**
    * The index action.
    */
  def baskets = Action { implicit request =>
    // val productTypes = productTypeRepository.list()
    Ok(views.html.baskets(basketForm))
  }


  def addBasket = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[Basket] = Seq[Basket]()
    val basket = basketRepository.list().onComplete{
      case Success(b) => a= b
      case Failure(_) => print("fail")
    }

    basketForm.bindFromRequest.fold(
      errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.BasketController.baskets).flashing("success" -> "Fucked")
        )
      },
      basket => {
        basketRepository.create(basket.user_id).map { _ =>
          Redirect(routes.BasketController.baskets).flashing("success" -> "product.created")
        }
      }
    )
  }

  /**
    * A REST endpoint
    */
  def getBaskets = Action.async { implicit request =>
    basketRepository.list().map { baskets =>
      Ok(Json.toJson(baskets))
    }
  }
}


case class CreateBasketForm(user_id: Int)
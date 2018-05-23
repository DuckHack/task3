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



class PayController @Inject()(payRepository: PayRepository, orderRepository: OrderRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val payForm: Form[CreatePayForm] = Form {
    mapping(
      "order_id" -> number
    )(CreatePayForm.apply)(CreatePayForm.unapply)
  }


  def pay = Action.async { implicit request =>
    val orders = orderRepository.list()
    orders.map(ord => Ok(views.html.pay(payForm, ord)))
  }


  def addPay = Action.async { implicit request =>
    var a:Seq[Pay] = Seq[Pay]()
    val pay = payRepository.list().onComplete{
      case Success(p) => a= p
      case Failure(_) => print("fail")
    }

    payForm.bindFromRequest.fold(
     errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.PayController.pay).flashing("success" -> "Fucked")
        )
      },
     pay => {
        payRepository.create(pay.order_id).map { _ =>
          Redirect(routes.PayController.pay).flashing("success" -> "pay.created")
        }
      }
    )
  }
  /**
    * A REST endpoint
    */
  def getPays = Action.async { implicit request =>
    payRepository.list().map { pays =>
      Ok(Json.toJson(pays))
    }
  }
}


case class CreatePayForm(order_id: Int)
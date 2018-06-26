package controllers

import javax.inject._
import models.{JoinedPay, _}
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


  val delPayForm: Form[DelPayForm] = Form{
    mapping(
      "id" -> number
    )(DelPayForm.apply)(DelPayForm.unapply)
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


  def delPay = Action.async { implicit request =>

    delPayForm.bindFromRequest.fold(


      errorForm => {
        println(errorForm);
        Future.successful(
          Redirect(routes.PayController.pay).flashing("success" -> "pay.deleted - collapse")
        )
      },
      // There were no errors in the from, so create the person.
      pay => {
        payRepository.del(pay.id).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.PayController.pay).flashing("success" -> "pay.deleted")
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

  def get(basket_id: String) = Action.async { implicit request =>
    payRepository.get(basket_id.toInt).map{ payJoin =>
      Ok(Json.toJson(payJoin))
    }
  }

  def add (order_id: String) = Action.async { implicit request =>
    payRepository.create(order_id.toInt).map { id =>
      println("addPayCOntroller, id -> " + id)
      Ok(Json.toJson(id))
    }
  }

}

case class DelPayForm(id: Int)
case class CreatePayForm(order_id: Int)
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

class OrderController @Inject()(orderRepository: OrderRepository, basketRepository: BasketRepository, cc: MessagesControllerComponents)
                               (implicit ec: ExecutionContext)extends MessagesAbstractController(cc) {

  val orderForm: Form[CreateOrderForm] = Form {
    mapping(
      "basket_id" -> number,
      "total" -> number
    )(CreateOrderForm.apply)(CreateOrderForm.unapply)
  }

  val delOrderForm: Form[DelOrderForm] = Form{
    mapping(
          "id" -> number
    )(DelOrderForm.apply)(DelOrderForm.unapply)
  }


  def order = Action.async { implicit request =>
    val baskets = basketRepository.list()
    baskets.map(basket => Ok(views.html.order(orderForm, basket)))
  }


  def addOrder = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[Order] = Seq[Order]()
    val orders = orderRepository.list().onComplete{
      case Success(or) => a= or
      case Failure(_) => print("fail")
    }
    orderForm.bindFromRequest.fold(
      errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.OrderController.order).flashing("success" -> "Fucked")
        )
      },
      order => {
        orderRepository.create(order.basket_id, order.total).map { _ =>
          Redirect(routes.OrderController.order).flashing("success" -> "order.created")
        }
      }
    )
  }


  def delOrder = Action.async { implicit request =>

    delOrderForm.bindFromRequest.fold(


      errorForm => {
        println(errorForm);
        Future.successful(
          Redirect(routes.OrderController.order).flashing("success" -> "order.deleted - collapse")
        )
      },
      // There were no errors in the from, so create the person.
      order => {
        orderRepository.del(order.id).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.OrderController.order).flashing("success" -> "order.deleted")
        }
      }

    )
  }



  def getOrders = Action.async { implicit request =>
    orderRepository.list().map { orders =>
      Ok(Json.toJson(orders))
    }
  }


  def get(basket_id: String) = Action.async { implicit request =>
    orderRepository.get(basket_id.toInt).map{ orderJoin =>
      Ok(Json.toJson(orderJoin))
    }
  }


  def add (basket_id: String, total: String) = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    orderRepository.create(basket_id.toInt, total.toInt).map { id =>
      // If successful, we simply redirect to the index page.
      Ok(Json.toJson(id))
    }
  }


}

case class DelOrderForm(id: Int)
case class CreateOrderForm(basket_id: Int, total: Int)
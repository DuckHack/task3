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
  //  def create(value: String, product_id: Int): Future[Opinion]
//    * A REST endpoint that gets all the people as JSON.
/*
  def myOrders = Action.async { implicit request =>
    val request_obj = userForm.bindFromRequest.get
    println(request_obj.user_id + "myOrders")

//    var myBasket: play.api.libs.json.JsValue =
//    basketRepository.myList().map { baskets =>
//      Json.toJson(baskets)
//      //Ok(Json.toJson(baskets))
//    }
    getResult()
    //    val order = orders.filter(_.basket_id == request_obj.user_id)
//    println(order)
  }

  def getResult = Action.async{
    basketRepository.myList().map { baskets =>
      //println(Json.toJson(baskets))
      Ok(Json.toJson(baskets))
    }
  }
*/

  def getOrders = Action.async { implicit request =>
    orderRepository.list().map { orders =>
      Ok(Json.toJson(orders))
    }
  }
}


case class CreateOrderForm(basket_id: Int, total: Int)
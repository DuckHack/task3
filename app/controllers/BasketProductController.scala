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

class BasketProductController @Inject()(productRepository: ProductRepository,
                                        basketRepository: BasketRepository, basketProductRepository: BasketProductRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val basketProductForm: Form[CreateBasketProductForm] = Form {
    mapping(
      "product_id" -> number,
      "basket_id" -> number
    )(CreateBasketProductForm.apply)(CreateBasketProductForm.unapply)
  }

    def basketProducts = Action.async { implicit request =>
    val products = productRepository.list()
    val baskets = basketRepository.list()
    baskets.flatMap { basket =>
      products.map { product =>
        Ok(views.html.basketProduct(basketProductForm, basket, product))
      }
    }
  }


  def addBasketProduct = Action.async { implicit request =>
    var a:Seq[BasketProduct] = Seq[BasketProduct]()
    val BasketProducts = basketProductRepository.list().onComplete{
      case Success(pt) => a= pt
      case Failure(_) => print("fail")
    }

    basketProductForm.bindFromRequest.fold(
      errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.BasketProductController.basketProducts).flashing("success" -> "Fucked")
        )
      },
      basketProduct => {
        basketProductRepository.create(basketProduct.product_id, basketProduct.basket_id).map { _ =>
          Redirect(routes.BasketProductController.basketProducts).flashing("success" -> "basketProduct.created")
        }
      }
    )
  }
  /**
    * A REST endpoint that gets all the people as JSON.
    */
  def getBasketProducts = Action.async { implicit request =>
    basketProductRepository.list().map { basketProduct =>
      Ok(Json.toJson(basketProduct))
    }
  }
}

case class CreateBasketProductForm(product_id: Int, basket_id: Int)
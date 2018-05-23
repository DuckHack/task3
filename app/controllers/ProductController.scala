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

class ProductController @Inject()(productsRepo: ProductRepository, productTypeRepository: ProductTypeRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "price" -> number,
      "type_id" -> number
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }


  def index = Action.async { implicit request =>
    val types = productTypeRepository.list()
    types.map(typ => Ok(views.html.addProd(productForm, typ)))
  }


  def addProduct = Action.async { implicit request =>
    var a:Seq[Product] = Seq[Product]()
    val product = productsRepo.list().onComplete{
      case Success(pr) => a= pr
      case Failure(_) => print("fail")
    }

    productForm.bindFromRequest.fold(
      errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.ProductController.index).flashing("success" -> "Fucked")
        )
      },
      product => {
        productsRepo.create(product.name, product.description, product.price, product.type_id).map { _ =>
          Redirect(routes.ProductController.index).flashing("success" -> "product.created")
        }
      }
    )
  }

  /**
   * A REST endpoint
   */
  def getProducts = Action.async { implicit request =>
    productsRepo.list().map { products =>
      Ok(Json.toJson(products))
    }
  }
}


case class CreateProductForm(name: String, description: String, price: Int, type_id: Int)
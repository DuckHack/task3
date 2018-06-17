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

class ProductTypeController @Inject()(productTypeRepository :ProductTypeRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val productTypeForm: Form[CreateProductTypeForm] = Form {
    mapping(
      "name" -> nonEmptyText
    )(CreateProductTypeForm.apply)(CreateProductTypeForm.unapply)
  }

  val delProductTypeForm : Form[DeleteProductTypeForm] = Form{
    mapping(
      "id" -> number
    )(DeleteProductTypeForm.apply)(DeleteProductTypeForm.unapply)
  }


  def types = Action { implicit request =>
    Ok(views.html.productTypes(productTypeForm))
  }


  def addProductType = Action.async { implicit request =>
    var a:Seq[ProductType] = Seq[ProductType]()
    val ProductTypes = productTypeRepository.list().onComplete{
      case Success(pt) => a= pt
      case Failure(_) => print("fail")
    }

    productTypeForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          Redirect(routes.ProductTypeController.types).flashing("success" -> "Fucked")
        )
      },
      productType => {
        productTypeRepository.create(productType.name).map { _ =>
          Redirect(routes.ProductTypeController.types).flashing("success" -> "product.created")
        }
      }
    )
  }

  def delProductType = Action.async { implicit request =>

    delProductTypeForm.bindFromRequest.fold(


      errorForm => {
        println(errorForm);
        Future.successful(
          Redirect(routes.ProductTypeController.types).flashing("success" -> "product.deleted - fucked")
        )
      },
      // There were no errors in the from, so create the person.
      productType => {
        productTypeRepository.del(productType.id).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.ProductTypeController.types).flashing("success" -> "product.deleted")
        }
      }

    )
  }

  /**
    * A REST endpoint
    */
  def getProductTypes = Action.async { implicit request =>
    productTypeRepository.list().map { productTypes =>
      Ok(Json.toJson(productTypes))
    }
  }
}

case class DeleteProductTypeForm(id: Int)
case class CreateProductTypeForm(name: String)
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

class OpinionController @Inject()(productsRepo: ProductRepository, opinionRepository: OpinionRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val opinionForm: Form[CreateOpinionForm] = Form {
    mapping(
      "value" -> nonEmptyText,
      "product_id" -> number
    )(CreateOpinionForm.apply)(CreateOpinionForm.unapply)
  }


    def opinions = Action.async { implicit request =>
      val products = productsRepo.list()
      products.map(prod => Ok(views.html.opinions(opinionForm, prod)))
  }


  def addOpinion = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[Opinion] = Seq[Opinion]()
    val Opinions = opinionRepository.list().onComplete{
      case Success(op) => a= op
      case Failure(_) => print("fail")
    }

    opinionForm.bindFromRequest.fold(
    errorForm => {
        println(errorForm)
        Future.successful(
          Redirect(routes.OpinionController.opinions).flashing("success" -> "Fucked")
        )
      },
      opinion => {
        opinionRepository.create(opinion.value, opinion.product_id).map { _ =>
          Redirect(routes.OpinionController.opinions).flashing("success" -> "product.created")
        }
      }
    )
  }
  /**
    * A REST endpoint that gets all the people as JSON.
    */
  def getOpinions = Action.async { implicit request =>
    opinionRepository.list().map { opinions =>
      Ok(Json.toJson(opinions))
    }
  }
}


case class CreateOpinionForm(value: String, product_id: Int)
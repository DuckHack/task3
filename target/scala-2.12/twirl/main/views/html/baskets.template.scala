
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object baskets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateBasketForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basket: Form[CreateBasketForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Baskets page")/*9.22*/ {_display_(Seq[Any](format.raw/*9.24*/("""
  """),_display_(/*10.4*/form(routes.BasketController.addBasket())/*10.45*/ {_display_(Seq[Any](format.raw/*10.47*/("""
		"""),_display_(/*11.4*/inputText(basket("user_id"))),format.raw/*11.32*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add Basket"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*20.14*/routes/*20.20*/.BasketController.getBaskets()),format.raw/*20.50*/("""" >Get all baskets</a>
		</div>
	""")))}),format.raw/*22.3*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(basket:Form[CreateBasketForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basket)(request)

  def f:((Form[CreateBasketForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basket) => (request) => apply(basket)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 21:48:39 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/baskets.scala.html
                  HASH: 3cfe0c4d5d0e7956ee3a496485f37a3722131530
                  MATRIX: 769->1|915->77|959->75|986->93|1013->95|1027->102|1060->127|1106->136|1136->141|1151->148|1185->162|1216->164|1244->167|1272->187|1311->189|1341->193|1391->234|1431->236|1461->240|1510->268|1541->273|1553->277|1584->287|1615->291|1758->407|1773->413|1824->443|1888->477|1920->479
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|44->20|44->20|44->20|46->22|47->23
                  -- GENERATED --
              */
          
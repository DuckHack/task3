
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

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOrderForm],Seq[Basket],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm], baskets: Seq[Basket])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Orders page")/*9.21*/ {_display_(Seq[Any](format.raw/*9.23*/("""
  """),_display_(/*10.4*/form(routes.OrderController.addOrder())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
	  """),_display_(/*11.5*/inputText(order("total"))),format.raw/*11.30*/("""
	  """),format.raw/*12.4*/("""<select name="basket_id" id="basket_id">
	  """),_display_(/*13.5*/for(basket <- baskets) yield /*13.27*/{_display_(Seq[Any](format.raw/*13.28*/("""
		  """),format.raw/*14.5*/("""<option value=""""),_display_(/*14.21*/basket/*14.27*/.id),format.raw/*14.30*/("""">"""),_display_(/*14.33*/basket/*14.39*/.user_id),format.raw/*14.47*/("""</option>
	  """)))}),format.raw/*15.5*/("""
	  """),format.raw/*16.4*/("""</select>
		"""),_display_(/*17.4*/CSRF/*17.8*/.formField),format.raw/*17.18*/("""

		"""),format.raw/*19.3*/("""<div class="buttons">
			<input type="submit" value="Add order"/>
		</div>
	""")))}),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""<div class="buttons">
		<a href=""""),_display_(/*24.13*/routes/*24.19*/.OrderController.getOrders()),format.raw/*24.47*/("""" >Get all orders</a>
	</div>

""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(order:Form[CreateOrderForm],baskets:Seq[Basket],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order,baskets)(request)

  def f:((Form[CreateOrderForm],Seq[Basket]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order,baskets) => (request) => apply(order,baskets)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 22 23:45:55 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/order.scala.html
                  HASH: 17607589435782f007c2a6051a4d52c48bd0fd2f
                  MATRIX: 778->1|944->97|988->95|1015->113|1042->115|1056->122|1089->147|1135->156|1165->161|1180->168|1214->182|1245->184|1273->187|1300->206|1339->208|1369->212|1417->251|1457->253|1488->258|1534->283|1565->287|1636->332|1674->354|1713->355|1745->360|1788->376|1803->382|1827->385|1857->388|1872->394|1901->402|1945->416|1976->420|2015->433|2027->437|2058->447|2089->451|2196->528|2225->530|2286->564|2301->570|2350->598|2412->630
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|41->17|41->17|41->17|43->19|46->22|47->23|48->24|48->24|48->24|51->27
                  -- GENERATED --
              */
          
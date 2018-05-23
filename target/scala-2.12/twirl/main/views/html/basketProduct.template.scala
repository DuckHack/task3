
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

object basketProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateBasketProductForm],Seq[Basket],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basketProduct: Form[CreateBasketProductForm], baskets: Seq[Basket], products: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/request/*6.9*/.flash.get("success").map/*6.34*/ { key =>_display_(Seq[Any](format.raw/*6.43*/("""
   """),_display_(/*7.5*/request/*7.12*/.messages(key)),format.raw/*7.26*/("""
""")))}),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main("Basket products page")/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
  """),_display_(/*11.4*/form(routes.BasketProductController.addBasketProduct())/*11.59*/ {_display_(Seq[Any](format.raw/*11.61*/("""
	  """),format.raw/*12.4*/("""<h3>Select the user id</h3>
	  <select name="basket_id" id="basket_id">
		"""),_display_(/*14.4*/for(b <- baskets) yield /*14.21*/{_display_(Seq[Any](format.raw/*14.22*/("""
			"""),format.raw/*15.4*/("""<option value=""""),_display_(/*15.20*/b/*15.21*/.id),format.raw/*15.24*/("""">"""),_display_(/*15.27*/b/*15.28*/.user_id),format.raw/*15.36*/("""</option>
		""")))}),format.raw/*16.4*/("""
	  """),format.raw/*17.4*/("""</select>
	  <h3>Select the product</h3>
	  <select name="product_id" id="product_id">
		  """),_display_(/*20.6*/for(p <- products) yield /*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
			  """),format.raw/*21.6*/("""<option value=""""),_display_(/*21.22*/p/*21.23*/.id),format.raw/*21.26*/("""">"""),_display_(/*21.29*/p/*21.30*/.name),format.raw/*21.35*/("""</option>
		  """)))}),format.raw/*22.6*/("""
	  """),format.raw/*23.4*/("""</select>

		"""),_display_(/*25.4*/CSRF/*25.8*/.formField),format.raw/*25.18*/("""

		"""),format.raw/*27.3*/("""<div class="buttons">
			<input type="submit" value="Add product to basket"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*32.14*/routes/*32.20*/.BasketProductController.getBasketProducts()),format.raw/*32.64*/("""" >Get all basket products</a>
		</div>
	""")))}),format.raw/*34.3*/("""
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(basketProduct:Form[CreateBasketProductForm],baskets:Seq[Basket],products:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basketProduct,baskets,products)(request)

  def f:((Form[CreateBasketProductForm],Seq[Basket],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basketProduct,baskets,products) => (request) => apply(basketProduct,baskets,products)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 00:46:41 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/basketProduct.scala.html
                  HASH: 53780fff6224c15ffd6ffb7406def0bff6e44ec1
                  MATRIX: 807->1|1013->138|1057->135|1085->154|1112->156|1126->163|1159->188|1205->197|1235->202|1250->209|1284->223|1315->225|1344->228|1381->256|1421->258|1451->262|1515->317|1555->319|1586->323|1687->398|1720->415|1759->416|1790->420|1833->436|1843->437|1867->440|1897->443|1907->444|1936->452|1979->465|2010->469|2128->561|2162->579|2201->580|2234->586|2277->602|2287->603|2311->606|2341->609|2351->610|2377->615|2422->630|2453->634|2493->648|2505->652|2536->662|2567->666|2721->793|2736->799|2801->843|2873->885|2905->887
                  LINES: 21->1|24->4|27->2|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|34->10|34->10|34->10|35->11|35->11|35->11|36->12|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|49->25|49->25|49->25|51->27|56->32|56->32|56->32|58->34|59->35
                  -- GENERATED --
              */
          
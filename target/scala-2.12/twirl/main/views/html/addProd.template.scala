
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

object addProd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[ProductType],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], prod_type: Seq[ProductType])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
		"""),_display_(/*12.4*/inputText(product("description"))),format.raw/*12.37*/("""
		"""),_display_(/*13.4*/inputText(product("price"))),format.raw/*13.31*/("""
	  """),format.raw/*14.4*/("""<select name="type_id" id="type_id">
		"""),_display_(/*15.4*/for(p_type <- prod_type) yield /*15.28*/{_display_(Seq[Any](format.raw/*15.29*/("""
			"""),format.raw/*16.4*/("""<option value=""""),_display_(/*16.20*/p_type/*16.26*/.id),format.raw/*16.29*/("""">"""),_display_(/*16.32*/p_type/*16.38*/.name),format.raw/*16.43*/("""</option>
		""")))}),format.raw/*17.4*/("""
	  """),format.raw/*18.4*/("""</select>


		"""),_display_(/*21.4*/CSRF/*21.8*/.formField),format.raw/*21.18*/("""

		"""),format.raw/*23.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*28.14*/routes/*28.20*/.ProductController.getProducts()),format.raw/*28.52*/("""" >Get all products</a>
		</div>
	""")))}),format.raw/*30.3*/("""
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],prod_type:Seq[ProductType],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,prod_type)(request)

  def f:((Form[CreateProductForm],Seq[ProductType]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,prod_type) => (request) => apply(product,prod_type)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 17:09:12 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/addProd.scala.html
                  HASH: b2d2d8ebaa6efeb0c68b2e6904208845ec27d327
                  MATRIX: 787->1|964->108|1008->106|1035->124|1062->126|1076->133|1109->158|1155->167|1185->172|1200->179|1234->193|1265->195|1293->198|1327->224|1366->226|1396->230|1448->273|1488->275|1518->279|1565->305|1595->309|1649->342|1679->346|1727->373|1758->377|1824->417|1864->441|1903->442|1934->446|1977->462|1992->468|2016->471|2046->474|2061->480|2087->485|2130->498|2161->502|2202->517|2214->521|2245->531|2276->535|2420->652|2435->658|2488->690|2553->725|2585->727
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|38->14|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|45->21|45->21|45->21|47->23|52->28|52->28|52->28|54->30|55->31
                  -- GENERATED --
              */
          
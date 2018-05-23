
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

object productTypes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateProductTypeForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productType: Form[CreateProductTypeForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Products type page")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductTypeController.addProductType())/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""
		"""),_display_(/*11.4*/inputText(productType("name"))),format.raw/*11.34*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add Type"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*20.14*/routes/*20.20*/.ProductTypeController.getProductTypes()),format.raw/*20.60*/("""" >Get all types</a>
		</div>
	""")))}),format.raw/*22.3*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(productType:Form[CreateProductTypeForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(productType)(request)

  def f:((Form[CreateProductTypeForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (productType) => (request) => apply(productType)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 01:02:47 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/productTypes.scala.html
                  HASH: 195f66b13cda6701f08e44d6a97baad63f8e8a3d
                  MATRIX: 779->1|935->87|979->85|1006->103|1033->105|1047->112|1080->137|1126->146|1156->151|1171->158|1205->172|1236->174|1264->177|1298->203|1337->205|1367->209|1427->260|1467->262|1497->266|1548->296|1579->301|1591->305|1622->315|1653->319|1794->433|1809->439|1870->479|1932->511|1964->513
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|44->20|44->20|44->20|46->22|47->23
                  -- GENERATED --
              */
          
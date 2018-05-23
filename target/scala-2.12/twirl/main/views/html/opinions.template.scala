
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

object opinions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOpinionForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateOpinionForm], prod: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Opinions page")/*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
  """),_display_(/*10.4*/form(routes.OpinionController.addOpinion())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("value"))),format.raw/*11.31*/("""
	  """),format.raw/*12.4*/("""<select name="product_id" id="product_id">
		"""),_display_(/*13.4*/for(p <- prod) yield /*13.18*/{_display_(Seq[Any](format.raw/*13.19*/("""
			"""),format.raw/*14.4*/("""<option value=""""),_display_(/*14.20*/p/*14.21*/.id),format.raw/*14.24*/("""">"""),_display_(/*14.27*/p/*14.28*/.name),format.raw/*14.33*/("""</option>
		""")))}),format.raw/*15.4*/("""
	  """),format.raw/*16.4*/("""</select>


		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*26.14*/routes/*26.20*/.OpinionController.getOpinions()),format.raw/*26.52*/("""" >Get all opinions</a>
		</div>
	""")))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateOpinionForm],prod:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,prod)(request)

  def f:((Form[CreateOpinionForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,prod) => (request) => apply(product,prod)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 19 17:52:00 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/opinions.scala.html
                  HASH: 33ca026ba3aade7a557f5f57556f93bf5d9e2520
                  MATRIX: 784->1|952->99|996->97|1023->115|1050->117|1064->124|1097->149|1143->158|1173->163|1188->170|1222->184|1253->186|1281->189|1310->210|1349->212|1379->216|1431->259|1471->261|1501->265|1549->292|1580->296|1652->342|1682->356|1721->357|1752->361|1795->377|1805->378|1829->381|1859->384|1869->385|1895->390|1938->403|1969->407|2010->422|2022->426|2053->436|2084->440|2228->557|2243->563|2296->595|2361->630|2393->632
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|43->19|43->19|43->19|45->21|50->26|50->26|50->26|52->28|53->29
                  -- GENERATED --
              */
          
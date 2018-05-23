
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Basket],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basket: Seq[Basket])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
	"""),format.raw/*10.2*/("""<H2>Welcome to the main page</H2>
  """),_display_(/*11.4*/form(routes.MainController.createUserPage())/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
	  """),format.raw/*12.4*/("""<select name="user_id" id="basket">
		"""),_display_(/*13.4*/for(b <- basket) yield /*13.20*/{_display_(Seq[Any](format.raw/*13.21*/("""
			"""),format.raw/*14.4*/("""<option value=""""),_display_(/*14.20*/b/*14.21*/.id),format.raw/*14.24*/("""">"""),_display_(/*14.27*/b/*14.28*/.user_id),format.raw/*14.36*/("""</option>
		""")))}),format.raw/*15.4*/("""
	  """),format.raw/*16.4*/("""</select>


		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Continue"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*26.14*/routes/*26.20*/.MainController.getGodPage()),format.raw/*26.48*/("""" >Continue like a god</a>
		</div>
	""")))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(basket:Seq[Basket],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basket)(request)

  def f:((Seq[Basket]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basket) => (request) => apply(basket)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 18:13:08 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/index.scala.html
                  HASH: 3804d51bc140afe9a7b244ec44058c6b434864d3
                  MATRIX: 756->1|891->66|935->64|962->82|989->84|1003->91|1036->116|1082->125|1112->130|1127->137|1161->151|1192->153|1220->156|1254->182|1293->184|1322->186|1385->223|1438->267|1478->269|1509->273|1574->312|1606->328|1645->329|1676->333|1719->349|1729->350|1753->353|1783->356|1793->357|1822->365|1865->378|1896->382|1937->397|1949->401|1980->411|2011->415|2152->529|2167->535|2216->563|2284->601|2316->603
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|43->19|43->19|43->19|45->21|50->26|50->26|50->26|52->28|53->29
                  -- GENERATED --
              */
          
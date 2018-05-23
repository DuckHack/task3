
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

object keyWords extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateKeyWordForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(keyWord: Form[CreateKeyWordForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("KeyWords page")/*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
  """),_display_(/*10.4*/form(routes.KeyWordController.addKeyWord())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(keyWord("word"))),format.raw/*11.30*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add Key Word"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*20.14*/routes/*20.20*/.KeyWordController.getKeyWords()),format.raw/*20.52*/("""" >Get all key words</a>
		</div>
	""")))}),format.raw/*22.3*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(keyWord:Form[CreateKeyWordForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(keyWord)(request)

  def f:((Form[CreateKeyWordForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (keyWord) => (request) => apply(keyWord)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 22:02:42 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/keyWords.scala.html
                  HASH: fb958e8cf78662d6d3d087e6ab018aa4d98186fb
                  MATRIX: 771->1|919->79|963->77|990->95|1017->97|1031->104|1064->129|1110->138|1140->143|1155->150|1189->164|1220->166|1248->169|1277->190|1316->192|1346->196|1398->239|1438->241|1468->245|1515->271|1546->276|1558->280|1589->290|1620->294|1765->412|1780->418|1833->450|1899->486|1931->488
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|44->20|44->20|44->20|46->22|47->23
                  -- GENERATED --
              */
          
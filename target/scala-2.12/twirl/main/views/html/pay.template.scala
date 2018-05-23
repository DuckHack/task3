
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

object pay extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreatePayForm],Seq[Order],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pay: Form[CreatePayForm], ord: Seq[Order])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/request/*6.9*/.flash.get("success").map/*6.34*/ { key =>_display_(Seq[Any](format.raw/*6.43*/("""
   """),_display_(/*7.5*/request/*7.12*/.messages(key)),format.raw/*7.26*/("""
""")))}),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main("Pays page")/*10.19*/ {_display_(Seq[Any](format.raw/*10.21*/("""
  """),_display_(/*11.4*/form(routes.PayController.addPay())/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
	  """),format.raw/*12.4*/("""<select name="order_id" id="order_id">
		"""),_display_(/*13.4*/for(o <- ord) yield /*13.17*/{_display_(Seq[Any](format.raw/*13.18*/("""
			"""),format.raw/*14.4*/("""<option value=""""),_display_(/*14.20*/o/*14.21*/.id),format.raw/*14.24*/("""">"""),_display_(/*14.27*/o/*14.28*/.id),format.raw/*14.31*/("""</option>
		""")))}),format.raw/*15.4*/("""
	  """),format.raw/*16.4*/("""</select>


		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Add Pay"/>
		</div>

	  	<div class="buttons">
			<a href=""""),_display_(/*26.14*/routes/*26.20*/.PayController.getPays()),format.raw/*26.44*/("""" >Get all pays</a>
		</div>
	""")))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(pay:Form[CreatePayForm],ord:Seq[Order],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(pay,ord)(request)

  def f:((Form[CreatePayForm],Seq[Order]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (pay,ord) => (request) => apply(pay,ord)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 00:03:49 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/pay.scala.html
                  HASH: f768606e56871ef6c9206c39e18cf8e93f62d226
                  MATRIX: 773->1|930->89|974->86|1002->105|1029->107|1043->114|1076->139|1122->148|1152->153|1167->160|1201->174|1232->176|1261->179|1287->196|1327->198|1357->202|1401->237|1441->239|1472->243|1540->285|1569->298|1608->299|1639->303|1682->319|1692->320|1716->323|1746->326|1756->327|1780->330|1823->343|1854->347|1895->362|1907->366|1938->376|1969->380|2109->493|2124->499|2169->523|2230->554|2262->556
                  LINES: 21->1|24->4|27->2|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|34->10|34->10|34->10|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|43->19|43->19|43->19|45->21|50->26|50->26|50->26|52->28|53->29
                  -- GENERATED --
              */
          
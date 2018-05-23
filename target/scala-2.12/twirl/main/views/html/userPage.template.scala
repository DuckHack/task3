
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

object userPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_id : Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),format.raw/*10.5*/("""<H2>Welcome to the user page</H2>
    <p>Your'r user id is - """),_display_(/*11.29*/user_id),format.raw/*11.36*/("""</p>

    <div class="buttons">
        <a href=""""),_display_(/*14.19*/routes/*14.25*/.OrderController.order()),format.raw/*14.49*/("""" >Create Order</a>
    </div>
    <div class="buttons">
        <a href=""""),_display_(/*17.19*/routes/*17.25*/.PayController.pay()),format.raw/*17.45*/("""" >Create Pay</a>
    </div>
    <div class="buttons">
        <a href=""""),_display_(/*20.19*/routes/*20.25*/.BasketProductController.basketProducts()),format.raw/*20.66*/("""" >Create basket product</a>
    </div>
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(user_id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(request)

  def f:((Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (request) => apply(user_id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 01:02:47 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/userPage.scala.html
                  HASH: 5e7a22cb351bcd7c9336830aaf9bbc8bbd1a3df7
                  MATRIX: 751->1|880->60|924->58|951->76|978->78|992->85|1025->110|1071->119|1102->125|1117->132|1151->146|1182->148|1210->151|1244->177|1283->179|1315->184|1404->246|1432->253|1509->303|1524->309|1569->333|1671->408|1686->414|1727->434|1827->507|1842->513|1904->554|1975->595
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|35->11|35->11|38->14|38->14|38->14|41->17|41->17|41->17|44->20|44->20|44->20|46->22
                  -- GENERATED --
              */
          

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

object godPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),format.raw/*10.5*/("""<H2>Welcome to the god page</H2>
        <div class="buttons">
            <a href=""""),_display_(/*12.23*/routes/*12.29*/.BasketController.baskets()),format.raw/*12.56*/("""" >Create Basket</a>
        </div><div class="buttons"><br>
            <a href=""""),_display_(/*14.23*/routes/*14.29*/.KeyWordController.keyWords()),format.raw/*14.58*/("""" >Create KeyWord</a>
        </div><div class="buttons"><br>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.ProductController.index()),format.raw/*16.55*/("""" >Create product</a>
        </div><div class="buttons"><br>
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.ProductTypeController.types()),format.raw/*18.59*/("""" >Create product type</a>
        </div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 01:02:47 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/godPage.scala.html
                  HASH: be0aa46ed0af505c3095b8bcc0ed47d255680f7f
                  MATRIX: 746->1|862->47|906->45|933->63|960->65|974->72|1007->97|1053->106|1084->112|1099->119|1133->133|1164->135|1192->138|1226->164|1265->166|1297->171|1409->256|1424->262|1472->289|1582->372|1597->378|1647->407|1758->491|1773->497|1820->523|1931->607|1946->613|1997->643|2070->686
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|36->12|36->12|36->12|38->14|38->14|38->14|40->16|40->16|40->16|42->18|42->18|42->18|44->20
                  -- GENERATED --
              */
          
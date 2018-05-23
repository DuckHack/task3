
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/(""""/>
    </head>
    <body>
        """),_display_(/*11.10*/content),format.raw/*11.17*/("""
        """),format.raw/*12.9*/("""<div class="buttons">
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.MainController.index()),format.raw/*13.52*/("""" >MAIN</a>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts) => (content) => apply(title,scripts)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 00:02:28 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/app/views/main.scala.html
                  HASH: 89a9fe8e50a1573266ef8dc4c6bc7d40fe647764
                  MATRIX: 738->1|888->58|915->59|992->110|1017->115|1110->182|1124->188|1184->227|1247->263|1275->270|1311->279|1382->323|1397->329|1441->352
                  LINES: 21->1|26->2|27->3|31->7|31->7|32->8|32->8|32->8|35->11|35->11|36->12|37->13|37->13|37->13
                  -- GENERATED --
              */
          
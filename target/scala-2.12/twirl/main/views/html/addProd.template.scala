
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

object addProd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[CreateProductForm],Seq[ProductType],Form[DeleteProductForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], prod_type: Seq[ProductType], delProd: Form[DeleteProductForm], products: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.ProductController.addProduct())/*10.49*/ {_display_(Seq[Any](format.raw/*10.51*/("""
        """),_display_(/*11.10*/inputText(product("name"))),format.raw/*11.36*/("""
        """),_display_(/*12.10*/inputText(product("description"))),format.raw/*12.43*/("""
        """),_display_(/*13.10*/inputText(product("price"))),format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""<select name="type_id" id="type_id">
        """),_display_(/*15.10*/for(p_type <- prod_type) yield /*15.34*/{_display_(Seq[Any](format.raw/*15.35*/("""
            """),format.raw/*16.13*/("""<option value=""""),_display_(/*16.29*/p_type/*16.35*/.id),format.raw/*16.38*/("""">"""),_display_(/*16.41*/p_type/*16.47*/.name),format.raw/*16.52*/("""</option>
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""</select>


        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""

        """),format.raw/*23.9*/("""<div class="buttons">
            <input type="submit" value="Add Product"/>
        </div>
    """)))}),format.raw/*26.6*/("""

    """),format.raw/*28.5*/("""<div class="buttons">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.ProductController.getProducts()),format.raw/*29.57*/("""" >Get all products</a>
    </div>

    """),_display_(/*32.6*/form(routes.ProductController.delProduct())/*32.49*/ {_display_(Seq[Any](format.raw/*32.51*/("""
        """),format.raw/*33.9*/("""<select name="id" id="id">
        """),_display_(/*34.10*/for(p <- products) yield /*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
            """),format.raw/*35.13*/("""<option value=""""),_display_(/*35.29*/p/*35.30*/.id),format.raw/*35.33*/("""">"""),_display_(/*35.36*/p/*35.37*/.name),format.raw/*35.42*/("""</option>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""</select>


        """),_display_(/*40.10*/CSRF/*40.14*/.formField),format.raw/*40.24*/("""

        """),format.raw/*42.9*/("""<div class="buttons">
            <input type="submit" value="Delete Product"/>
        </div>
    """)))}),format.raw/*45.6*/("""
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],prod_type:Seq[ProductType],delProd:Form[DeleteProductForm],products:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,prod_type,delProd,products)(request)

  def f:((Form[CreateProductForm],Seq[ProductType],Form[DeleteProductForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,prod_type,delProd,products) => (request) => apply(product,prod_type,delProd,products)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 09 19:37:55 MSK 2018
                  SOURCE: /home/andreik/studies/2d_Sem/e-buisnes/task3/app/views/addProd.scala.html
                  HASH: 9c75c564ea46a895c68fcb84de9e7c3df0b35209
                  MATRIX: 824->1|1059->166|1103->164|1130->182|1157->184|1171->191|1204->216|1250->225|1281->231|1296->238|1330->252|1361->254|1389->257|1423->283|1462->285|1494->291|1546->334|1586->336|1623->346|1670->372|1707->382|1761->415|1798->425|1846->452|1882->461|1955->507|1995->531|2034->532|2075->545|2118->561|2133->567|2157->570|2187->573|2202->579|2228->584|2278->603|2314->612|2362->633|2375->637|2406->647|2443->657|2570->754|2603->760|2670->800|2685->806|2738->838|2805->879|2857->922|2897->924|2933->933|2996->969|3030->987|3069->988|3110->1001|3153->1017|3163->1018|3187->1021|3217->1024|3227->1025|3253->1030|3303->1049|3339->1058|3387->1079|3400->1083|3431->1093|3468->1103|3598->1203|3630->1205
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|38->14|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|45->21|45->21|45->21|47->23|50->26|52->28|53->29|53->29|53->29|56->32|56->32|56->32|57->33|58->34|58->34|58->34|59->35|59->35|59->35|59->35|59->35|59->35|59->35|60->36|61->37|64->40|64->40|64->40|66->42|69->45|70->46
                  -- GENERATED --
              */
          
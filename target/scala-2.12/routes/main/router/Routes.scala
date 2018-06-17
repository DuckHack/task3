// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/task3/conf/routes
// @DATE:Sun Jun 17 17:43:07 MSK 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  MainController_1: controllers.MainController,
  // @LINE:11
  ProductController_4: controllers.ProductController,
  // @LINE:17
  OpinionController_3: controllers.OpinionController,
  // @LINE:23
  ProductTypeController_0: controllers.ProductTypeController,
  // @LINE:28
  PayController_7: controllers.PayController,
  // @LINE:34
  BasketController_6: controllers.BasketController,
  // @LINE:41
  KeyWordController_5: controllers.KeyWordController,
  // @LINE:46
  OrderController_9: controllers.OrderController,
  // @LINE:53
  BasketProductController_2: controllers.BasketProductController,
  // @LINE:60
  Assets_8: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    MainController_1: controllers.MainController,
    // @LINE:11
    ProductController_4: controllers.ProductController,
    // @LINE:17
    OpinionController_3: controllers.OpinionController,
    // @LINE:23
    ProductTypeController_0: controllers.ProductTypeController,
    // @LINE:28
    PayController_7: controllers.PayController,
    // @LINE:34
    BasketController_6: controllers.BasketController,
    // @LINE:41
    KeyWordController_5: controllers.KeyWordController,
    // @LINE:46
    OrderController_9: controllers.OrderController,
    // @LINE:53
    BasketProductController_2: controllers.BasketProductController,
    // @LINE:60
    Assets_8: controllers.Assets
  ) = this(errorHandler, MainController_1, ProductController_4, OpinionController_3, ProductTypeController_0, PayController_7, BasketController_6, KeyWordController_5, OrderController_9, BasketProductController_2, Assets_8, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MainController_1, ProductController_4, OpinionController_3, ProductTypeController_0, PayController_7, BasketController_6, KeyWordController_5, OrderController_9, BasketProductController_2, Assets_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MainController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """godpage""", """controllers.MainController.getGodPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userpage""", """controllers.MainController.createUserPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/getproducts""", """controllers.ProductController.getProducts"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/delproduct""", """controllers.ProductController.delProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionController.opinions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/addopinion""", """controllers.OpinionController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/getopinions""", """controllers.OpinionController.getOpinions"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/delopinion""", """controllers.OpinionController.delOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types""", """controllers.ProductTypeController.types"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types/addtype""", """controllers.ProductTypeController.addProductType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types/gettypes""", """controllers.ProductTypeController.getProductTypes"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types/deltype""", """controllers.ProductTypeController.delProductType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays""", """controllers.PayController.pay"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/addpay""", """controllers.PayController.addPay"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/getpays""", """controllers.PayController.getPays"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/get/""" + "$" + """basket_id<[^/]+>""", """controllers.PayController.get(basket_id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/delpay""", """controllers.PayController.delPay"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets""", """controllers.BasketController.baskets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/addbasket""", """controllers.BasketController.addBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/getbaskets""", """controllers.BasketController.getBaskets"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/get/""" + "$" + """user_id<[^/]+>""", """controllers.BasketController.get(user_id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/deletebasket""", """controllers.BasketController.delBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords""", """controllers.KeyWordController.keyWords"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords/addkeyword""", """controllers.KeyWordController.addKeyWord"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords/getkeywords""", """controllers.KeyWordController.getKeyWords"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords/delkeyword""", """controllers.KeyWordController.delKeyword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.order"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/addorder""", """controllers.OrderController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/getorders""", """controllers.OrderController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/getorders/""" + "$" + """basket_id<[^/]+>""", """controllers.OrderController.get(basket_id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/delorder""", """controllers.OrderController.delOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts""", """controllers.BasketProductController.basketProducts"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/addbaskprod""", """controllers.BasketProductController.addBasketProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/getbaskprods""", """controllers.BasketProductController.getBasketProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/getbyid/""" + "$" + """basket_id<[^/]+>""", """controllers.BasketProductController.get(basket_id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/delbasketprod/""" + "$" + """prod_id<[^/]+>""", """controllers.BasketProductController.del(prod_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_MainController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MainController_index0_invoker = createInvoker(
    MainController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_MainController_getGodPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("godpage")))
  )
  private[this] lazy val controllers_MainController_getGodPage1_invoker = createInvoker(
    MainController_1.getGodPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "getGodPage",
      Nil,
      "GET",
      this.prefix + """godpage""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MainController_createUserPage2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userpage")))
  )
  private[this] lazy val controllers_MainController_createUserPage2_invoker = createInvoker(
    MainController_1.createUserPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "createUserPage",
      Nil,
      "POST",
      this.prefix + """userpage""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_index3_invoker = createInvoker(
    ProductController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_addProduct4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct4_invoker = createInvoker(
    ProductController_4.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """products/addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_getProducts5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/getproducts")))
  )
  private[this] lazy val controllers_ProductController_getProducts5_invoker = createInvoker(
    ProductController_4.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products/getproducts""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProductController_delProduct6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/delproduct")))
  )
  private[this] lazy val controllers_ProductController_delProduct6_invoker = createInvoker(
    ProductController_4.delProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "delProduct",
      Nil,
      "DELETE",
      this.prefix + """products/delproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_OpinionController_opinions7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionController_opinions7_invoker = createInvoker(
    OpinionController_3.opinions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "opinions",
      Nil,
      "GET",
      this.prefix + """opinions""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_OpinionController_addOpinion8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/addopinion")))
  )
  private[this] lazy val controllers_OpinionController_addOpinion8_invoker = createInvoker(
    OpinionController_3.addOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "addOpinion",
      Nil,
      "POST",
      this.prefix + """opinions/addopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_OpinionController_getOpinions9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/getopinions")))
  )
  private[this] lazy val controllers_OpinionController_getOpinions9_invoker = createInvoker(
    OpinionController_3.getOpinions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinions",
      Nil,
      "GET",
      this.prefix + """opinions/getopinions""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_OpinionController_delOpinion10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/delopinion")))
  )
  private[this] lazy val controllers_OpinionController_delOpinion10_invoker = createInvoker(
    OpinionController_3.delOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "delOpinion",
      Nil,
      "DELETE",
      this.prefix + """opinions/delopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductTypeController_types11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types")))
  )
  private[this] lazy val controllers_ProductTypeController_types11_invoker = createInvoker(
    ProductTypeController_0.types,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductTypeController",
      "types",
      Nil,
      "GET",
      this.prefix + """types""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductTypeController_addProductType12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types/addtype")))
  )
  private[this] lazy val controllers_ProductTypeController_addProductType12_invoker = createInvoker(
    ProductTypeController_0.addProductType,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductTypeController",
      "addProductType",
      Nil,
      "POST",
      this.prefix + """types/addtype""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductTypeController_getProductTypes13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types/gettypes")))
  )
  private[this] lazy val controllers_ProductTypeController_getProductTypes13_invoker = createInvoker(
    ProductTypeController_0.getProductTypes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductTypeController",
      "getProductTypes",
      Nil,
      "GET",
      this.prefix + """types/gettypes""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProductTypeController_delProductType14_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types/deltype")))
  )
  private[this] lazy val controllers_ProductTypeController_delProductType14_invoker = createInvoker(
    ProductTypeController_0.delProductType,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductTypeController",
      "delProductType",
      Nil,
      "DELETE",
      this.prefix + """types/deltype""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PayController_pay15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays")))
  )
  private[this] lazy val controllers_PayController_pay15_invoker = createInvoker(
    PayController_7.pay,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PayController",
      "pay",
      Nil,
      "GET",
      this.prefix + """pays""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PayController_addPay16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/addpay")))
  )
  private[this] lazy val controllers_PayController_addPay16_invoker = createInvoker(
    PayController_7.addPay,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PayController",
      "addPay",
      Nil,
      "POST",
      this.prefix + """pays/addpay""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PayController_getPays17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/getpays")))
  )
  private[this] lazy val controllers_PayController_getPays17_invoker = createInvoker(
    PayController_7.getPays,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PayController",
      "getPays",
      Nil,
      "GET",
      this.prefix + """pays/getpays""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_PayController_get18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/get/"), DynamicPart("basket_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PayController_get18_invoker = createInvoker(
    PayController_7.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PayController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """pays/get/""" + "$" + """basket_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PayController_delPay19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/delpay")))
  )
  private[this] lazy val controllers_PayController_delPay19_invoker = createInvoker(
    PayController_7.delPay,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PayController",
      "delPay",
      Nil,
      "DELETE",
      this.prefix + """pays/delpay""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_BasketController_baskets20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets")))
  )
  private[this] lazy val controllers_BasketController_baskets20_invoker = createInvoker(
    BasketController_6.baskets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "baskets",
      Nil,
      "GET",
      this.prefix + """baskets""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BasketController_addBasket21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/addbasket")))
  )
  private[this] lazy val controllers_BasketController_addBasket21_invoker = createInvoker(
    BasketController_6.addBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "addBasket",
      Nil,
      "POST",
      this.prefix + """baskets/addbasket""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_BasketController_getBaskets22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/getbaskets")))
  )
  private[this] lazy val controllers_BasketController_getBaskets22_invoker = createInvoker(
    BasketController_6.getBaskets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "getBaskets",
      Nil,
      "GET",
      this.prefix + """baskets/getbaskets""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_BasketController_get23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/get/"), DynamicPart("user_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_get23_invoker = createInvoker(
    BasketController_6.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """baskets/get/""" + "$" + """user_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_BasketController_delBasket24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/deletebasket")))
  )
  private[this] lazy val controllers_BasketController_delBasket24_invoker = createInvoker(
    BasketController_6.delBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "delBasket",
      Nil,
      "DELETE",
      this.prefix + """baskets/deletebasket""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_KeyWordController_keyWords25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords")))
  )
  private[this] lazy val controllers_KeyWordController_keyWords25_invoker = createInvoker(
    KeyWordController_5.keyWords,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeyWordController",
      "keyWords",
      Nil,
      "GET",
      this.prefix + """keyWords""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_KeyWordController_addKeyWord26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords/addkeyword")))
  )
  private[this] lazy val controllers_KeyWordController_addKeyWord26_invoker = createInvoker(
    KeyWordController_5.addKeyWord,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeyWordController",
      "addKeyWord",
      Nil,
      "POST",
      this.prefix + """keyWords/addkeyword""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_KeyWordController_getKeyWords27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords/getkeywords")))
  )
  private[this] lazy val controllers_KeyWordController_getKeyWords27_invoker = createInvoker(
    KeyWordController_5.getKeyWords,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeyWordController",
      "getKeyWords",
      Nil,
      "GET",
      this.prefix + """keyWords/getkeywords""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_KeyWordController_delKeyword28_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords/delkeyword")))
  )
  private[this] lazy val controllers_KeyWordController_delKeyword28_invoker = createInvoker(
    KeyWordController_5.delKeyword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeyWordController",
      "delKeyword",
      Nil,
      "DELETE",
      this.prefix + """keyWords/delkeyword""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_OrderController_order29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_order29_invoker = createInvoker(
    OrderController_9.order,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "order",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_OrderController_addOrder30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder30_invoker = createInvoker(
    OrderController_9.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """orders/addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_OrderController_getOrders31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/getorders")))
  )
  private[this] lazy val controllers_OrderController_getOrders31_invoker = createInvoker(
    OrderController_9.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """orders/getorders""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_OrderController_get32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/getorders/"), DynamicPart("basket_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_get32_invoker = createInvoker(
    OrderController_9.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """orders/getorders/""" + "$" + """basket_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_OrderController_delOrder33_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/delorder")))
  )
  private[this] lazy val controllers_OrderController_delOrder33_invoker = createInvoker(
    OrderController_9.delOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "delOrder",
      Nil,
      "DELETE",
      this.prefix + """orders/delorder""",
      """TODO""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_BasketProductController_basketProducts34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts")))
  )
  private[this] lazy val controllers_BasketProductController_basketProducts34_invoker = createInvoker(
    BasketProductController_2.basketProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "basketProducts",
      Nil,
      "GET",
      this.prefix + """basketproducts""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_BasketProductController_addBasketProduct35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/addbaskprod")))
  )
  private[this] lazy val controllers_BasketProductController_addBasketProduct35_invoker = createInvoker(
    BasketProductController_2.addBasketProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "addBasketProduct",
      Nil,
      "POST",
      this.prefix + """basketproducts/addbaskprod""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_BasketProductController_getBasketProducts36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/getbaskprods")))
  )
  private[this] lazy val controllers_BasketProductController_getBasketProducts36_invoker = createInvoker(
    BasketProductController_2.getBasketProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "getBasketProducts",
      Nil,
      "GET",
      this.prefix + """basketproducts/getbaskprods""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_BasketProductController_get37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/getbyid/"), DynamicPart("basket_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketProductController_get37_invoker = createInvoker(
    BasketProductController_2.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """basketproducts/getbyid/""" + "$" + """basket_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_BasketProductController_del38_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/delbasketprod/"), DynamicPart("prod_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketProductController_del38_invoker = createInvoker(
    BasketProductController_2.del(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "del",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """basketproducts/delbasketprod/""" + "$" + """prod_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_versioned39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned39_invoker = createInvoker(
    Assets_8.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_MainController_index0_route(params@_) =>
      call { 
        controllers_MainController_index0_invoker.call(MainController_1.index)
      }
  
    // @LINE:7
    case controllers_MainController_getGodPage1_route(params@_) =>
      call { 
        controllers_MainController_getGodPage1_invoker.call(MainController_1.getGodPage)
      }
  
    // @LINE:8
    case controllers_MainController_createUserPage2_route(params@_) =>
      call { 
        controllers_MainController_createUserPage2_invoker.call(MainController_1.createUserPage)
      }
  
    // @LINE:11
    case controllers_ProductController_index3_route(params@_) =>
      call { 
        controllers_ProductController_index3_invoker.call(ProductController_4.index)
      }
  
    // @LINE:12
    case controllers_ProductController_addProduct4_route(params@_) =>
      call { 
        controllers_ProductController_addProduct4_invoker.call(ProductController_4.addProduct)
      }
  
    // @LINE:13
    case controllers_ProductController_getProducts5_route(params@_) =>
      call { 
        controllers_ProductController_getProducts5_invoker.call(ProductController_4.getProducts)
      }
  
    // @LINE:14
    case controllers_ProductController_delProduct6_route(params@_) =>
      call { 
        controllers_ProductController_delProduct6_invoker.call(ProductController_4.delProduct)
      }
  
    // @LINE:17
    case controllers_OpinionController_opinions7_route(params@_) =>
      call { 
        controllers_OpinionController_opinions7_invoker.call(OpinionController_3.opinions)
      }
  
    // @LINE:18
    case controllers_OpinionController_addOpinion8_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion8_invoker.call(OpinionController_3.addOpinion)
      }
  
    // @LINE:19
    case controllers_OpinionController_getOpinions9_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinions9_invoker.call(OpinionController_3.getOpinions)
      }
  
    // @LINE:20
    case controllers_OpinionController_delOpinion10_route(params@_) =>
      call { 
        controllers_OpinionController_delOpinion10_invoker.call(OpinionController_3.delOpinion)
      }
  
    // @LINE:23
    case controllers_ProductTypeController_types11_route(params@_) =>
      call { 
        controllers_ProductTypeController_types11_invoker.call(ProductTypeController_0.types)
      }
  
    // @LINE:24
    case controllers_ProductTypeController_addProductType12_route(params@_) =>
      call { 
        controllers_ProductTypeController_addProductType12_invoker.call(ProductTypeController_0.addProductType)
      }
  
    // @LINE:25
    case controllers_ProductTypeController_getProductTypes13_route(params@_) =>
      call { 
        controllers_ProductTypeController_getProductTypes13_invoker.call(ProductTypeController_0.getProductTypes)
      }
  
    // @LINE:26
    case controllers_ProductTypeController_delProductType14_route(params@_) =>
      call { 
        controllers_ProductTypeController_delProductType14_invoker.call(ProductTypeController_0.delProductType)
      }
  
    // @LINE:28
    case controllers_PayController_pay15_route(params@_) =>
      call { 
        controllers_PayController_pay15_invoker.call(PayController_7.pay)
      }
  
    // @LINE:29
    case controllers_PayController_addPay16_route(params@_) =>
      call { 
        controllers_PayController_addPay16_invoker.call(PayController_7.addPay)
      }
  
    // @LINE:30
    case controllers_PayController_getPays17_route(params@_) =>
      call { 
        controllers_PayController_getPays17_invoker.call(PayController_7.getPays)
      }
  
    // @LINE:31
    case controllers_PayController_get18_route(params@_) =>
      call(params.fromPath[String]("basket_id", None)) { (basket_id) =>
        controllers_PayController_get18_invoker.call(PayController_7.get(basket_id))
      }
  
    // @LINE:32
    case controllers_PayController_delPay19_route(params@_) =>
      call { 
        controllers_PayController_delPay19_invoker.call(PayController_7.delPay)
      }
  
    // @LINE:34
    case controllers_BasketController_baskets20_route(params@_) =>
      call { 
        controllers_BasketController_baskets20_invoker.call(BasketController_6.baskets)
      }
  
    // @LINE:35
    case controllers_BasketController_addBasket21_route(params@_) =>
      call { 
        controllers_BasketController_addBasket21_invoker.call(BasketController_6.addBasket)
      }
  
    // @LINE:36
    case controllers_BasketController_getBaskets22_route(params@_) =>
      call { 
        controllers_BasketController_getBaskets22_invoker.call(BasketController_6.getBaskets)
      }
  
    // @LINE:37
    case controllers_BasketController_get23_route(params@_) =>
      call(params.fromPath[String]("user_id", None)) { (user_id) =>
        controllers_BasketController_get23_invoker.call(BasketController_6.get(user_id))
      }
  
    // @LINE:38
    case controllers_BasketController_delBasket24_route(params@_) =>
      call { 
        controllers_BasketController_delBasket24_invoker.call(BasketController_6.delBasket)
      }
  
    // @LINE:41
    case controllers_KeyWordController_keyWords25_route(params@_) =>
      call { 
        controllers_KeyWordController_keyWords25_invoker.call(KeyWordController_5.keyWords)
      }
  
    // @LINE:42
    case controllers_KeyWordController_addKeyWord26_route(params@_) =>
      call { 
        controllers_KeyWordController_addKeyWord26_invoker.call(KeyWordController_5.addKeyWord)
      }
  
    // @LINE:43
    case controllers_KeyWordController_getKeyWords27_route(params@_) =>
      call { 
        controllers_KeyWordController_getKeyWords27_invoker.call(KeyWordController_5.getKeyWords)
      }
  
    // @LINE:44
    case controllers_KeyWordController_delKeyword28_route(params@_) =>
      call { 
        controllers_KeyWordController_delKeyword28_invoker.call(KeyWordController_5.delKeyword)
      }
  
    // @LINE:46
    case controllers_OrderController_order29_route(params@_) =>
      call { 
        controllers_OrderController_order29_invoker.call(OrderController_9.order)
      }
  
    // @LINE:47
    case controllers_OrderController_addOrder30_route(params@_) =>
      call { 
        controllers_OrderController_addOrder30_invoker.call(OrderController_9.addOrder)
      }
  
    // @LINE:48
    case controllers_OrderController_getOrders31_route(params@_) =>
      call { 
        controllers_OrderController_getOrders31_invoker.call(OrderController_9.getOrders)
      }
  
    // @LINE:49
    case controllers_OrderController_get32_route(params@_) =>
      call(params.fromPath[String]("basket_id", None)) { (basket_id) =>
        controllers_OrderController_get32_invoker.call(OrderController_9.get(basket_id))
      }
  
    // @LINE:51
    case controllers_OrderController_delOrder33_route(params@_) =>
      call { 
        controllers_OrderController_delOrder33_invoker.call(OrderController_9.delOrder)
      }
  
    // @LINE:53
    case controllers_BasketProductController_basketProducts34_route(params@_) =>
      call { 
        controllers_BasketProductController_basketProducts34_invoker.call(BasketProductController_2.basketProducts)
      }
  
    // @LINE:54
    case controllers_BasketProductController_addBasketProduct35_route(params@_) =>
      call { 
        controllers_BasketProductController_addBasketProduct35_invoker.call(BasketProductController_2.addBasketProduct)
      }
  
    // @LINE:55
    case controllers_BasketProductController_getBasketProducts36_route(params@_) =>
      call { 
        controllers_BasketProductController_getBasketProducts36_invoker.call(BasketProductController_2.getBasketProducts)
      }
  
    // @LINE:56
    case controllers_BasketProductController_get37_route(params@_) =>
      call(params.fromPath[String]("basket_id", None)) { (basket_id) =>
        controllers_BasketProductController_get37_invoker.call(BasketProductController_2.get(basket_id))
      }
  
    // @LINE:57
    case controllers_BasketProductController_del38_route(params@_) =>
      call(params.fromPath[String]("prod_id", None)) { (prod_id) =>
        controllers_BasketProductController_del38_invoker.call(BasketProductController_2.del(prod_id))
      }
  
    // @LINE:60
    case controllers_Assets_versioned39_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned39_invoker.call(Assets_8.versioned(path, file))
      }
  }
}

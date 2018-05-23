// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/conf/routes
// @DATE:Wed May 23 00:37:17 MSK 2018

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
  // @LINE:16
  OpinionController_3: controllers.OpinionController,
  // @LINE:22
  ProductTypeController_0: controllers.ProductTypeController,
  // @LINE:26
  PayController_7: controllers.PayController,
  // @LINE:30
  BasketController_6: controllers.BasketController,
  // @LINE:34
  KeyWordController_5: controllers.KeyWordController,
  // @LINE:38
  OrderController_9: controllers.OrderController,
  // @LINE:42
  BasketProductController_2: controllers.BasketProductController,
  // @LINE:48
  Assets_8: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    MainController_1: controllers.MainController,
    // @LINE:11
    ProductController_4: controllers.ProductController,
    // @LINE:16
    OpinionController_3: controllers.OpinionController,
    // @LINE:22
    ProductTypeController_0: controllers.ProductTypeController,
    // @LINE:26
    PayController_7: controllers.PayController,
    // @LINE:30
    BasketController_6: controllers.BasketController,
    // @LINE:34
    KeyWordController_5: controllers.KeyWordController,
    // @LINE:38
    OrderController_9: controllers.OrderController,
    // @LINE:42
    BasketProductController_2: controllers.BasketProductController,
    // @LINE:48
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionController.opinions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/addopinion""", """controllers.OpinionController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/getopinions""", """controllers.OpinionController.getOpinions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types""", """controllers.ProductTypeController.types"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types/addtype""", """controllers.ProductTypeController.addProductType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """types/gettypes""", """controllers.ProductTypeController.getProductTypes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays""", """controllers.PayController.pay"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/addpay""", """controllers.PayController.addPay"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pays/getpays""", """controllers.PayController.getPays"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets""", """controllers.BasketController.baskets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/addbasket""", """controllers.BasketController.addBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """baskets/getbaskets""", """controllers.BasketController.getBaskets"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords""", """controllers.KeyWordController.keyWords"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords/addkeyword""", """controllers.KeyWordController.addKeyWord"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyWords/getkeywords""", """controllers.KeyWordController.getKeyWords"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.order"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/addorder""", """controllers.OrderController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/getorders""", """controllers.OrderController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts""", """controllers.BasketProductController.basketProducts"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/addbaskprod""", """controllers.BasketProductController.addBasketProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproducts/getbaskprods""", """controllers.BasketProductController.getBasketProducts"""),
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

  // @LINE:16
  private[this] lazy val controllers_OpinionController_opinions6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionController_opinions6_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_OpinionController_addOpinion7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/addopinion")))
  )
  private[this] lazy val controllers_OpinionController_addOpinion7_invoker = createInvoker(
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
  private[this] lazy val controllers_OpinionController_getOpinions8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/getopinions")))
  )
  private[this] lazy val controllers_OpinionController_getOpinions8_invoker = createInvoker(
    OpinionController_3.getOpinions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinions",
      Nil,
      "GET",
      this.prefix + """opinions/getopinions""",
      """here is test page""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ProductTypeController_types9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types")))
  )
  private[this] lazy val controllers_ProductTypeController_types9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_ProductTypeController_addProductType10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types/addtype")))
  )
  private[this] lazy val controllers_ProductTypeController_addProductType10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_ProductTypeController_getProductTypes11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("types/gettypes")))
  )
  private[this] lazy val controllers_ProductTypeController_getProductTypes11_invoker = createInvoker(
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
  private[this] lazy val controllers_PayController_pay12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays")))
  )
  private[this] lazy val controllers_PayController_pay12_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_PayController_addPay13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/addpay")))
  )
  private[this] lazy val controllers_PayController_addPay13_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_PayController_getPays14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pays/getpays")))
  )
  private[this] lazy val controllers_PayController_getPays14_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_BasketController_baskets15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets")))
  )
  private[this] lazy val controllers_BasketController_baskets15_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_BasketController_addBasket16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/addbasket")))
  )
  private[this] lazy val controllers_BasketController_addBasket16_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_BasketController_getBaskets17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("baskets/getbaskets")))
  )
  private[this] lazy val controllers_BasketController_getBaskets17_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_KeyWordController_keyWords18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords")))
  )
  private[this] lazy val controllers_KeyWordController_keyWords18_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_KeyWordController_addKeyWord19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords/addkeyword")))
  )
  private[this] lazy val controllers_KeyWordController_addKeyWord19_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_KeyWordController_getKeyWords20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyWords/getkeywords")))
  )
  private[this] lazy val controllers_KeyWordController_getKeyWords20_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_OrderController_order21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_order21_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_OrderController_addOrder22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder22_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_OrderController_getOrders23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/getorders")))
  )
  private[this] lazy val controllers_OrderController_getOrders23_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_BasketProductController_basketProducts24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts")))
  )
  private[this] lazy val controllers_BasketProductController_basketProducts24_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_BasketProductController_addBasketProduct25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/addbaskprod")))
  )
  private[this] lazy val controllers_BasketProductController_addBasketProduct25_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_BasketProductController_getBasketProducts26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproducts/getbaskprods")))
  )
  private[this] lazy val controllers_BasketProductController_getBasketProducts26_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned27_invoker = createInvoker(
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
  
    // @LINE:16
    case controllers_OpinionController_opinions6_route(params@_) =>
      call { 
        controllers_OpinionController_opinions6_invoker.call(OpinionController_3.opinions)
      }
  
    // @LINE:17
    case controllers_OpinionController_addOpinion7_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion7_invoker.call(OpinionController_3.addOpinion)
      }
  
    // @LINE:19
    case controllers_OpinionController_getOpinions8_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinions8_invoker.call(OpinionController_3.getOpinions)
      }
  
    // @LINE:22
    case controllers_ProductTypeController_types9_route(params@_) =>
      call { 
        controllers_ProductTypeController_types9_invoker.call(ProductTypeController_0.types)
      }
  
    // @LINE:23
    case controllers_ProductTypeController_addProductType10_route(params@_) =>
      call { 
        controllers_ProductTypeController_addProductType10_invoker.call(ProductTypeController_0.addProductType)
      }
  
    // @LINE:24
    case controllers_ProductTypeController_getProductTypes11_route(params@_) =>
      call { 
        controllers_ProductTypeController_getProductTypes11_invoker.call(ProductTypeController_0.getProductTypes)
      }
  
    // @LINE:26
    case controllers_PayController_pay12_route(params@_) =>
      call { 
        controllers_PayController_pay12_invoker.call(PayController_7.pay)
      }
  
    // @LINE:27
    case controllers_PayController_addPay13_route(params@_) =>
      call { 
        controllers_PayController_addPay13_invoker.call(PayController_7.addPay)
      }
  
    // @LINE:28
    case controllers_PayController_getPays14_route(params@_) =>
      call { 
        controllers_PayController_getPays14_invoker.call(PayController_7.getPays)
      }
  
    // @LINE:30
    case controllers_BasketController_baskets15_route(params@_) =>
      call { 
        controllers_BasketController_baskets15_invoker.call(BasketController_6.baskets)
      }
  
    // @LINE:31
    case controllers_BasketController_addBasket16_route(params@_) =>
      call { 
        controllers_BasketController_addBasket16_invoker.call(BasketController_6.addBasket)
      }
  
    // @LINE:32
    case controllers_BasketController_getBaskets17_route(params@_) =>
      call { 
        controllers_BasketController_getBaskets17_invoker.call(BasketController_6.getBaskets)
      }
  
    // @LINE:34
    case controllers_KeyWordController_keyWords18_route(params@_) =>
      call { 
        controllers_KeyWordController_keyWords18_invoker.call(KeyWordController_5.keyWords)
      }
  
    // @LINE:35
    case controllers_KeyWordController_addKeyWord19_route(params@_) =>
      call { 
        controllers_KeyWordController_addKeyWord19_invoker.call(KeyWordController_5.addKeyWord)
      }
  
    // @LINE:36
    case controllers_KeyWordController_getKeyWords20_route(params@_) =>
      call { 
        controllers_KeyWordController_getKeyWords20_invoker.call(KeyWordController_5.getKeyWords)
      }
  
    // @LINE:38
    case controllers_OrderController_order21_route(params@_) =>
      call { 
        controllers_OrderController_order21_invoker.call(OrderController_9.order)
      }
  
    // @LINE:39
    case controllers_OrderController_addOrder22_route(params@_) =>
      call { 
        controllers_OrderController_addOrder22_invoker.call(OrderController_9.addOrder)
      }
  
    // @LINE:40
    case controllers_OrderController_getOrders23_route(params@_) =>
      call { 
        controllers_OrderController_getOrders23_invoker.call(OrderController_9.getOrders)
      }
  
    // @LINE:42
    case controllers_BasketProductController_basketProducts24_route(params@_) =>
      call { 
        controllers_BasketProductController_basketProducts24_invoker.call(BasketProductController_2.basketProducts)
      }
  
    // @LINE:43
    case controllers_BasketProductController_addBasketProduct25_route(params@_) =>
      call { 
        controllers_BasketProductController_addBasketProduct25_invoker.call(BasketProductController_2.addBasketProduct)
      }
  
    // @LINE:44
    case controllers_BasketProductController_getBasketProducts26_route(params@_) =>
      call { 
        controllers_BasketProductController_getBasketProducts26_invoker.call(BasketProductController_2.getBasketProducts)
      }
  
    // @LINE:48
    case controllers_Assets_versioned27_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned27_invoker.call(Assets_8.versioned(path, file))
      }
  }
}

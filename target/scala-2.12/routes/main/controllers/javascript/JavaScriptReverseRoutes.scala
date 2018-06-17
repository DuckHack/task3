// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/task3/conf/routes
// @DATE:Sun Jun 17 17:43:07 MSK 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:17
  class ReverseOpinionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.delOpinion",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/delopinion"})
        }
      """
    )
  
    // @LINE:19
    def getOpinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.getOpinions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/getopinions"})
        }
      """
    )
  
    // @LINE:17
    def opinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.opinions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions"})
        }
      """
    )
  
    // @LINE:18
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.addOpinion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/addopinion"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseKeyWordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def keyWords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.keyWords",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords"})
        }
      """
    )
  
    // @LINE:44
    def delKeyword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.delKeyword",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords/delkeyword"})
        }
      """
    )
  
    // @LINE:43
    def getKeyWords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.getKeyWords",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords/getkeywords"})
        }
      """
    )
  
    // @LINE:42
    def addKeyWord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.addKeyWord",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords/addkeyword"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReversePayController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def pay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.pay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pays"})
        }
      """
    )
  
    // @LINE:32
    def delPay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.delPay",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/delpay"})
        }
      """
    )
  
    // @LINE:29
    def addPay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.addPay",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/addpay"})
        }
      """
    )
  
    // @LINE:30
    def getPays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.getPays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/getpays"})
        }
      """
    )
  
    // @LINE:31
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.get",
      """
        function(basket_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/get/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("basket_id", basket_id0))})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseBasketProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def basketProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.basketProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts"})
        }
      """
    )
  
    // @LINE:54
    def addBasketProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.addBasketProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/addbaskprod"})
        }
      """
    )
  
    // @LINE:55
    def getBasketProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.getBasketProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/getbaskprods"})
        }
      """
    )
  
    // @LINE:57
    def del: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.del",
      """
        function(prod_id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/delbasketprod/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("prod_id", prod_id0))})
        }
      """
    )
  
    // @LINE:56
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.get",
      """
        function(basket_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/getbyid/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("basket_id", basket_id0))})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseProductTypeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def getProductTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.getProductTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "types/gettypes"})
        }
      """
    )
  
    // @LINE:23
    def types: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.types",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "types"})
        }
      """
    )
  
    // @LINE:24
    def addProductType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.addProductType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "types/addtype"})
        }
      """
    )
  
    // @LINE:26
    def delProductType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.delProductType",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "types/deltype"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def getGodPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.getGodPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "godpage"})
        }
      """
    )
  
    // @LINE:8
    def createUserPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.createUserPage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpage"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/addproduct"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:14
    def delProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.delProduct",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "products/delproduct"})
        }
      """
    )
  
    // @LINE:13
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/getproducts"})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def order: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.order",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:47
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/addorder"})
        }
      """
    )
  
    // @LINE:48
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/getorders"})
        }
      """
    )
  
    // @LINE:49
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.get",
      """
        function(basket_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/getorders/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("basket_id", basket_id0))})
        }
      """
    )
  
    // @LINE:51
    def delOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.delOrder",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/delorder"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseBasketController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def baskets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.baskets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets"})
        }
      """
    )
  
    // @LINE:35
    def addBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.addBasket",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/addbasket"})
        }
      """
    )
  
    // @LINE:38
    def delBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.delBasket",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/deletebasket"})
        }
      """
    )
  
    // @LINE:36
    def getBaskets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.getBaskets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/getbaskets"})
        }
      """
    )
  
    // @LINE:37
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.get",
      """
        function(user_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/get/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("user_id", user_id0))})
        }
      """
    )
  
  }


}

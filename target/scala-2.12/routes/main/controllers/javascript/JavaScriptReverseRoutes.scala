// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/conf/routes
// @DATE:Wed May 23 00:37:17 MSK 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:16
  class ReverseOpinionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getOpinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.getOpinions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/getopinions"})
        }
      """
    )
  
    // @LINE:16
    def opinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.opinions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions"})
        }
      """
    )
  
    // @LINE:17
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.addOpinion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/addopinion"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseKeyWordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def keyWords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.keyWords",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords"})
        }
      """
    )
  
    // @LINE:36
    def getKeyWords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.getKeyWords",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords/getkeywords"})
        }
      """
    )
  
    // @LINE:35
    def addKeyWord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeyWordController.addKeyWord",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyWords/addkeyword"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReversePayController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addPay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.addPay",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/addpay"})
        }
      """
    )
  
    // @LINE:28
    def getPays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.getPays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pays/getpays"})
        }
      """
    )
  
    // @LINE:26
    def pay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PayController.pay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pays"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseBasketProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def addBasketProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.addBasketProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/addbaskprod"})
        }
      """
    )
  
    // @LINE:42
    def basketProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.basketProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts"})
        }
      """
    )
  
    // @LINE:44
    def getBasketProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.getBasketProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproducts/getbaskprods"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseProductTypeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getProductTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.getProductTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "types/gettypes"})
        }
      """
    )
  
    // @LINE:22
    def types: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.types",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "types"})
        }
      """
    )
  
    // @LINE:23
    def addProductType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductTypeController.addProductType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "types/addtype"})
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

  // @LINE:38
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def order: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.order",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:39
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/addorder"})
        }
      """
    )
  
    // @LINE:40
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/getorders"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseBasketController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getBaskets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.getBaskets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/getbaskets"})
        }
      """
    )
  
    // @LINE:31
    def addBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.addBasket",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets/addbasket"})
        }
      """
    )
  
    // @LINE:30
    def baskets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.baskets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "baskets"})
        }
      """
    )
  
  }


}

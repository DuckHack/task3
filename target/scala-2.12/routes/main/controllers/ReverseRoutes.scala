// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/play-products-crud-slick-master/conf/routes
// @DATE:Wed May 23 00:37:17 MSK 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:16
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getOpinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/getopinions")
    }
  
    // @LINE:16
    def opinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:17
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "opinions/addopinion")
    }
  
  }

  // @LINE:48
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class ReverseKeyWordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def keyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords")
    }
  
    // @LINE:36
    def getKeyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords/getkeywords")
    }
  
    // @LINE:35
    def addKeyWord(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "keyWords/addkeyword")
    }
  
  }

  // @LINE:26
  class ReversePayController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addPay(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pays/addpay")
    }
  
    // @LINE:28
    def getPays(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays/getpays")
    }
  
    // @LINE:26
    def pay(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays")
    }
  
  }

  // @LINE:42
  class ReverseBasketProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def addBasketProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "basketproducts/addbaskprod")
    }
  
    // @LINE:42
    def basketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts")
    }
  
    // @LINE:44
    def getBasketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts/getbaskprods")
    }
  
  }

  // @LINE:22
  class ReverseProductTypeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getProductTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "types/gettypes")
    }
  
    // @LINE:22
    def types(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "types")
    }
  
    // @LINE:23
    def addProductType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "types/addtype")
    }
  
  }

  // @LINE:6
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def getGodPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "godpage")
    }
  
    // @LINE:8
    def createUserPage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userpage")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:11
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/addproduct")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:13
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/getproducts")
    }
  
  }

  // @LINE:38
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def order(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:39
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orders/addorder")
    }
  
    // @LINE:40
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/getorders")
    }
  
  }

  // @LINE:30
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getBaskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets/getbaskets")
    }
  
    // @LINE:31
    def addBasket(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "baskets/addbasket")
    }
  
    // @LINE:30
    def baskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets")
    }
  
  }


}

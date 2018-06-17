// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/task3/conf/routes
// @DATE:Sun Jun 17 17:43:07 MSK 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:17
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delOpinion(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "opinions/delopinion")
    }
  
    // @LINE:19
    def getOpinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/getopinions")
    }
  
    // @LINE:17
    def opinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:18
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "opinions/addopinion")
    }
  
  }

  // @LINE:60
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:41
  class ReverseKeyWordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def keyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords")
    }
  
    // @LINE:44
    def delKeyword(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "keyWords/delkeyword")
    }
  
    // @LINE:43
    def getKeyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords/getkeywords")
    }
  
    // @LINE:42
    def addKeyWord(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "keyWords/addkeyword")
    }
  
  }

  // @LINE:28
  class ReversePayController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def pay(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays")
    }
  
    // @LINE:32
    def delPay(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "pays/delpay")
    }
  
    // @LINE:29
    def addPay(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pays/addpay")
    }
  
    // @LINE:30
    def getPays(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays/getpays")
    }
  
    // @LINE:31
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays/get/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
  }

  // @LINE:53
  class ReverseBasketProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def basketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts")
    }
  
    // @LINE:54
    def addBasketProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "basketproducts/addbaskprod")
    }
  
    // @LINE:55
    def getBasketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts/getbaskprods")
    }
  
    // @LINE:57
    def del(prod_id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "basketproducts/delbasketprod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prod_id", prod_id)))
    }
  
    // @LINE:56
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts/getbyid/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
  }

  // @LINE:23
  class ReverseProductTypeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def getProductTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "types/gettypes")
    }
  
    // @LINE:23
    def types(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "types")
    }
  
    // @LINE:24
    def addProductType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "types/addtype")
    }
  
    // @LINE:26
    def delProductType(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "types/deltype")
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
  
    // @LINE:14
    def delProduct(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "products/delproduct")
    }
  
    // @LINE:13
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/getproducts")
    }
  
  }

  // @LINE:46
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def order(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:47
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orders/addorder")
    }
  
    // @LINE:48
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/getorders")
    }
  
    // @LINE:49
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/getorders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
    // @LINE:51
    def delOrder(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "orders/delorder")
    }
  
  }

  // @LINE:34
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def baskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets")
    }
  
    // @LINE:35
    def addBasket(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "baskets/addbasket")
    }
  
    // @LINE:38
    def delBasket(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "baskets/deletebasket")
    }
  
    // @LINE:36
    def getBaskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets/getbaskets")
    }
  
    // @LINE:37
    def get(user_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets/get/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user_id", user_id)))
    }
  
  }


}

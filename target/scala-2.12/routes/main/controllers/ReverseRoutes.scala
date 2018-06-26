// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/task3/conf/routes
// @DATE:Fri Jun 22 20:58:04 MSK 2018

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

  // @LINE:74
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:71
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:72
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:44
  class ReverseKeyWordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def keyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords")
    }
  
    // @LINE:47
    def delKeyword(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "keyWords/delkeyword")
    }
  
    // @LINE:46
    def getKeyWords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyWords/getkeywords")
    }
  
    // @LINE:45
    def addKeyWord(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "keyWords/addkeyword")
    }
  
  }

  // @LINE:29
  class ReversePayController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def pay(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays")
    }
  
    // @LINE:33
    def delPay(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "pays/delpay")
    }
  
    // @LINE:30
    def addPay(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pays/addpay")
    }
  
    // @LINE:31
    def getPays(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays/getpays")
    }
  
    // @LINE:34
    def add(order_id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pays/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order_id", order_id)))
    }
  
    // @LINE:32
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pays/get/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
  }

  // @LINE:68
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:57
  class ReverseBasketProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def basketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts")
    }
  
    // @LINE:58
    def addBasketProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "basketproducts/addbaskprod")
    }
  
    // @LINE:59
    def getBasketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts/getbaskprods")
    }
  
    // @LINE:62
    def delByBasketId(basket_id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "basketproducts/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
    // @LINE:61
    def delByProdId(prod_id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "basketproducts/delbasketprod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prod_id", prod_id)))
    }
  
    // @LINE:63
    def add(prod_id:String, bask_id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "basketproducts/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prod_id", prod_id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("bask_id", bask_id)))
    }
  
    // @LINE:60
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproducts/getbyid/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
  }

  // @LINE:66
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:66
    def index(): Call = {
      
      Call("GET", _prefix)
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
      
      Call("GET", _prefix + { _defaultPrefix } + "main/godpage")
    }
  
    // @LINE:8
    def createUserPage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "main/userpage")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "main")
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

  // @LINE:50
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def add(basket_id:String, total:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("total", total)))
    }
  
    // @LINE:50
    def order(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:51
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orders/addorder")
    }
  
    // @LINE:52
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/getorders")
    }
  
    // @LINE:53
    def get(basket_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders/getorders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("basket_id", basket_id)))
    }
  
    // @LINE:54
    def delOrder(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "orders/delorder")
    }
  
  }

  // @LINE:36
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def baskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets")
    }
  
    // @LINE:37
    def addBasket(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "baskets/addbasket")
    }
  
    // @LINE:41
    def add(user_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user_id", user_id)))
    }
  
    // @LINE:40
    def delBasket(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "baskets/deletebasket")
    }
  
    // @LINE:38
    def getBaskets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets/getbaskets")
    }
  
    // @LINE:39
    def get(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "baskets/get/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}

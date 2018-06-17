// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andreik/studies/2d_Sem/e-buisnes/task3/conf/routes
// @DATE:Sun Jun 17 17:43:07 MSK 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

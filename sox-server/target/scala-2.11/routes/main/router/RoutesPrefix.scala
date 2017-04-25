
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kyleottmann/Documents/Westminster College/Spring 2017/CMPT 322 - Software Engineering/GIT/SoxBaseCode/server/user-api/conf/routes
// @DATE:Thu Apr 20 11:26:47 MDT 2017


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

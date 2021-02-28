// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/c18jo/IdeaProjects/Lab-2-Pub/Frontend/conf/routes
// @DATE:Sat Feb 27 19:09:44 MST 2021


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

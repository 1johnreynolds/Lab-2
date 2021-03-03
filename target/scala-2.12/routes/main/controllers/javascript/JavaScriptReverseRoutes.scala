// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab2/Lab-2-frontend/conf/routes
// @DATE:Tue Mar 02 09:53:24 CST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def query5: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query5",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query5"})
        }
      """
    )
  
    // @LINE:13
    def query3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query3"})
        }
      """
    )
  
    // @LINE:7
    def querySelectionHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.querySelectionHandler",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:15
    def query4: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query4",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query4"})
        }
      """
    )
  
    // @LINE:11
    def query2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query2"})
        }
      """
    )
  
    // @LINE:9
    def query1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query1"})
        }
      """
    )
  
    // @LINE:21
    def queryOneHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryOneHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query1Response"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}

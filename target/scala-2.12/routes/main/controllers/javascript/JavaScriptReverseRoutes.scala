// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/conf/routes
// @DATE:Fri Mar 05 20:40:28 CST 2021

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

  
    // @LINE:27
    def queryFourHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryFourHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query4Response"})
        }
      """
    )
  
    // @LINE:23
    def queryTwoHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryTwoHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query2Response"})
        }
      """
    )
  
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
  
    // @LINE:29
    def queryFiveHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryFiveHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query5Response"})
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
  
    // @LINE:31
    def partTwoQueryThree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.partTwoQueryThree",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conferenceMap"})
        }
      """
    )
  
    // @LINE:25
    def queryThreeHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryThreeHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query3Response"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
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

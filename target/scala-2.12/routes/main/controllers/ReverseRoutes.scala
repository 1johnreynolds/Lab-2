// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/conf/routes
// @DATE:Fri Mar 05 20:40:28 CST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def queryFourHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query4Response")
    }
  
    // @LINE:23
    def queryTwoHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query2Response")
    }
  
    // @LINE:17
    def query5(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query5")
    }
  
    // @LINE:13
    def query3(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query3")
    }
  
    // @LINE:7
    def querySelectionHandler(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:15
    def query4(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query4")
    }
  
    // @LINE:11
    def query2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query2")
    }
  
    // @LINE:29
    def queryFiveHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query5Response")
    }
  
    // @LINE:9
    def query1(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query1")
    }
  
    // @LINE:21
    def queryOneHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query1Response")
    }
  
    // @LINE:31
    def partTwoQueryThree(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "conferenceMap")
    }
  
    // @LINE:25
    def queryThreeHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query3Response")
    }
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}

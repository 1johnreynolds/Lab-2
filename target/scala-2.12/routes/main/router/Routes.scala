// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/c18jo/IdeaProjects/Lab-2-Pub/Frontend/conf/routes
// @DATE:Sat Feb 27 19:09:44 MST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:24
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:24
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.querySelectionHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query1""", """controllers.HomeController.query1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query2""", """controllers.HomeController.query2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query3""", """controllers.HomeController.query3()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query4""", """controllers.HomeController.query4()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query5""", """controllers.HomeController.query5()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """querySelection""", """controllers.HomeController.querySelectionHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """response""", """controllers.HomeController.queryOneHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_querySelectionHandler0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_querySelectionHandler0_invoker = createInvoker(
    HomeController_1.querySelectionHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "querySelectionHandler",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_query11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query1")))
  )
  private[this] lazy val controllers_HomeController_query11_invoker = createInvoker(
    HomeController_1.query1(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query1",
      Nil,
      "GET",
      this.prefix + """query1""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_query22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query2")))
  )
  private[this] lazy val controllers_HomeController_query22_invoker = createInvoker(
    HomeController_1.query2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query2",
      Nil,
      "GET",
      this.prefix + """query2""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_query33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query3")))
  )
  private[this] lazy val controllers_HomeController_query33_invoker = createInvoker(
    HomeController_1.query3(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query3",
      Nil,
      "GET",
      this.prefix + """query3""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_query44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query4")))
  )
  private[this] lazy val controllers_HomeController_query44_invoker = createInvoker(
    HomeController_1.query4(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query4",
      Nil,
      "GET",
      this.prefix + """query4""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_query55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query5")))
  )
  private[this] lazy val controllers_HomeController_query55_invoker = createInvoker(
    HomeController_1.query5(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query5",
      Nil,
      "GET",
      this.prefix + """query5""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_querySelectionHandler6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("querySelection")))
  )
  private[this] lazy val controllers_HomeController_querySelectionHandler6_invoker = createInvoker(
    HomeController_1.querySelectionHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "querySelectionHandler",
      Nil,
      "GET",
      this.prefix + """querySelection""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_queryOneHandler7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("response")))
  )
  private[this] lazy val controllers_HomeController_queryOneHandler7_invoker = createInvoker(
    HomeController_1.queryOneHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "queryOneHandler",
      Nil,
      "GET",
      this.prefix + """response""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_querySelectionHandler0_route(params@_) =>
      call { 
        controllers_HomeController_querySelectionHandler0_invoker.call(HomeController_1.querySelectionHandler())
      }
  
    // @LINE:9
    case controllers_HomeController_query11_route(params@_) =>
      call { 
        controllers_HomeController_query11_invoker.call(HomeController_1.query1())
      }
  
    // @LINE:11
    case controllers_HomeController_query22_route(params@_) =>
      call { 
        controllers_HomeController_query22_invoker.call(HomeController_1.query2())
      }
  
    // @LINE:13
    case controllers_HomeController_query33_route(params@_) =>
      call { 
        controllers_HomeController_query33_invoker.call(HomeController_1.query3())
      }
  
    // @LINE:15
    case controllers_HomeController_query44_route(params@_) =>
      call { 
        controllers_HomeController_query44_invoker.call(HomeController_1.query4())
      }
  
    // @LINE:17
    case controllers_HomeController_query55_route(params@_) =>
      call { 
        controllers_HomeController_query55_invoker.call(HomeController_1.query5())
      }
  
    // @LINE:19
    case controllers_HomeController_querySelectionHandler6_route(params@_) =>
      call { 
        controllers_HomeController_querySelectionHandler6_invoker.call(HomeController_1.querySelectionHandler())
      }
  
    // @LINE:21
    case controllers_HomeController_queryOneHandler7_route(params@_) =>
      call { 
        controllers_HomeController_queryOneHandler7_invoker.call(HomeController_1.queryOneHandler())
      }
  
    // @LINE:24
    case controllers_Assets_at8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_0.at(path, file))
      }
  }
}

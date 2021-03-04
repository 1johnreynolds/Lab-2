
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object query4 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q4Auth:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 4</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Query 4</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryFourHandler()),format.raw/*34.76*/("""" method="GET">
                        <h6> <b>Query 4:</b>
                            <br>Display all the authors who have published more than 10 papers in the area of SOSE to date.
                        </h6>
                        <table border="1">
                            <tr>
                                <th>Author Name</th>
                            </tr>

                        """),_display_(/*43.26*/for(authorName <- q4Auth) yield /*43.51*/{_display_(Seq[Any](format.raw/*43.52*/("""
                            """),format.raw/*44.29*/("""<tr>
                                <td>"""),_display_(/*45.38*/authorName),format.raw/*45.48*/("""</td>
                            </tr>

                        """)))}),format.raw/*48.26*/("""
                        """),format.raw/*49.25*/("""</table>
                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q4Auth:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(q4Auth)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (q4Auth) => apply(q4Auth)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-03T17:28:48.882
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/app/views/query4.scala.html
                  HASH: b016e6e1bc4f6de2a0f523779da0858ea0671947
                  MATRIX: 955->1|1070->23|2499->1427|2514->1433|2574->1472|2932->1803|2947->1809|3002->1843|3433->2247|3474->2272|3513->2273|3570->2302|3639->2344|3670->2354|3767->2420|3820->2445
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|74->43|74->43|74->43|75->44|76->45|76->45|79->48|80->49
                  -- GENERATED --
              */
          
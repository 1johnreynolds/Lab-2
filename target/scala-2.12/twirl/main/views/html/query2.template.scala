
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

object query2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q2Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 2</title>
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
                <strong>Query 2</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryTwoHandler()),format.raw/*34.75*/("""" method="GET">
                        <h6><b>Query 2:</b>
                            <br>Given a journal name and a year (volume) and an issue (number),
                            find out the metadata of all the papers published in the book
                            (means the volume+number of the journal).</h6>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="journal" name="journal" type="text" class="validate">
                                <label for="journal">Journal Name:</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="volume" name="volume" type="text" class="validate">
                                <label for="volume">Year (Volume):</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="pub_number" name="pub_number" type="text" class="validate">
                                <label for="pub_number">Issue (Number):</label>
                            </div>
                        </div>

                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
            <table border="1">
                <tr>
                    <th>Title</th>
                    <th>Mdate</th>
                    <th>Author List</th>
                    <th>Article Key</th>
                    <th>Editors</th>
                    <th>Pages</th>
                    <th>EE</th>
                    <th>Pub_url</th>
                    <th>Pub_year</th>
                    <th>Journal</th>
                    <th>Volume</th>
                    <th>Pub_number</th>
                    <th>Publisher</th>
                </tr>
                """),_display_(/*77.18*/for(paperMetadata <- q2Metadata) yield /*77.50*/{_display_(Seq[Any](format.raw/*77.51*/("""
                """),format.raw/*78.17*/("""<tr>
                    """),_display_(/*79.22*/for(curpaper <- paperMetadata) yield /*79.52*/{_display_(Seq[Any](format.raw/*79.53*/("""
                    """),format.raw/*80.21*/("""<td>"""),_display_(/*80.26*/curpaper),format.raw/*80.34*/("""</td>
                    """)))}),format.raw/*81.22*/("""
                """),format.raw/*82.17*/("""</tr>
                """)))}),format.raw/*83.18*/("""
            """),format.raw/*84.13*/("""</table>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q2Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q2Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q2Metadata) => apply(q2Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-03T22:30:10.769
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/app/views/query2.scala.html
                  HASH: 6de74880fa3d9e58d143c27994523e183be74207
                  MATRIX: 961->1|1086->33|2515->1437|2530->1443|2590->1482|2948->1813|2963->1819|3017->1852|5091->3899|5139->3931|5178->3932|5223->3949|5276->3975|5322->4005|5361->4006|5410->4027|5442->4032|5471->4040|5529->4067|5574->4084|5628->4107|5669->4120
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|108->77|108->77|108->77|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|113->82|114->83|115->84
                  -- GENERATED --
              */
          
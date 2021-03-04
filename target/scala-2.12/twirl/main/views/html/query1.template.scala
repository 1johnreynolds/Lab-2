
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

object query1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q1Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Query 1</title>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico"/>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
          integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
          crossorigin=""/>
    <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
            integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
            crossorigin=""></script>
</head>

<body>

<header class="topbar">
    <h1 class="focused" style="font-size: 37px;
                color: #57a957">
        <strong>Query 1</strong>
    </h1>
    <form action=""""),_display_(/*32.20*/routes/*32.26*/.HomeController.querySelectionHandler()),format.raw/*32.65*/("""" method="GET">
        <button id="api-search-button1" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
    </form>
</header>

<div class="row">
    <div class="card col s4 offset-s4 ">
        <div class="card-panel">
            <form action=""""),_display_(/*40.28*/routes/*40.34*/.HomeController.queryOneHandler()),format.raw/*40.67*/("""" method="GET">
                <h6><b>Query 1:</b>
                    <br>Given a paper name (i.e., title), list its publication metadata.</h6>
                <div class="row">
                    <div class="input-field col s12">

                        <input id="title" name="title" type="text" class="validate">
                        <label for="title">Publication Title:</label>
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
            <th>Book_title(Conference Name)</th>
            <th>Volume</th>
            <th>Pub_number</th>
            <th>Publisher</th>
            <th>ISBN</th>
            <th>Series</th>
            <th>Cross_ref</th>
        </tr>
        """),_display_(/*78.10*/for(paperMetadata <- q1Metadata) yield /*78.42*/{_display_(Seq[Any](format.raw/*78.43*/("""
        """),format.raw/*79.9*/("""<tr>
            """),_display_(/*80.14*/for(curpaper <- paperMetadata) yield /*80.44*/{_display_(Seq[Any](format.raw/*80.45*/("""
            """),format.raw/*81.13*/("""<td>"""),_display_(/*81.18*/curpaper),format.raw/*81.26*/("""</td>
            """)))}),format.raw/*82.14*/("""
        """),format.raw/*83.9*/("""</tr>
        """)))}),format.raw/*84.10*/("""
    """),format.raw/*85.5*/("""</table>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(q1Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q1Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q1Metadata) => apply(q1Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-03T22:30:10.717
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/app/views/query1.scala.html
                  HASH: 0f25142376439d5542d5a6306e9e02859631c801
                  MATRIX: 961->1|1086->33|2486->1408|2501->1414|2561->1453|2864->1729|2879->1735|2933->1768|4187->2995|4235->3027|4274->3028|4310->3037|4355->3055|4401->3085|4440->3086|4481->3099|4513->3104|4542->3112|4592->3131|4628->3140|4674->3155|4706->3160
                  LINES: 28->1|33->2|63->32|63->32|63->32|71->40|71->40|71->40|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|115->84|116->85
                  -- GENERATED --
              */
          
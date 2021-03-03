
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

object query2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
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

                        """),_display_(/*54.26*/if(authorizeMessage!= null)/*54.53*/{_display_(Seq[Any](format.raw/*54.54*/("""
                            """),format.raw/*55.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*56.30*/authorizeMessage),format.raw/*56.46*/("""
                            """),format.raw/*57.29*/("""</div>
                            <br>
                        """)))}),format.raw/*59.26*/("""

                        """),format.raw/*61.25*/("""<div class="row">
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

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-03T13:48:30.319
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab2/Lab-2-frontend/app/views/query2.scala.html
                  HASH: d9b67d7f962cf404ea842f310e3e286cf116d30d
                  MATRIX: 949->1|1069->28|2498->1432|2513->1438|2573->1477|2931->1808|2946->1814|3000->1847|4263->3083|4299->3110|4338->3111|4395->3140|4498->3216|4535->3232|4592->3261|4688->3326|4742->3352
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|85->54|85->54|85->54|86->55|87->56|87->56|88->57|90->59|92->61
                  -- GENERATED --
              */
          
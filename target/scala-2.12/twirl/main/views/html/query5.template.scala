
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

object query5 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Conference],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(conferences: List[Conference]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 5</title>
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
                <strong>Query 5</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryFiveHandler()),format.raw/*34.76*/("""" method="GET">
                        <h6> <b>Query 5:</b>
                            <br>Given a conference and a year, display the location where it was held.
                        </h6>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="name" name="name" type="text" class="validate">
                                <label for="name">Conference:</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="year" name="year" type="text" class="validate">
                                <label for="year">Year:</label>
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
                    <th>Conference</th>
                    <th>Year</th>
                    <th>Location</th>
                    <th>x-axis</th>
                    <th>y-axis</th>
                </tr>
                """),_display_(/*64.18*/if(conferences!=null)/*64.39*/{_display_(Seq[Any](format.raw/*64.40*/("""
                    """),_display_(/*65.22*/for(conference <- conferences) yield /*65.52*/{_display_(Seq[Any](format.raw/*65.53*/("""
                    """),format.raw/*66.21*/("""<tr>
                        <td>"""),_display_(/*67.30*/conference/*67.40*/.getName()),format.raw/*67.50*/("""</td>
                        <td>"""),_display_(/*68.30*/conference/*68.40*/.getYear()),format.raw/*68.50*/("""</td>
                        <td>"""),_display_(/*69.30*/conference/*69.40*/.getLocation()),format.raw/*69.54*/("""</td>
                        <td>"""),_display_(/*70.30*/conference/*70.40*/.getX()),format.raw/*70.47*/("""</td>
                        <td>"""),_display_(/*71.30*/conference/*71.40*/.getY()),format.raw/*71.47*/("""</td>
                    </tr>
                    """)))}),format.raw/*73.22*/("""
                """)))}),format.raw/*74.18*/("""

            """),format.raw/*76.13*/("""</table>

        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(conferences:List[Conference]): play.twirl.api.HtmlFormat.Appendable = apply(conferences)

  def f:((List[Conference]) => play.twirl.api.HtmlFormat.Appendable) = (conferences) => apply(conferences)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-06T10:53:44.769
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/app/views/query5.scala.html
                  HASH: 358c06315c87f16c38c8c8b611156dc2feed29de
                  MATRIX: 959->1|1084->33|2513->1437|2528->1443|2588->1482|2946->1813|2961->1819|3016->1853|4358->3168|4388->3189|4427->3190|4476->3212|4522->3242|4561->3243|4610->3264|4671->3298|4690->3308|4721->3318|4783->3353|4802->3363|4833->3373|4895->3408|4914->3418|4949->3432|5011->3467|5030->3477|5058->3484|5120->3519|5139->3529|5167->3536|5251->3589|5300->3607|5342->3621
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|95->64|95->64|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|104->73|105->74|107->76
                  -- GENERATED --
              */
          
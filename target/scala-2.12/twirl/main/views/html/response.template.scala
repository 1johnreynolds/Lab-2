
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

object response extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[controllers.Conference],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(confereces:List[controllers.Conference]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
          integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
          crossorigin=""/>
    <style>
      #mapid """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/("""
      """),format.raw/*10.7*/("""height: 700px;
      """),format.raw/*11.7*/("""}"""),format.raw/*11.8*/("""

    """),format.raw/*13.5*/("""</style>
    <!-- Make sure you put this AFTER Leaflet's CSS -->
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
            integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
            crossorigin="">

    </script>

    <title>OpenLayers example</title>
</head>
<body>
<h2>My Map</h2>
<div id="mapid"></div>
<script type="text/javascript">

    var mymap = L.map('mapid').setView([51.505, -0.09], 5);

    L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*30.51*/("""{"""),format.raw/*30.52*/("""id"""),format.raw/*30.54*/("""}"""),format.raw/*30.55*/("""/tiles/"""),format.raw/*30.62*/("""{"""),format.raw/*30.63*/("""z"""),format.raw/*30.64*/("""}"""),format.raw/*30.65*/("""/"""),format.raw/*30.66*/("""{"""),format.raw/*30.67*/("""x"""),format.raw/*30.68*/("""}"""),format.raw/*30.69*/("""/"""),format.raw/*30.70*/("""{"""),format.raw/*30.71*/("""y"""),format.raw/*30.72*/("""}"""),format.raw/*30.73*/("""?access_token=pk.eyJ1IjoiYmVpY2hlbmgiLCJhIjoiY2tsdjl3dTY5MHE2bDMwczU3emY1OW5vMyJ9.VVfIHxS7zO04N1trHAnEmw', """),format.raw/*30.180*/("""{"""),format.raw/*30.181*/("""
    """),format.raw/*31.5*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
        maxZoom: 10,
        id: 'mapbox/streets-v11',
        tileSize: 512,
        zoomOffset: -1,
        accessToken: 'your.mapbox.access.token'
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/(""").addTo(mymap);

    """),_display_(/*39.6*/for(conferenceList <- confereces) yield /*39.39*/{_display_(Seq[Any](format.raw/*39.40*/("""
        """),format.raw/*40.9*/("""L.marker(["""),_display_(/*40.20*/conferenceList/*40.34*/.x),format.raw/*40.36*/(""", """),_display_(/*40.39*/conferenceList/*40.53*/.y),format.raw/*40.55*/("""]).addTo(mymap).bindPopup("<b>"""),_display_(/*40.86*/conferenceList/*40.100*/.name),format.raw/*40.105*/("""</b>").openPopup();
    """)))}),format.raw/*41.6*/("""

"""),format.raw/*43.1*/("""<!--    var popup = L.popup()-->
<!--    .setLatLng([51.7, -0.09])-->
<!--    .setContent("I am a standalone popup.")-->
<!--    .openOn(mymap);-->

    var popup = L.popup();

    function onMapClick(e) """),format.raw/*50.28*/("""{"""),format.raw/*50.29*/("""
        """),format.raw/*51.9*/("""popup
            .setLatLng(e.latlng)
            .setContent("You clicked the map at " + e.latlng.toString())
            .openOn(mymap);
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""mymap.on('click', onMapClick);
</script>
</body>
</html>"""))
      }
    }
  }

  def render(confereces:List[controllers.Conference]): play.twirl.api.HtmlFormat.Appendable = apply(confereces)

  def f:((List[controllers.Conference]) => play.twirl.api.HtmlFormat.Appendable) = (confereces) => apply(confereces)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-05T16:41:37.783
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/frontend/Lab-2-frontend/app/views/response.scala.html
                  HASH: 4ec4ce0155f5765c2982c4be04512e12d795f9ee
                  MATRIX: 973->1|1108->43|1428->337|1456->338|1490->345|1538->366|1566->367|1599->373|2158->905|2187->906|2217->908|2246->909|2281->916|2310->917|2339->918|2368->919|2397->920|2426->921|2455->922|2484->923|2513->924|2542->925|2571->926|2600->927|2736->1034|2766->1035|2798->1040|3148->1363|3176->1364|3224->1386|3273->1419|3312->1420|3348->1429|3386->1440|3409->1454|3432->1456|3462->1459|3485->1473|3508->1475|3566->1506|3590->1520|3617->1525|3672->1550|3701->1552|3933->1756|3962->1757|3998->1766|4169->1910|4197->1911|4230->1917
                  LINES: 28->1|33->2|40->9|40->9|41->10|42->11|42->11|44->13|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|68->37|68->37|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|74->43|81->50|81->50|82->51|86->55|86->55|88->57
                  -- GENERATED --
              */
          
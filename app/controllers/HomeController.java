package controllers;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;



import javax.inject.Inject;
import java.io.IOException;
import java.util.concurrent.CompletionStage;

import static play.mvc.WebSocket.Json;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.querySelection.render());
    }


    public CompletionStage<Result> queryOneHandler() {
        Form<pub_info> publicationForm = formFactory.form(pub_info.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.query1.render("publication form has errors"));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorized().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
//                System.out.println(res);
//                System.out.println(res.getNodeType());
//                System.out.println(res.size());
                // add Title to session
                session("Title", publicationForm.get().getTitle());   // store Title in session for your project
                // session("Id", publicationForm.get().getId());
                // redirect to index page, to display all categories

                String query1 = "";
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    query1 += "The publication you are looking for: \n" +
//                            "PID: " + row.findValue("pid") + "\n" +
                            "Title: " + row.findValue("title") + "\n" +
                            "Mdate: " + row.findValue("mdate") + "\n" +
//                            "Author: " + row.findValue("author") + "\n" +
                            "Author list: " + row.findValue("author_list") + "\n" +
                            "Article key: " + row.findValue("article_key") + "\n" +
                            "Editors: " + row.findValue("editors") + "\n" +
                            "Pages: " + row.findValue("pages") + "\n" +
                            "ee: " + row.findValue("ee") + "\n" +
                            "Pub_url: " + row.findValue("pub_url") + "\n" +
                            "Pub_year: " + row.findValue("pub_year") + "\n" +
                            "Journal: " + row.findValue("journal") + "\n" +
                            "Book_title(Conference_name): " + row.findValue("book_title") + "\n" +
                            "Volume: " + row.findValue("volume") + "\n" +
                            "Pub_number: " + row.findValue("pub_number") + "\n" +
                            "Publisher: " + row.findValue("publisher") + "\n" +
                            "ISBN: " + row.findValue("isbn") + "\n" +
                            "Series: " + row.findValue("series") + "\n" +
                            "Cross_ref: " + row.findValue("cross_ref") + "\n";
                    System.out.println(query1);
                }
                return ok(views.html.query1.render(query1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid pub_info Title";
                return badRequest(views.html.query1.render(authorizeMessage));
            }
        }, ec.current());
    }

    /**
     * handle querySelection
     */
    public Result querySelectionHandler() {
        return ok(views.html.querySelection.render());
    }

    /**
     * handle query
     */
//    public Result queryOneHandler() {
//
//        String title = request().getQueryString("title");
//        if (title != "") {
//            return ok(views.html.response.render(title));
//        }
//        return ok("failed");
//    }

    /**
     * Query page
     */
    public Result query1() {
        return ok(views.html.query1.render(""));
    }
    public Result query2() {
        return ok(views.html.query2.render(""));
    }
    public Result query3() {
        return ok(views.html.query3.render(""));
    }
    public Result query4() {
        return ok(views.html.query4.render(""));
    }
    public Result query5() {
        return ok(views.html.query5.render(""));
    }


}
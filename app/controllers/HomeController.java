package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;



import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

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
        Form<pubClient1_1> publicationForm = formFactory.form(pubClient1_1.class).bindFromRequest();
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
                String authorizeMessage = "Invalid publication Title";
                return badRequest(views.html.query1.render(authorizeMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> queryTwoHandler() {
        Form<pubClient1_2> publicationForm = formFactory.form(pubClient1_2.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.query2.render("publication form has errors"));
        }

        return publicationForm.get().checkAuthorized().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
//                System.out.println(res);
//                System.out.println(res.getNodeType());
//                System.out.println(res.size());
                // add Title to session
                session("journal", publicationForm.get().getJournal());
                session("volume", Integer.toString(publicationForm.get().getVolume()));
                session("pub_number", Integer.toString(publicationForm.get().getPub_number()));
                // session("Id", publicationForm.get().getId());
                // redirect to index page, to display all categories

                String query2 = "";
                System.out.println("The metadata of journal you are looking for:");
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    query2 += "Title: " + row.findValue("title") + "\n" +
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
                            "Volume: " + row.findValue("volume") + "\n" +
                            "Pub_number: " + row.findValue("pub_number") + "\n" +
                            "Publisher: " + row.findValue("publisher") + "\n";
                    System.out.println(query2);
                }
                return ok(views.html.query2.render(query2));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid Title , volume or number!";
                return badRequest(views.html.query2.render(authorizeMessage));
            }
        }, ec.current());
    }


    public CompletionStage<Result> queryThreeHandler() {
        Form<pubClient1_3> publicationForm = formFactory.form(pubClient1_3.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.query3.render("Name or year form has errors"));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorized().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
//                System.out.println(res);
//                System.out.println(res.getNodeType());
//                System.out.println(res.size());
                // add Title to session
                session("author", publicationForm.get().getAuthor());
                session("pub_year", Integer.toString(publicationForm.get().getPub_year()));
                // session("Id", publicationForm.get().getId());
                // redirect to index page, to display all categories
                System.out.println("The publication you are looking for:");
                String query3 = "";
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    query3 += "The publication you are looking for: \n" +
//                            "PID: " + row.findValue("pid") + "\n" +
                            "Title: " + row.findValue("title") + "\n";
                    System.out.println(query3);
                }
                return ok(views.html.query3.render(query3));
            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid researcher name and year!";
                return badRequest(views.html.query3.render(authorizeMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> queryFourHandler() {
        Form<pubClient1_4> publicationForm = formFactory.form(pubClient1_4.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.query4.render("Author form has errors"));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorized().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
//                System.out.println(res);
//                System.out.println(res.getNodeType());
//                System.out.println(res.size());
                // add Title to session
                session("Author", publicationForm.get().getAuthor());   // store Title in session for your project
                // session("Id", publicationForm.get().getId());
                // redirect to index page, to display all categories

                String query4 = "";
                System.out.println("The author you are looking for: ");
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    query4 += "Author: " + row.findValue("author") + "\n";

                    System.out.println(query4);
                }
                return ok(views.html.query4.render(query4));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                return badRequest(views.html.query4.render(authorizeMessage));
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
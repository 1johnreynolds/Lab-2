package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import scala.util.parsing.json.JSONObject;
import scala.util.parsing.json.JSONObject$;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
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
            String authorizeMessage = "Invalid publication Title";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.query1.render(wrongMessage));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorizedQ1().thenApplyAsync((WSResponse r) -> {
            System.out.println("Body: "+ r.getBody());
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("false")) {
                JsonNode res = r.asJson();
//                System.out.println(res);
//                System.out.println(res.getNodeType());
//                System.out.println(res.size());
                // add Title to session
                session("Title", publicationForm.get().getTitle());   // store Title in session for your project
                // session("Id", publicationForm.get().getId());
                // redirect to index page, to display all categories
                List<List<String>> res1 = new ArrayList<>();
                String query1 = "";
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    //System.out.println(row.findValue("pid").asText());
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("author_list"));
                    curNode.add(""+row.findValue("article_key"));
                    curNode.add(""+row.findValue("editors"));
                    curNode.add(""+row.findValue("pages"));
                    curNode.add(""+row.findValue("ee"));
                    curNode.add(""+row.findValue("pub_url"));
                    curNode.add(""+row.findValue("pub_year"));
                    curNode.add(""+row.findValue("journal"));
                    curNode.add(""+row.findValue("book_title"));
                    curNode.add(""+row.findValue("volume"));
                    curNode.add(""+row.findValue("pub_number"));
                    curNode.add(""+row.findValue("publisher"));
                    curNode.add(""+row.findValue("isbn"));
                    curNode.add(""+row.findValue("series"));
                    curNode.add(""+row.findValue("cross_ref"));

                    String query = "The publication you are looking for: \n" +
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
                    res1.add(curNode);
                    System.out.println(query1);
                }
                return ok(views.html.query1.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.query1.render(wrongMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> queryTwoHandler() {
        Form<pubClient1_1> publicationForm = formFactory.form(pubClient1_1.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query2.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ2().thenApplyAsync((WSResponse r) -> {
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
                List<List<String>> res2 = new ArrayList<>();
                for (int i = 0; i < res.size(); i++) {
                    List<String> curList = new ArrayList<>();
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    curList.add(""+row.findValue("title"));
                    curList.add(""+row.findValue("mdate"));
                    curList.add(""+row.findValue("author_list"));
                    curList.add(""+row.findValue("article_key"));
                    curList.add(""+row.findValue("editors"));
                    curList.add(""+row.findValue("pages"));
                    curList.add(""+row.findValue("ee"));
                    curList.add(""+row.findValue("pub_url"));
                    curList.add(""+row.findValue("pub_year"));
                    curList.add(""+row.findValue("journal"));
                    curList.add(""+row.findValue("volume"));
                    curList.add(""+row.findValue("pub_number"));
                    curList.add(""+row.findValue("publisher"));

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
                    res2.add(curList);
                    System.out.println(query2);
                }
                return ok(views.html.query2.render(res2));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query2.render(wrongMessage));
            }
        }, ec.current());
    }


    public CompletionStage<Result> queryThreeHandler() {
        Form<pubClient1_1> publicationForm = formFactory.form(pubClient1_1.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query3.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ3().thenApplyAsync((WSResponse r) -> {
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
                List<List<String>> res3 = new ArrayList<>();
                System.out.println("The publication you are looking for:");
                String query3 = "";
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    List<String> curList = new ArrayList<>();
                    //System.out.println(row.findValue("pid").asText());
                    curList.add(""+row.findValue("title"));
                    query3 += "The publication you are looking for: \n" +
//                            "PID: " + row.findValue("pid") + "\n" +
                            "Title: " + row.findValue("title") + "\n";
                    System.out.println(query3);
                    res3.add(curList);
                }
                return ok(views.html.query3.render(res3));
            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query3.render(wrongMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> queryFourHandler() {
        Form<pubClient1_1> publicationForm = formFactory.form(pubClient1_1.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            List<String> wrongList = new ArrayList<>();
            wrongList.add("Author form has errors");
            return (CompletionStage<Result>) badRequest(views.html.query4.render(wrongList));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorizedQ4().thenApplyAsync((WSResponse r) -> {
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
                List<String> resA = new ArrayList<String>();
                for (int i = 0; i < res.size(); i++) {
                    //JsonObject jsonObject = new JsonParser().parse(res.get(Integer.toString(i)).toString()).getAsJsonObject();
                    //System.out.println(res.get(i));
                    JsonNode row = res.get(i);
                    //System.out.println(row.findValue("pid").asText());
                    query4 += "Author: " + row.findValue("author") + "\n";
                    resA.add(""+row.findValue("author"));
                    System.out.println(query4);
                }
                return ok(views.html.query4.render(resA));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<String> wrongError = new ArrayList<>();
                wrongError.add(authorizeMessage);
                return badRequest(views.html.query4.render(wrongError));
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
        return ok(views.html.query1.render(new ArrayList<>()));
    }
    public Result query2() {
        return ok(views.html.query2.render(new ArrayList<>()));
    }
    public Result query3() {
        return ok(views.html.query3.render(new ArrayList<>()));
    }
    public Result query4() {

        return ok(views.html.query4.render(new ArrayList<>()));
    }
    public Result query5() {
        return ok(views.html.query5.render(""));
    }


}
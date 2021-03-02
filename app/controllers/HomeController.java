package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

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
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.query1.render("publication form has errors"));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorized().thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                        JsonNode res = r.asJson();
                        // add Title to session
                        session("Title",publicationForm.get().getTitle());   // store Title in session for your project
                        //session("Id", publicationForm.get().getId());
                        // redirect to index page, to display all categories
                        return ok(views.html.query1.render("The publication you are looking for: " +"PID: "+res.get("pid").asText()+
                                " Title: " +res.get("Title").asText() +
                                " Metadata: "+ res.get("Metadata").asText()));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Invalid Publication Title";
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
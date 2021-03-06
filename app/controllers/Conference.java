package controllers;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;
public class Conference {
    private static final long serialVersionUID = 1L;

    private Long cid;

    private String name;

    private String location;

    private String year;

    private double x;

    private double y;

    public Long getID() {
        return cid;
    }

    public void setID(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getX() { return x; }

    public void setX (double x) {
        this.x = x;
    }

    public double getY() { return y; }

    public void setY (double y) {
        this.y = y;
    }

    public CompletionStage<WSResponse> checkAuthorizedQ5() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add Title
        WSRequest request = ws.url("http://localhost:9005/query5Response");
        ObjectNode res = Json.newObject();
        res.put("name", this.name);
        res.put("year", this.year);
        System.out.println(res);
        //res.put("Id", this.Id);

        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}

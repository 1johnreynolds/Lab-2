package controllers;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;
public class Conference {
    private static final long serialVersionUID = 1L;

    public Long cid;

    public String name;

    public double x;

    public double y;

}

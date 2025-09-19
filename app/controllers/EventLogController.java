package controllers;

import io.ebean.DB;
import models.EventLog;
import play.mvc.Controller;
import play.mvc.Result;

public class EventLogController extends Controller {
    public Result login(){
        EventLog eventLog = new EventLog("login");
        DB.save(eventLog);

        return ok("Login action up!");

    }

    public Result purchase(){
        EventLog eventLog = new EventLog("purchase");
        DB.save(eventLog);

        return ok("Purchase action up!");

    }

    public Result search(){
        EventLog eventLog = new EventLog("search");
        DB.save(eventLog);

        return ok("Search action up!");
    }


}

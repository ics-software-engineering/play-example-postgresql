package controllers;

import models.PageRetrieval;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  public static String homePageString = "This page has been retrieved ";

  public static Result index() {
    int retrievals = PageRetrieval.find().all().size();
    PageRetrieval newStamp = new PageRetrieval();
    newStamp.save();
    return ok(index.render(homePageString + retrievals + " times."));
  }

}

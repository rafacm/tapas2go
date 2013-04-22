package com.plexiti.samples.tapas2go.service.impl;

import com.plexiti.samples.tapas2go.model.Tapa;
import com.plexiti.samples.tapas2go.service.BarService;
import org.springframework.social.twitter.api.Tweet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitialBarService implements BarService {

  Map<String, Tapa> availableTapas = new HashMap<String, Tapa>();
  String menu;

  public InitialBarService() {
    Tapa t1 = new Tapa("aceitunas", "Olives, sometimes with a filling of anchovies or red bell pepper");
    Tapa t2 = new Tapa("chopitos", "Battered and fried tiny squid, also known as puntillitas");
    Tapa t3 = new Tapa("calamares", "Also known as rabas, these are rings of battered squid");
    availableTapas.put(t1.getName(), t1);
    availableTapas.put(t2.getName(), t2);
    availableTapas.put(t3.getName(), t3);

    menu = "Today we have: " + availableTapas.keySet().toString();
  }

  @Override
  public String todaysMenu(Tweet tweet) {
    return buildReplyForTweet(tweet, menu);
  }

  @Override
  public String invalidRequest(Tweet tweet) {
    return buildReplyForTweet(tweet, "Sorry but we cannot understand your request! Your tweet should contain the words 'menu' or 'order <tapa name> <tapa name>'. Thanks!");
  }

  private String buildReplyForTweet(Tweet tweet, String msg) {
    return "@" + tweet.getFromUser() + " " + msg;
  }

  public Tapa prepareTapa(String tapaName) {
    return availableTapas.get(tapaName);
  }
}

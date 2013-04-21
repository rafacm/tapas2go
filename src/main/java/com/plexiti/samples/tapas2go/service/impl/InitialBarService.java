package com.plexiti.samples.tapas2go.service.impl;

import com.plexiti.samples.tapas2go.model.Tapa;
import com.plexiti.samples.tapas2go.service.BarService;
import org.springframework.social.twitter.api.Tweet;

import java.util.ArrayList;
import java.util.List;

public class InitialBarService implements BarService {

  List<Tapa> availableTapas = new ArrayList<Tapa>();
  String menu;

  public InitialBarService() {
    Tapa t1 = new Tapa("aceitunas", "Olives, sometimes with a filling of anchovies or red bell pepper");
    Tapa t2 = new Tapa("chopitos", "Battered and fried tiny squid, also known as puntillitas");
    Tapa t3 = new Tapa("calamares", "Also known as rabas, these are rings of battered squid");
    availableTapas.add(t1);
    availableTapas.add(t2);
    availableTapas.add(t3);

    menu = "Today we have: aceitunas, chopitos, calamares";
  }

  @Override
  public String todaysMenu(Tweet tweet) {
    return buildReplyForTweet(tweet, menu);
  }

  @Override
  public String invalidRequest(Tweet tweet) {
    return buildReplyForTweet(tweet, "Sorry but we cannot understand your requests! Your tweet should contain the words 'menu' or 'order'. Thanks!");
  }

  private String buildReplyForTweet(Tweet tweet, String msg) {
    return "@" + tweet.getFromUser() + " " + msg;
  }
}

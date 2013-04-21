package com.plexiti.samples.tapas2go.integration;

import com.plexiti.samples.tapas2go.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import com.plexiti.samples.tapas2go.service.OrderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TweetToOrderTransformer {

  @Autowired
  OrderService orderService;

  public Order transform(Tweet tweet) {
    String text = tweet.getText();

    //List<String> tapas = Arrays.asList("aceitunas", "chopitos", "calamares");

    String removeOrderWord = text.replaceAll("order ", "");
    String[] words = removeOrderWord.split(" ");

    return orderService.newOrder(Arrays.asList(words));
  }
}

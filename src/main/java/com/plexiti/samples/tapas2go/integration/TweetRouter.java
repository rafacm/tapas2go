package com.plexiti.samples.tapas2go.integration;

import org.springframework.social.twitter.api.Tweet;

public class TweetRouter {

  public String routeIncomingTweet(Tweet tweet) {
    if (tweet.getText().contains("menu")) {
      return "twitterMenuChannel";
    }

    if (tweet.getText().contains("order")) {
      return "twitterOrdersChannel";
    }

    return "twitterInvalidMessagesChannel";
  }
}

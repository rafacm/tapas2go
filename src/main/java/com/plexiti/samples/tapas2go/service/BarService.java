package com.plexiti.samples.tapas2go.service;

import org.springframework.social.twitter.api.Tweet;

/**
 * Models a Spanish BarService where one can get real tasty tapas!
 */
public interface BarService {

  public String todaysMenu(Tweet tweet);
  public String invalidRequest(Tweet tweet);

}

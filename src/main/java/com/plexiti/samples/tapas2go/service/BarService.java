package com.plexiti.samples.tapas2go.service;

import com.plexiti.samples.tapas2go.model.Tapa;
import org.springframework.social.twitter.api.Tweet;

/**
 * Models a Spanish BarService where one can get real tasty tapas!
 */
public interface BarService {

  public String todaysMenu(Tweet tweet);
  public Tapa prepareTapa(String tapaName);
  public String invalidRequest(Tweet tweet);
}

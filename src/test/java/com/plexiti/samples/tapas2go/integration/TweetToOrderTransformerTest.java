package com.plexiti.samples.tapas2go.integration;

import com.plexiti.samples.tapas2go.service.OrderService;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TweetToOrderTransformerTest {

  OrderService mockedOrderService = mock(OrderService.class);
  TweetToOrderTransformer transformer = new TweetToOrderTransformer();

  @Before
  public void setUp() {
    transformer.setOrderService(mockedOrderService);
  }

  @Test
  public void testParseCorrectTweetOrder() {
    String tweet = "@Tapas2Go order calamares aceitunas";
    transformer.transform(tweet);

    List<String> tapas = Arrays.asList("calamares", "aceitunas");

    verify(mockedOrderService).newOrder(tapas);
  }
}

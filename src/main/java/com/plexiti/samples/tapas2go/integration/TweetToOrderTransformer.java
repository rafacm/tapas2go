package com.plexiti.samples.tapas2go.integration;

import com.plexiti.samples.tapas2go.model.Order;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.plexiti.samples.tapas2go.service.OrderService;

import java.util.Arrays;

public class TweetToOrderTransformer {

  private static final Logger LOGGER = Logger.getLogger(TweetToOrderTransformer.class);

  @Autowired
  OrderService orderService;

  public Order transform(String tweet) {
    /*
     * We're not interested in the words '@Tapas2Go' and 'order'. It's just a marker!
     */
    String[] words = tweet.replaceFirst("@Tapas2Go ", "").replaceFirst("order ", "").split(" ");

    return orderService.newOrder(Arrays.asList(words));
  }

  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }
}

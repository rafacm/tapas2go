package com.plexiti.samples.tapas2go.integration;

import com.plexiti.samples.tapas2go.model.Order;
import com.plexiti.samples.tapas2go.model.OrderItem;
import org.springframework.integration.annotation.Splitter;

import java.util.List;

public class OrderSplitter {

  public List<OrderItem> split(Order order) {
    return order.getItems();
  }
}
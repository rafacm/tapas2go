package com.plexiti.samples.tapas2go.service.impl;

import com.plexiti.samples.tapas2go.model.Order;
import com.plexiti.samples.tapas2go.service.OrderService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InitialOrderService implements OrderService {

  private static AtomicInteger orderNumer = new AtomicInteger(0);

  @Override
  public Order newOrder(List<String> tapas) {
    Order o = new Order(orderNumer.incrementAndGet());
    for(String tapaName: tapas) {
      o.addItem(tapaName);
    }

    return o;
  }
}

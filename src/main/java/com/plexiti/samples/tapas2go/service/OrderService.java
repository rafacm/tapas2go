package com.plexiti.samples.tapas2go.service;

import com.plexiti.samples.tapas2go.model.Order;

import java.util.List;

public interface OrderService {
  public Order newOrder(List<String> tapas);
}

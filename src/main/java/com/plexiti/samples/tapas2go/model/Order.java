package com.plexiti.samples.tapas2go.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<OrderItem> items = new ArrayList<OrderItem>();

  /** the order number used for tracking */
  private int number;

  // Default constructor required by Jackson Java JSON-processor
  public Order() {}

  public Order(int number) {
    this.number = number;
  }

  public void addItem(String tapaName) {
    OrderItem item = new OrderItem(tapaName);
    items.add(item);
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public List<OrderItem> getItems() {
    return items;
  }
}

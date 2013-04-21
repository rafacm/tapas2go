package com.plexiti.samples.tapas2go.model;

public class OrderItem {
  private String tapaName;

  public OrderItem() {}

  public OrderItem(String tapaName) {
    this.tapaName = tapaName;
  }

  public String getTapaName() {
    return tapaName;
  }

  public void setTapaName(String tapaName) {
    this.tapaName = tapaName;
  }
}

package com.plexiti.samples.tapas2go.model;

/**
 * Models a Tapa (Spanish appetizer)
 *
 * Content lifted from Wikipedia: http://en.wikipedia.org/wiki/List_of_tapas
 */
public class Tapa {

  private String name;
  private String description;
  private String imageUrl;

  // Default constructor required by Jackson Java JSON-processor
  public Tapa() {}

  public Tapa(String name, String description, String imageUrl) {
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public String toString() {
    return "Tapa{" +
      "name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", imageUrl='" + imageUrl + '\'' +
      '}';
  }
}

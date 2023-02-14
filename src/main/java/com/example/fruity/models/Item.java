package com.example.fruity.models;

import org.springframework.web.bind.annotation.RequestMapping;

public class Item {

  // MEMBER VARIABLES
  private String name;
  private double price;

  // CONSTRUCTOR
  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
  // As always, don't forget to generate Getters and Setters!
}

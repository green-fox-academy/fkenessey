package com.greenfoxacademy.pallidaretake.models.DTOs;

public class ShoppingBasketDTO {

  private String itemName;
  private String size;
  private int quantity;

  public ShoppingBasketDTO() {
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

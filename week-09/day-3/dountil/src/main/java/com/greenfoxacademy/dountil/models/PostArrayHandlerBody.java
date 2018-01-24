package com.greenfoxacademy.dountil.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PostArrayHandlerBody extends ArrayHandler{
  @JsonIgnore
  private String what;
  @JsonIgnore
  private int[] numbers;
  private int result;

  public PostArrayHandlerBody() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

package com.greenfoxacademy.frontend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PostArrayHandlerArrayBody extends ArrayHandler {

  @JsonIgnore
  private String what;
  @JsonIgnore
  private int[] numbers;
  private int[] result;

  public PostArrayHandlerArrayBody() {
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}

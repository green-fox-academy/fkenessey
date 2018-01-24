package com.greenfoxacademy.frontend.models;

public class PostDoUntilBody implements Body{

  //@JsonIgnore
  public Integer until;

  //@JsonProperty("result_sum")
  public int result;

  public PostDoUntilBody() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

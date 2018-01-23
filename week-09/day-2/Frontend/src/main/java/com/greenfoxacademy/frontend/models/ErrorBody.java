package com.greenfoxacademy.frontend.models;

public class ErrorBody implements Body {

  private String error;

  public ErrorBody() {
    this.error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

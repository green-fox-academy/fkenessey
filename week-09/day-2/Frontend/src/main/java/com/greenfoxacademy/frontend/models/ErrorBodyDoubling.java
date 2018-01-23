package com.greenfoxacademy.frontend.models;

public class ErrorBodyDoubling implements Body {

  private String error;

  public ErrorBodyDoubling() {
    this.error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

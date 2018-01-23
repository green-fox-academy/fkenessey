package com.greenfoxacademy.frontend.models;

public class ErrorBodyGreeterName implements Body{

  private String error;

  public ErrorBodyGreeterName() {
    this.error = "Please provide a name!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

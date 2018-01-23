package com.greenfoxacademy.frontend.models;

public class ErrorBodyGreeterTitle implements Body{

  private String error;

  public ErrorBodyGreeterTitle() {
    this.error = "Please provide a title!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

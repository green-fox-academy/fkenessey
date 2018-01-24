package com.greenfoxacademy.dountil.models;

public class ErrorGeneral implements Body{

  private String error;

  public ErrorGeneral(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

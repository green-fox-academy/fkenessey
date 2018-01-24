package com.greenfoxacademy.dountil.models;

import javax.validation.constraints.NotNull;

public class GetResponseBody implements Body{

  @NotNull
  private String received;
  private String result;

  public GetResponseBody() {
  }

  public GetResponseBody(String received) {
    this.received = received;
    this.result = String.valueOf(Integer.valueOf(received) * 2);
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}

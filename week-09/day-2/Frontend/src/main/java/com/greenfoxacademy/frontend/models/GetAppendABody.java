package com.greenfoxacademy.frontend.models;

public class GetAppendABody implements Body{

  private String toAppend;
  private String appended;

  public GetAppendABody(String toAppend) {
    this.toAppend = toAppend;
    this.appended = toAppend + "a";
  }

  public String getToAppend() {
    return toAppend;
  }

  public void setToAppend(String toAppend) {
    this.toAppend = toAppend;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}

package com.greenfoxacademy.dountil.models.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SithReverserDto {

  @JsonProperty(value = "sith_text")
  private String sithText;

  public SithReverserDto() {
  }

  public SithReverserDto(String sithText) {
    this.sithText = sithText;
  }

  public String getSithText() {
    return sithText;
  }

  public void setSithText(String sithText) {
    this.sithText = sithText;
  }
}

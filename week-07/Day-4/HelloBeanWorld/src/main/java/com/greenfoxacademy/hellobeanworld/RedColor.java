package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

public class RedColor implements MyColor {

  public String printColor() {
    return "It is red in color...";
  }
}

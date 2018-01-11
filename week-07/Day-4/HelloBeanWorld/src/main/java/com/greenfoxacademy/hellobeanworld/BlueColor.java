package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

  public String printColor() {
    return "It is blue in color...";
  }
}

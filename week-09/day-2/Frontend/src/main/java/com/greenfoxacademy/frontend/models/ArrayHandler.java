package com.greenfoxacademy.frontend.models;

public class ArrayHandler implements Body {
  private String what;
  private int[] numbers;

  public ArrayHandler() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}

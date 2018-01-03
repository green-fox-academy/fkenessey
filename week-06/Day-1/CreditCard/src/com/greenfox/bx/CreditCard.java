package com.greenfox.bx;

import java.util.List;

public class CreditCard implements CreditCardy{

  private static int counter = 0;

  @Override
  public int getSumCVV() {
    return (int)(Math.random() * 100);
  }

  @Override
  public String getNameCardholder() {
    String outputName = "ABC";
    outputName += counter++;
    return outputName;
  }

  @Override
  public String getCodeAccount() {
    String outputCodeAccount = "";
    for (int i = 0; i < 16; i++) {
      outputCodeAccount += (int)(Math.random() * 10);
    }
    return outputCodeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return 0;
  }
}


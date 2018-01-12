package com.greenfoxacademy.usefulutilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  private ArrayList<String> colors;
  private Random random;
  private String bColour;
  private String emailAddress;
  private boolean validEmail;
  private String ceasarText;
  private int ceasarNum;
  String caesarCoded;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
    bColour = "white";
    validEmail = true;
    caesarCoded = "Waiting for submission...";
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public void bColourRandomizer(){
    bColour = randomColor();
  }

  public void validateEmail(String inputLink) {
    if (inputLink.contains("@") && inputLink.contains(".")){
      setEmailAddress(inputLink + " is a valid email address");
      setValidEmail(true);
    } else {
      setEmailAddress(inputLink + " is not a valid email address");
      setValidEmail(false);
    }
  }

  public void caesar(String text, int number) {
    String result = "";
    for(int i = 0; i < text.length(); i++) {
      result += (char)((int)text.charAt(i) + number);
    }
    caesarCoded = result;
  }

  public void initialiseEmailAddress() {
    setEmailAddress("Enter Email");
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public boolean isValidEmail() {
    return validEmail;
  }

  public void setValidEmail(boolean validEmail) {
    this.validEmail = validEmail;
  }

  public String getCeasarText() {
    return ceasarText;
  }

  public void setCeasarText(String ceasarText) {
    this.ceasarText = ceasarText;
  }

  public int getCeasarNum() {
    return ceasarNum;
  }

  public void setCeasarNum(int ceasarNum) {
    this.ceasarNum = ceasarNum;
  }

  public String getbColour() {
    return bColour;
  }

  public void setbColour(String bColour) {
    this.bColour = bColour;
  }

  public String getCaesarCoded() {
    return caesarCoded;
  }

  public void setCaesarCoded(String caesarCoded) {
    this.caesarCoded = caesarCoded;
  }
}

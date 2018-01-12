package com.greenfoxacademy.usefulutilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;
  String emailAddress;
  boolean validEmail;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
    validEmail = true;
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
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
}

package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

  private String name;
  private float balance;
  private String animalType;
  private boolean king;
  private String affiliation;

  public BankAccount() {
  }

  public BankAccount(String name, float balance, String animalType, boolean king, String affiliation) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.affiliation = affiliation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public String getAffiliation() {
    return affiliation;
  }

  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }
}

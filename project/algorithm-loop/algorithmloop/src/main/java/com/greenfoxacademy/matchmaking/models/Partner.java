package com.greenfoxacademy.matchmaking.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partner")
public class Partner extends User {

  @Column(name = "company_name", nullable = false)
  private String companyName;

  public Partner() {
  }

  public Partner(String companyName) {
    this.companyName = companyName;
  }

  public Partner(String email,  String companyName) {
    super(email);
    this.companyName = companyName;
  }

  public Partner(String email, String phoneNumber, String companyName) {
    super(email, phoneNumber);
    this.companyName = companyName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Override
  public String toString() {
    return  "Partner{ id : " + this.id
            + ", Company name : " + this.companyName
            + ", Email : " + this.email
            + ", Phone Number : " + this.phoneNumber
            + " }";
  }

}

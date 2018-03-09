package com.greenfoxacademy.matchmaking.models;

import com.greenfoxacademy.matchmaking.models.Enums.Status;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static com.greenfoxacademy.matchmaking.models.Enums.Status.ACTIVE;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  protected String id;
  @Column(nullable = false)
  protected String email;
  protected String phoneNumber;
  @Column(name = "status")
  @Enumerated(value = EnumType.STRING)
  protected Status status;
  protected String matchedUserId;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  protected List<Preference> preferences;

  public User() {
    this.id = UUID.randomUUID().toString();
    this.status = ACTIVE;
    this.matchedUserId = null;
  }

  public User(String email) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
    this.status = ACTIVE;
    this.matchedUserId = null;
  }

  public User(String email, String phoneNumber) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.status = ACTIVE;
    this.matchedUserId = null;
  }



  public String getId() {
    return this.id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Preference> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<Preference> preferences) {
    this.preferences = preferences;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getMatchedUserId() {
    return matchedUserId;
  }

  public void setMatchedUserId(String matchedUserId) {
    this.matchedUserId = matchedUserId;
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == this) return true;

    if (!(obj instanceof User)) return false;

    User userToCompare = (User) obj;

    return Objects.equals(id, userToCompare.id) &&
            Objects.equals(email, userToCompare.email) &&
            Objects.equals(phoneNumber, userToCompare.phoneNumber) &&
            Objects.equals(matchedUserId, userToCompare.matchedUserId) &&
            Objects.equals(status, userToCompare.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, phoneNumber, status, matchedUserId);
  }
}

package com.greenfoxacademy.matchmaking.models;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class Preference {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private int ranking;
  @Column(name = "selection_id")
  private String selectionId;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public Preference() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(String selectionId) {
    this.selectionId = selectionId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}

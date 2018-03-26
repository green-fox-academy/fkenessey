package com.greenfoxacademy.matchmaking.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "preference")
public class Preference {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Integer ranking;
  @Column(name = "selection_id")
  private String selectionId;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public Preference() {
  }

  public Preference(int ranking, String selectionId, User user) {
    this.ranking = ranking;
    this.selectionId = selectionId;
    this.user = user;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
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

  @Override
  public boolean equals(Object obj) {

    if (obj == this) return true;

    if (!(obj instanceof Preference)) return false;

    Preference preferenceToCompare = (Preference) obj;

    return id == preferenceToCompare.id &&
            ranking == preferenceToCompare.ranking &&
            Objects.equals(selectionId, preferenceToCompare.selectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ranking, selectionId);
  }
}

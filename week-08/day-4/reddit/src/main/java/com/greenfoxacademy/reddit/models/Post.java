package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "posts")
public class Post {

  @Id
  @Column(name = "post_id")
  @GeneratedValue
  private long id;
  private int score;
  private String content;
  private int perClickScoreChangeAmount = 1;
  private String postCreationDate = String.valueOf(LocalDate.now());

  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getPerClickScoreChangeAmount() {
    return perClickScoreChangeAmount;
  }

  public void setPerClickScoreChangeAmount(int perClickScoreChangeAmount) {
    this.perClickScoreChangeAmount = perClickScoreChangeAmount;
  }

  public String getPostCreationDate() {
    return postCreationDate;
  }

  public void setPostCreationDate(String postCreationDate) {
    this.postCreationDate = postCreationDate;
  }
}

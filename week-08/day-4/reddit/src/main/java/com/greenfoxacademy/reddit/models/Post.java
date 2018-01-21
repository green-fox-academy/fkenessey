package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

  @Id
  @Column(name = "post_id")
  @GeneratedValue
  private long id;
  private int score;
  private String content;

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
}

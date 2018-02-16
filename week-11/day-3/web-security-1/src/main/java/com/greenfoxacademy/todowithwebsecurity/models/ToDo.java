package com.greenfoxacademy.todowithwebsecurity.models;

import javax.persistence.*;
import java.time.LocalDate;

  @Entity
  @Table(name = "todos")
  public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    private String createdAtString = String.valueOf(LocalDate.now());

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_name")
    private SiteUser siteUser;

    public ToDo() {
    }

    public ToDo(String title, SiteUser siteUser) {
      this.id = id;
      this.title = title;
      this.isUrgent = false;
      this.isDone = false;
      this.siteUser = siteUser;
      this.createdAtString = createdAtString;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public boolean getIsUrgent() {
      return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
      isUrgent = urgent;
    }

    public boolean getIsDone() {
      return isDone;
    }

    public void setIsDone(boolean done) {
      isDone = done;
    }

    public boolean isUrgent() {
      return isUrgent;
    }

    public void setUrgent(boolean urgent) {
      isUrgent = urgent;
    }

    public boolean isDone() {
      return isDone;
    }

    public void setDone(boolean done) {
      isDone = done;
    }

    public SiteUser getSiteUser() {
      return siteUser;
    }

    public void setSiteUser(SiteUser siteUser) {
      this.siteUser = siteUser;
    }

    public String getCreatedAtString() {
      return createdAtString;
    }

    public void setCreatedAtString(String createdAtString) {
      this.createdAtString = createdAtString;
    }
  }
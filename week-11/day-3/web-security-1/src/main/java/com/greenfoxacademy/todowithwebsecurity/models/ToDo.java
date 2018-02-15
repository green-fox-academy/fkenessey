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
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;

    public ToDo() {
    }

    public ToDo(String title, Assignee assignee) {
      this.id = id;
      this.title = title;
      this.isUrgent = false;
      this.isDone = false;
      this.assignee = assignee;
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

    public Assignee getAssignee() {
      return assignee;
    }

    public void setAssignee(Assignee assignee) {
      this.assignee = assignee;
    }

    public String getCreatedAtString() {
      return createdAtString;
    }

    public void setCreatedAtString(String createdAtString) {
      this.createdAtString = createdAtString;
    }
  }
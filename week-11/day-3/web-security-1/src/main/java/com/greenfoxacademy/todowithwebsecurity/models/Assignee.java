package com.greenfoxacademy.todowithwebsecurity.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String email;
  private String userName;
  private String userPassword;
  private boolean checkedIn;
  private boolean topUser;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "assignee")
  private List<ToDo> todos = new ArrayList<>();

  public Assignee() {
  }

  public Assignee(String userName, String email, String userPassword) {
    this.userName = userName;
    this.email = email;
    this.userPassword = userPassword;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<ToDo> getTodos() {
    return todos;
  }

  public void setTodos(List<ToDo> todos) {
    this.todos = todos;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public boolean isCheckedIn() {
    return checkedIn;
  }

  public void setCheckedIn(boolean checkedIn) {
    this.checkedIn = checkedIn;
  }

  public boolean isTopUser() {
    return topUser;
  }

  public void setTopUser(boolean topUser) {
    this.topUser = topUser;
  }

  }

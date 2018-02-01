package com.greenfoxacademy.practise1;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  
  @OneToOne
  @JoinColumn(name = "linked_teacher")
  Teacher teacher;

  public Student() {
  }

  public Student(String name, Teacher teacher) {
    this.name = name;
    this.teacher = teacher;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
}

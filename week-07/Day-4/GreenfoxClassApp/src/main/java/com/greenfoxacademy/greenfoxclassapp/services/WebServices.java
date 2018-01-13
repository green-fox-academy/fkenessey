package com.greenfoxacademy.greenfoxclassapp.services;

import com.greenfoxacademy.greenfoxclassapp.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebServices {

  private List<Student> studentList;

  public WebServices() {
    studentList = new ArrayList<>();
    studentList.add(new Student("Sanyi"));
    studentList.add(new Student("Lilla"));
    studentList.add(new Student("John"));
  }

  public List<String> findAll() {
    List<String> namesList = new ArrayList<>();
    for (Student students : studentList) {
      namesList.add(students.getName());
    }
    return namesList;
  }

  public void save(String newName) {
    studentList.add(new Student(newName));
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(List<Student> studentList) {
    this.studentList = studentList;
  }
}

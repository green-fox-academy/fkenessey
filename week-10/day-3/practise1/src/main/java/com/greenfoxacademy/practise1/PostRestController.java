package com.greenfoxacademy.practise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

  @Autowired
  studentRep rep;

  @PostMapping("/")
  public void putStudent(@RequestBody Student student) {
    Student student1 = new Student();
    student1.setName(student.getName());
    student1.setTeacher(student.getTeacher());
    rep.save(student1);
  }
}

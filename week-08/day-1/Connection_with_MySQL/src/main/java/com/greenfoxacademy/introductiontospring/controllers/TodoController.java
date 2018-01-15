package com.greenfoxacademy.introductiontospring.controllers;

import com.greenfoxacademy.introductiontospring.models.Todo;
import com.greenfoxacademy.introductiontospring.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  ToDoRepository repo;

  @RequestMapping(value = {"/", "/list"})

  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive){
    List<Todo> repoList = new ArrayList<>();
    repo.findAll().forEach(repoList::add);
    if (isActive){
      for (int i = 0; i < repoList.size(); i++) {
        if (repoList.get(i).isDone()){
          repoList.remove(i);
        }
      }
    }
    model.addAttribute("repoList", repoList);
    return "newtodo";
  }
}

package com.greenfoxacademy.listingtodosh2.controllers;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import com.greenfoxacademy.listingtodosh2.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  ToDoRepository repo;

  @RequestMapping(value = {"/", "/list"})

  public String list(Model model){

    List<Todo> repoList = new ArrayList<>();
    repo.findAll().forEach(repoList::add);
    model.addAttribute("repoList", repoList);

    return "todo";
  }
}

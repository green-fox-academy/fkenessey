package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

  @Autowired
  WebServices s;

  @GetMapping("/gfa")
  public String showLinks(){
    return "homepage";
  }

  @GetMapping("/gfa/list")
  public String showAll(Model model){
    model.addAttribute("studentList", s.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String showAddOne(Model model){
    String newName = "";
    model.addAttribute("newName", newName);
    return "add";
  }

  @PostMapping("/gfa/add")
  public String addOne(@ModelAttribute("newName") String newName, BindingResult errors, Model model){
    s.save(newName);
    return "add";
  }
}

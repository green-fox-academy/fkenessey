package com.greenfoxacademy.todowithwebsecurity.controllers;

import com.greenfoxacademy.todowithwebsecurity.models.ToDo;
import com.greenfoxacademy.todowithwebsecurity.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class WebToDoController {

  @Autowired
  WebService webService;

  @GetMapping("/add")
  public String addToDo(@CookieValue(value = "userName", defaultValue = "NotValid") String userNameFromCookie, Model model){
    if (webService.isCorrectCookie(userNameFromCookie)) {
      ToDo toDo = new ToDo();
      model.addAttribute("newTodo", toDo);
      return "addtodo";
    } else {
      return "redirect:/login";
    }

  }

  @PostMapping("/add")
  public String postAddToDo(@CookieValue(value = "userName", defaultValue = "NotValid") String userNameFromCookie,
                            @ModelAttribute ToDo newToDo) {
    if (webService.isCorrectCookie(userNameFromCookie)) {
      newToDo.setSiteUser(webService.findSiteUserByUserName(userNameFromCookie));
      webService.saveNewToDo(newToDo);
      return "redirect:/";
    } else {
      return "redirect:/login";
    }
  }
}

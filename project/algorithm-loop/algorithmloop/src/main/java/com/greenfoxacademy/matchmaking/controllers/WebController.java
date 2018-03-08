package com.greenfoxacademy.matchmaking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class WebController {

  @GetMapping("/")
  public String getHome(Principal principal, Model model) {
      model.addAttribute("principal", principal);
      return "index";
  }

  @GetMapping("/admin")
  public String getAdminPage(Principal principal, Model model) {
      model.addAttribute("principal", principal);
      return "admin";
  }

  @PostMapping("/sendNotification")
  public String sendNotification() {
    //TODO: implement functions to send out emails to Partners and send link through slack to Apprentices
    return "redirect:/admin";
  }
}

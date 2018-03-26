package com.greenfoxacademy.matchmaking.controllers;

import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.services.AlgorithmService;
import com.greenfoxacademy.matchmaking.services.SlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class WebController {

  @Autowired
  SlackService slackService;
  @Autowired
  ApprenticeRepository apprenticeRepository;
  @Autowired
  PartnerRepository partnerRepository;
  @Autowired
  AlgorithmService algorithmService;

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

  @GetMapping("/test")
  public String showTest(Model model) {
    algorithmService.matchmaker();
    model.addAttribute("partnerList", partnerRepository.findAll());
    model.addAttribute("apprenticeList", apprenticeRepository);
    return "test";
  }
}

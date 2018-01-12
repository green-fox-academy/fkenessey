package com.greenfoxacademy.usefulutilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

  @Autowired
  UtilityService u;

  @GetMapping(value = "/useful")
  public String home(Model model){
    u.initialiseEmailAddress();
    model.addAttribute("colour", "white");
    model.addAttribute("inputLink",  u.getEmailAddress());
    model.addAttribute("valid", u.isValidEmail());
    return "homepage";
  }

  @RequestMapping(value = "/useful/colored", method = RequestMethod.POST)
  public String colored(Model model){
    String input = u.randomColor();
    model.addAttribute("colour", input);
    return "homepage";
  }

  @RequestMapping(value = "/useful/email", method = RequestMethod.POST)
  public String email(@ModelAttribute(value = "inputLink") String inputLink, Model model){
    u.validateEmail(inputLink);
    model.addAttribute("colour", "white");
    model.addAttribute("inputLink",  u.getEmailAddress());
    model.addAttribute("valid", u.isValidEmail());
    return "homepage";
  }
}

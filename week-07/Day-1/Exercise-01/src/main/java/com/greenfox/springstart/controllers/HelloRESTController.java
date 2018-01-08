package com.greenfox.springstart.controllers;

import com.greenfox.springstart.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greetingMethod(Model model, @RequestParam(value = "name", required = false) String name) {
    Greeting greeting = new Greeting(1, "Hello, " + name);
    return greeting;
  }
}

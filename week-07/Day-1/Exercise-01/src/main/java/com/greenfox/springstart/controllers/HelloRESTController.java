package com.greenfox.springstart.controllers;

import com.greenfox.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping()
  public Greeting greetingMethod() {
    return new Greeting(1, "Hello, World!");
  }
}

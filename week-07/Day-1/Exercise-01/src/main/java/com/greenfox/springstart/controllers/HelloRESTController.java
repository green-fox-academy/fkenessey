package com.greenfox.springstart.controllers;

import com.greenfox.springstart.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong(0);

  @RequestMapping(value = "/greeting")
  public Greeting greetingMethod(Model model, @RequestParam(value = "name", required = false) String name) {
    Greeting greeting = new Greeting(counter.addAndGet(1), "Hello, " + name);
    return greeting;
  }
}

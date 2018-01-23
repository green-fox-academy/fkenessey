package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Body;
import com.greenfoxacademy.frontend.models.GetResponseBody;
import com.greenfoxacademy.frontend.services.GetResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  GetResponseService getResponseService;

  @GetMapping("/doubling")
  public Body responseEditor(@RequestParam(value = "input", required = false) String input) {

    if (input != null) {
      return getResponseService.sendResult(input);
    } else {
      return getResponseService.sendErrorNullError();
    }

  }
}

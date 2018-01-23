package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Body;
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
  public Body responseEditorDoubling(@RequestParam(value = "input", required = false) String input) {

    if (input != null) {
      return getResponseService.sendResultDoubling(input);
    } else {
      return getResponseService.sendErrorNullDoubling();
    }
  }

  @GetMapping("/greeter")
  public Body responseEditorGreeter(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "title", required = false) String title) {

    if (name != null && title != null) {
      return getResponseService.sendResultGreeter(name, title);
    } else if (name == null) {
      return getResponseService.sendErrorNullName();
    } else {
      return getResponseService.sendErrorNullTitle();
    }
  }
}

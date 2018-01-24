package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.ArrayHandler;
import com.greenfoxacademy.frontend.models.Body;
import com.greenfoxacademy.frontend.models.PostDoUntilBody;
import com.greenfoxacademy.frontend.services.GetResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/appenda/{appendable}")
  public Body responseEditorAppend(@PathVariable("appendable") String appendableInput) {
    if (appendableInput != null) {
      return getResponseService.sendResultAppendA(appendableInput);
    } else {
      return null;
    }
  }

  @PostMapping("/dountil/{what}")
  public Body responseEditorDoUntil(@PathVariable(value = "what", required = false) String what,
                                    @RequestBody(required = false) PostDoUntilBody body) {
    if (body != null) {
      return getResponseService.sendResultDoUntil(what, body);
    } else {
      return getResponseService.sendDoUntilBodyError();
    }

  }

  @PostMapping("/arrays")
  public Object responseEditorHandler(@RequestBody ArrayHandler inputArrayObject) {
    if (inputArrayObject != null) {
      return getResponseService.sendResultArrayHandler(inputArrayObject);
    } else {
      return getResponseService.sendArrayHandlerError();
    }
  }
}

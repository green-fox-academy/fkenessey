package com.greenfoxacademy.dountil.controllers;

import com.greenfoxacademy.dountil.models.*;
import com.greenfoxacademy.dountil.services.GetResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @Autowired
  GetResponseService getResponseService;

  @GetMapping("/doubling")
  public ResponseEntity<?> responseEditorDoubling(@RequestParam(value = "input", required = false) String input) {

    if (input != null) {
      getResponseService.newLogAdder("/doubling", "input: " + input);
      return new ResponseEntity<>(getResponseService.sendResultDoubling(input), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new ErrorGeneral("Please provide an input!"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> responseEditorGreeter(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "title", required = false) String title) {

    if (name != null && title != null) {
      getResponseService.newLogAdder("/greeter", "name: " + name + ", title: " + title);
      return new ResponseEntity<>(getResponseService.sendResultGreeter(name, title), HttpStatus.OK);
    } else if (name == null) {
      return new ResponseEntity<>(new ErrorGeneral("Please provide a name!"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(new ErrorGeneral("Please provide a title!"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Body responseEditorAppend(@PathVariable("appendable") String appendableInput) {
    if (appendableInput != null) {
      getResponseService.newLogAdder("/appenda", "appendableInput: " + appendableInput);
      return getResponseService.sendResultAppendA(appendableInput);
    } else {
      return null;
    }
  }

  @PostMapping("/dountil/{what}")
  public ResponseEntity<?> responseEditorDoUntil(@PathVariable(value = "what", required = false) String what,
                                    @RequestBody(required = false) PostDoUntilBody body) {
    if (body != null) {
      getResponseService.newLogAdder("/dountil", "what: " + what + " object: " + body );
      return new ResponseEntity<>(getResponseService.sendResultDoUntil(what, body), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new ErrorGeneral("Please provide a number!"), HttpStatus.BAD_REQUEST);
    }

  }

  @PostMapping("/arrays")
  public ResponseEntity<?> responseEditorHandler(@RequestBody ArrayHandler inputArrayObject) {
    if (inputArrayObject.getWhat() != null && inputArrayObject.getNumbers() != null) {
      return new ResponseEntity<>(getResponseService.sendResultArrayHandler(inputArrayObject), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(getResponseService.sendArrayHandlerError(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/log")
  public ResponseEntity<?> responseEditorLog(@RequestParam(value = "page", required = false) Integer page,
                                             @RequestParam(value = "size", required = false) Integer size) {
    if ((page != null) && (size != null)) {
      return new ResponseEntity<Object>(getResponseService.listLogsByPaging(page, size), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(getResponseService.listAllLogs(), HttpStatus.OK);
    }
  }

  @PostMapping("/sith")
  public ResponseEntity<?> responseEditorSith(@RequestBody Object enteredObject){
    if (enteredObject != null) {
      return new ResponseEntity<Object>(getResponseService.sithReverser(enteredObject), HttpStatus.OK);
    } else {
      return new ResponseEntity<Object>(new ErrorGeneral("Feed me some text you have to, padawan young you are. Hmmm."),
              HttpStatus.BAD_REQUEST);
    }
  }
}

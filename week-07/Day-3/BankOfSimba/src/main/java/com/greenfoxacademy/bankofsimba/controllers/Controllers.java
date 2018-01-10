package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Controllers {

  @RequestMapping(value = "/show")
  public String show(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.equals(showInserter(model, bankAccount));

    return "template";
  }

  @RequestMapping(value = "/texttester")
  public String texttester(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.equals(showInserter(model, bankAccount));

    model.addAttribute("test1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("test2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

    return "template";
  }

  public Model showInserter(Model model, BankAccount bankAccount){
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());

    return model;
  }
}

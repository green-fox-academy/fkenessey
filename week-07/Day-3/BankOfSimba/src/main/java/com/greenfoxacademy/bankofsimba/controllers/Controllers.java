package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Controllers {

  @RequestMapping(value = "/show")
  public String show(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);
    model.equals(showInserter(model, bankAccount));

    return "template";
  }

  @RequestMapping(value = "/texttester")
  public String texttester(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);
    model.equals(showInserter(model, bankAccount));

    model.addAttribute("test1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("test2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

    return "template";
  }

  @RequestMapping(value = "/accounts")
  public String accounts(Model model) {

    List<BankAccount> listOfBankAccounts = new ArrayList<>();
    listOfBankAccounts.add(new BankAccount("Simba", 5000, "lion", true));
    listOfBankAccounts.add(new BankAccount("Nala", 100, "lion", false));
    listOfBankAccounts.add(new BankAccount("Timon", 1500, "meerkat", false));
    listOfBankAccounts.add(new BankAccount("Pumbaa", 2500, "warthog", false));

    model.addAttribute("listOfBankAccounts",listOfBankAccounts);

    return "accounts";
  }

  public Model showInserter(Model model, BankAccount bankAccount){
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    model.addAttribute("being king", bankAccount.isKing());

    return model;
  }
}

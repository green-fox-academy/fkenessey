package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Controllers {

  static List<BankAccount> listOfBankAccounts = new ArrayList<>();

  @RequestMapping(value = "/show")
  public String show(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true, "Good One");
    model.equals(showInserter(model, bankAccount));

    return "template";
  }

  @RequestMapping(value = "/texttester")
  public String texttester(Model model) {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true, "Good One");
    model.equals(showInserter(model, bankAccount));

    model.addAttribute("test1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("test2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

    return "template";
  }

  @GetMapping("/accounts")
  public String accounts(Model model) {

    listOfBankAccounts.add(new BankAccount("Simba", 5000, "lion", true, "Good One"));
    listOfBankAccounts.add(new BankAccount("Nala", 100, "lion", false, "Good One"));
    listOfBankAccounts.add(new BankAccount("Timon", 1500, "meerkat", false, "Good One"));
    listOfBankAccounts.add(new BankAccount("Pumbaa", 2500, "warthog", false, "Good One"));
    listOfBankAccounts.add(new BankAccount("Scar", 4500, "lion", false, "Bad Guy"));

    model.addAttribute("listOfBankAccounts",listOfBankAccounts);
    model.addAttribute("bankAccount", new BankAccount());

    return "accounts";
  }

  @RequestMapping(value = "/accounts/raise", method = RequestMethod.POST)
  public String raise(@ModelAttribute BankAccount bankAccount, BindingResult errors, Model model) {
    for (BankAccount bankAccountI : listOfBankAccounts) {
      if (bankAccountI.isKing()) {
        bankAccountI.setBalance(bankAccountI.getBalance() + 100);
      } else {
        bankAccountI.setBalance(bankAccountI.getBalance() + 10);
      }
    }
    model.addAttribute("listOfBankAccounts",listOfBankAccounts);
    return "accounts";
  }

  @RequestMapping(value = "/addAnimal", method = RequestMethod.POST)
  public String addAnimal(@ModelAttribute BankAccount bankAccount, BindingResult errors, Model model) {
    if (errors.hasErrors()) {
      return "accounts";
    } else {
      listOfBankAccounts.add(bankAccount);
      model.addAttribute("listOfBankAccounts", listOfBankAccounts);
      return "accounts";
    }
  }

  public Model showInserter(Model model, BankAccount bankAccount){
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    model.addAttribute("being king", bankAccount.isKing());
    model.addAttribute("affiliation", bankAccount.getAffiliation());

    return model;
  }
}

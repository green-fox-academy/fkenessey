package com.greenfoxacademy.pallida.controllers;

import com.greenfoxacademy.pallida.services.LicencePlateServiceDbImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

  @Autowired
  LicencePlateServiceDbImpl licencePlateServiceDb;

  @GetMapping("/")
  public String showPlates(Model model) {
    model.addAttribute("licence_plate_list", licencePlateServiceDb.listAllPlates());
    return "home";
  }

  @GetMapping("/search")
  public String showFilteredPlates(@RequestParam(name = "police", required = false) String police,
                                   @RequestParam(name = "diplomat", required = false) String diplomat,
                                   Model model) {

    if (police != null && police.equals("only") && diplomat == null) {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.ListPolicePlates());
    } else if (diplomat != null && diplomat.equals("only") && police == null) {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.ListDiplomatPlates());
    } else {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.listAllPlates());
    }

    return "home";
  }
}

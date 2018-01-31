package com.greenfoxacademy.pallida.controllers;

import com.greenfoxacademy.pallida.services.ErrorMessageServiceImpl;
import com.greenfoxacademy.pallida.services.LicencePlateServiceDbImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

  @Autowired
  LicencePlateServiceDbImpl licencePlateServiceDb;
  @Autowired
  ErrorMessageServiceImpl errorMessageServiceDb;

  @GetMapping("/")
  public String showPlates(Model model) {
    model.addAttribute("licence_plate_list", licencePlateServiceDb.listAllPlates());
    model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
    return "home";
  }

  @GetMapping("/search")
  public String showFilteredPlates(@RequestParam(name = "police", required = false) String police,
                                   @RequestParam(name = "diplomat", required = false) String diplomat,
                                   @RequestParam(name = "q", required = false) String q,
                                   Model model) {

    if (police != null && police.equals("only") && diplomat == null && q == null) {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.listPolicePlates());
      model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
    } else if (diplomat != null && diplomat.equals("only") && police == null && q == null) {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.listDiplomatPlates());
      model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
    } else if (q != null && police == null && diplomat == null) {
      if ((q.matches("[A-Z]{3}-[1-9][0-9]{2}")) || (q.matches("[A-Z0-9]{1,7}"))) {
        model.addAttribute("licence_plate_list", licencePlateServiceDb.listSearchedPlates(q));
        model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
      } else {
        model.addAttribute("licence_plate_list", licencePlateServiceDb.listAllPlates());
        model.addAttribute("error", errorMessageServiceDb
                .createInitialErrorMessage("Sorry, the submitted licence plate is not valid"));
      }
    } else {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.listAllPlates());
      model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
    }
    return "home";
  }

  @GetMapping("/search/{brand}")
  public String showBrandsPlates(@PathVariable(name = "brand", required = false) String brand, Model model) {

    if (brand != null) {
      model.addAttribute("licence_plate_list", licencePlateServiceDb.listBrandPlates(brand));
      model.addAttribute("error", errorMessageServiceDb.createInitialErrorMessage(""));
      return "home";
    } else {
      return "redirect:/";
    }
  }
}

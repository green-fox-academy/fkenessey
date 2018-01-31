package com.greenfoxacademy.pallidaretake.controllers;

import com.greenfoxacademy.pallidaretake.models.Merchandise;
import com.greenfoxacademy.pallidaretake.services.MerchandiseServiceDbImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

  @Autowired
  MerchandiseServiceDbImpl merchandiseServiceDb;

  @GetMapping("/warehouse")
  public String showMainPage(Model model) {
    model.addAttribute("merchandiseList", merchandiseServiceDb.listAllMerchandise());
    model.addAttribute("distinctByItemNameList", merchandiseServiceDb.listAllDistinctItemNames());
    model.addAttribute("emptyMerchandise", new Merchandise());
    return "main";
  }

  @PostMapping("/warehouse/summary")
  public String findBYSelection(@ModelAttribute("emptyMerchandise") Merchandise selectedMerchandise, Model model) {
    model.addAttribute("merchandiseList", merchandiseServiceDb.listAllSelectedItemName(selectedMerchandise));
    model.addAttribute("distinctByItemNameList", merchandiseServiceDb.listAllDistinctItemNames());
    model.addAttribute("emptyMerchandise", new Merchandise());
    return "main";
  }
}

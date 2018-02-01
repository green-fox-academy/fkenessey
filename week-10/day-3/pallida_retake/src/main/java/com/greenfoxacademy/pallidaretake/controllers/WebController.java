package com.greenfoxacademy.pallidaretake.controllers;

import com.greenfoxacademy.pallidaretake.factories.WebFactory;
import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
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
  @Autowired
  WebFactory webFactory;

  @GetMapping("/warehouse")
  public String showMainPage(Model model) {
    model.addAttribute("merchandiseList", merchandiseServiceDb.listAllMerchandise());
    model.addAttribute("distinctByItemNameList", merchandiseServiceDb.listAllDistinctItemNames());
    model.addAttribute("distinctBySizeList", merchandiseServiceDb.listAllDistinctSize());
    model.addAttribute("shoppingBasketDTO", webFactory.createNewShoppingBasketDTO());
    return "main";
  }

  @PostMapping("/warehouse/summary")
  public String findBYSelection(@ModelAttribute("shoppingBasketDTO") ShoppingBasketDTO shoppingBasketDTO, Model model) {
    model.addAttribute("selectedMerchandise", merchandiseServiceDb.findSelectedMerchandise(shoppingBasketDTO));
    model.addAttribute("shoppingBasketDTO", shoppingBasketDTO);
    return "summary";
  }
}

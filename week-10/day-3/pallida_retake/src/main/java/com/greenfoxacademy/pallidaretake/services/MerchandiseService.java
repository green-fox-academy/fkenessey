package com.greenfoxacademy.pallidaretake.services;

import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;

import java.util.List;

public interface MerchandiseService {
  List<Merchandise> listAllMerchandise();

  List<String> listAllDistinctItemNames();

  List<String> listAllDistinctSize();

  List<Merchandise> listAllSelectedItemName(Merchandise selectedMerchandise);

  Merchandise findSelectedMerchandise(ShoppingBasketDTO shoppingBasketDTO);
}

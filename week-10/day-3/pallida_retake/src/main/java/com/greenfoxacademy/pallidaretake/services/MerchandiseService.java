package com.greenfoxacademy.pallidaretake.services;

import com.greenfoxacademy.pallidaretake.models.DTOs.QueryDTO;
import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;

import java.util.List;

public interface MerchandiseService {
  List<Merchandise> listAllMerchandise();

  List<String> listAllDistinctItemNames();

  List<String> listAllDistinctSize();

  Merchandise findSelectedMerchandise(ShoppingBasketDTO shoppingBasketDTO);

  QueryDTO createReposneQuery(Double price, String type);
}

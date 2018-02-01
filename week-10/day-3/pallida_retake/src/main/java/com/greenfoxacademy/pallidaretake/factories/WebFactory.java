package com.greenfoxacademy.pallidaretake.factories;

import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
import org.springframework.stereotype.Component;

@Component
public class WebFactory {

  public Merchandise createNewEmptyMerchandise() {
    return new Merchandise();
  }

  public ShoppingBasketDTO createNewShoppingBasketDTO() {
    return new ShoppingBasketDTO();
  }
}

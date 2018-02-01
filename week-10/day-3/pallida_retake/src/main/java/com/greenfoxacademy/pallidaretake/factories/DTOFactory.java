package com.greenfoxacademy.pallidaretake.factories;

import com.greenfoxacademy.pallidaretake.models.DTOs.QueryDTO;
import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DTOFactory {

  public ShoppingBasketDTO createNewShoppingBasketDTO() {
    return new ShoppingBasketDTO();
  }

  public QueryDTO createNewQueryDTO(String result, List<Merchandise> clothes) {
    return new QueryDTO(result, clothes);
  }
}

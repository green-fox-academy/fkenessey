package com.greenfoxacademy.pallidaretake.services;
import com.greenfoxacademy.pallidaretake.factories.DTOFactory;
import com.greenfoxacademy.pallidaretake.models.DTOs.QueryDTO;
import com.greenfoxacademy.pallidaretake.models.DTOs.ShoppingBasketDTO;
import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
import com.greenfoxacademy.pallidaretake.repositories.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandiseServiceDbImpl implements MerchandiseService {

  @Autowired
  MerchandiseRepository merchandiseRepository;
  @Autowired
  DTOFactory dtoFactory;

  @Override
  public List<Merchandise> listAllMerchandise() {
    return (List<Merchandise>) merchandiseRepository.findAll();
  }

  @Override
  public List<String> listAllDistinctItemNames() {
    return (List<String>) merchandiseRepository.findAllDistinctItemNames();
  }

  @Override
  public List<String> listAllDistinctSize() {
    return (List<String>) merchandiseRepository.findAllDistinctSize();
  }

  @Override
  public Merchandise findSelectedMerchandise(ShoppingBasketDTO shoppingBasketDTO) {
    return merchandiseRepository.findDistinctByItemNameAndAndSize(shoppingBasketDTO.getItemName(), shoppingBasketDTO.getSize());
  }

  @Override
  public QueryDTO createReposneQuery(Double price, String type) {
    if (type.equals("lower")) {
      return dtoFactory.createNewQueryDTO("ok", merchandiseRepository.findAllByUnitPriceIsLessThan(price));
    } else if (type.equals("above")) {
      return dtoFactory.createNewQueryDTO("ok", merchandiseRepository.findAllByUnitPriceGreaterThan(price));
    } else if (type.equals("equal")){
      return dtoFactory.createNewQueryDTO("ok", merchandiseRepository.findAllByUnitPriceEquals(price));
    } else {
      return dtoFactory.createNewQueryDTO("error, incorrect input variables", null);
    }
  }
}

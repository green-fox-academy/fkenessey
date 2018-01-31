package com.greenfoxacademy.pallidaretake.services;

import com.greenfoxacademy.pallidaretake.models.Merchandise;

import java.util.List;

public interface MerchandiseService {
  List<Merchandise> listAllMerchandise();

  List<String> listAllDistinctItemNames();

  List<Merchandise> listAllSelectedItemName(Merchandise selectedMerchandise);
}

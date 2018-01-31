package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.models.LicencePlate;

import java.util.List;

public interface LicencePlateService {

  List<LicencePlate> listAllPlates();

  List<LicencePlate> listPolicePlates();

  List<LicencePlate> listDiplomatPlates();

  List<LicencePlate> listBrandPlates(String brand);

  List<LicencePlate> listSearchedPlates(String plateNumber);
}

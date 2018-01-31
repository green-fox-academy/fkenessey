package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.models.LicencePlate;

import java.util.List;

public interface LicencePlateService {

  List<LicencePlate> listAllPlates();

  List<LicencePlate> ListPolicePlates();

  List<LicencePlate> ListDiplomatPlates();
}

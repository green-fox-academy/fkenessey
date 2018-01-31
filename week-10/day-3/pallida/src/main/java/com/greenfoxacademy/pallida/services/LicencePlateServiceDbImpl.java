package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.models.LicencePlate;
import com.greenfoxacademy.pallida.repositories.LicencePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LicencePlateServiceDbImpl implements LicencePlateService {

  @Autowired
  LicencePlateRepository licencePlateRepository;

  @Override
  public List<LicencePlate> listAllPlates() {
    List<LicencePlate> listAllPlates = new ArrayList<>();
    licencePlateRepository.findAll().forEach(listAllPlates::add);
    return listAllPlates;
  }

  @Override
  public List<LicencePlate> ListPolicePlates() {
    List<LicencePlate> policePlateList = new ArrayList<>();
    licencePlateRepository.findAllByLicencePlateStartsWithOrderByYearDesc("RB").forEach(policePlateList::add);
    return policePlateList;
  }

  @Override
  public List<LicencePlate> ListDiplomatPlates() {
    List<LicencePlate> diplomatPlateList = new ArrayList<>();
    licencePlateRepository.findAllByLicencePlateStartsWithOrderByYearDesc("DT").forEach(diplomatPlateList::add);
    return diplomatPlateList;
  }
}

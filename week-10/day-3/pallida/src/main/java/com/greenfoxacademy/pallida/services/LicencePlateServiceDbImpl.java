package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.Factory.LicencePlateDtoFactory;
import com.greenfoxacademy.pallida.models.DTOs.LicencePlateDto;
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
  @Autowired
  LicencePlateDtoFactory licencePlateDtoFactory;

  @Override
  public List<LicencePlate> listAllPlates() {
    List<LicencePlate> listAllPlates = new ArrayList<>();
    licencePlateRepository.findAll().forEach(listAllPlates::add);
    return listAllPlates;
  }

  @Override
  public List<LicencePlate> listPolicePlates() {
    List<LicencePlate> policePlateList = new ArrayList<>();
    licencePlateRepository.findAllByLicencePlateStartsWithOrderByYearAsc("RB").forEach(policePlateList::add);
    return policePlateList;
  }

  @Override
  public List<LicencePlate> listDiplomatPlates() {
    List<LicencePlate> diplomatPlateList = new ArrayList<>();
    licencePlateRepository.findAllByLicencePlateStartsWithOrderByYearAsc("DT").forEach(diplomatPlateList::add);
    return diplomatPlateList;
  }

  @Override
  public List<LicencePlate> listBrandPlates(String brand) {
    List<LicencePlate> brandPlateList = new ArrayList<>();
    licencePlateRepository.findAllByBrandOrderByYearAsc(brand).forEach(brandPlateList::add);
    return brandPlateList;
  }

  @Override
  public List<LicencePlate> listSearchedPlates(String plateNumber) {
    List<LicencePlate> searchedPlateList = new ArrayList<>();
    licencePlateRepository.findAllByLicencePlateContainsOrderByYearAsc(plateNumber).forEach(searchedPlateList::add);
    return searchedPlateList;
  }

  @Override
  public LicencePlateDto createLicencePlateDtoByBrand(String brand, String result) {
    List<LicencePlate> brandPlateList = new ArrayList<>();
    licencePlateRepository.findAllByBrandOrderByYearAsc(brand).forEach(brandPlateList::add);
    return licencePlateDtoFactory.createNewLPDto(result, brandPlateList);
  }
}

package com.greenfoxacademy.pallida.controllers;

import com.greenfoxacademy.pallida.models.DTOs.LicencePlateDto;
import com.greenfoxacademy.pallida.services.ErrorMessageServiceImpl;
import com.greenfoxacademy.pallida.services.LicencePlateServiceDbImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

  @Autowired
  LicencePlateServiceDbImpl licencePlateServiceDb;
  @Autowired
  ErrorMessageServiceImpl errorMessageServiceDb;

  @GetMapping("/api/search/{brand}")
  public LicencePlateDto showBrandsPlates(@PathVariable(name = "brand") String brand) {

    if (brand != null) {
      return licencePlateServiceDb.createLicencePlateDtoByBrand(brand, "ok");
    } else {
      return licencePlateServiceDb.createLicencePlateDtoByBrand("", "error ;-)");
    }
  }
}

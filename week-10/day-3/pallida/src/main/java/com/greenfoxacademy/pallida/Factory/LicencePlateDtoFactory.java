package com.greenfoxacademy.pallida.Factory;

import com.greenfoxacademy.pallida.models.DTOs.LicencePlateDto;
import com.greenfoxacademy.pallida.models.LicencePlate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LicencePlateDtoFactory {

  public LicencePlateDto createNewLPDto(String result, List<LicencePlate> data) {
    return new LicencePlateDto(result, data);
  }

}

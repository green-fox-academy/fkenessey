package com.greenfoxacademy.pallida.models.DTOs;

import com.greenfoxacademy.pallida.models.LicencePlate;

import java.util.List;

public class LicencePlateDto {

  private String result;
  private List<LicencePlate> data;

  public LicencePlateDto() {
  }

  public LicencePlateDto(String result, List<LicencePlate> data) {
    this.result = result;
    this.data = data;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<LicencePlate> getData() {
    return data;
  }

  public void setData(List<LicencePlate> data) {
    this.data = data;
  }
}

package com.greenfoxacademy.pallidaretake.models.DTOs;

import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;

import java.util.List;

public class QueryDTO {

  private String result;
  private List<Merchandise> clothes;

  public QueryDTO() {
  }

  public QueryDTO(String result, List<Merchandise> clothes) {
    this.result = result;
    this.clothes = clothes;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Merchandise> getClothes() {
    return clothes;
  }

  public void setClothes(List<Merchandise> clothes) {
    this.clothes = clothes;
  }
}

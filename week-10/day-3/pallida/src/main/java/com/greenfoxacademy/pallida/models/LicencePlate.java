package com.greenfoxacademy.pallida.models;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class LicencePlate {

  @Id
  @Column(name = "plate")
  private String licencePlate;
  @Column(name = "car_brand")
  private String brand;
  @Column(name = "car_model")
  private String model;
  @Column(name = "color")
  private String colour;
  @Column(name= "year")
  private Integer year;

  public LicencePlate() {
  }

  public String getLicencePlate() {
    return licencePlate;
  }

  public void setLicencePlate(String licencePlate) {
    this.licencePlate = licencePlate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }
}

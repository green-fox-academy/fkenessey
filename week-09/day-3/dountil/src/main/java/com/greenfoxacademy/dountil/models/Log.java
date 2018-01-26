package com.greenfoxacademy.dountil.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "log_table")
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "log_id")
  private Long id;
  @Column(name = "log_creation_date")
  private String createdAt;
  @Column(name = "log_endpoint")
  private String endpoint;
  @Column(name = "data")
  private String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    this.createdAt = String.valueOf(LocalDate.now());
    this.endpoint = endpoint;
    this.data = data;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}

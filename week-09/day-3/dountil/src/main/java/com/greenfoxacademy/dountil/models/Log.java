package com.greenfoxacademy.dountil.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "log_table")
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "log_id")
  private Long id;
  @Column(name = "log_creation_date")
  private Date createdAt;
  @Column(name = "log_endpoint")
  private String endpoint;
  @Column(name = "log_data")
  private Object data;

  public Log() {
  }

  public Log(String endpoint, Object data) {
    //this.createdAt = String.valueOf(LocalDate.now());
    this.createdAt = Date.from(Instant.now());
    this.endpoint = endpoint;
    this.data = data;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}

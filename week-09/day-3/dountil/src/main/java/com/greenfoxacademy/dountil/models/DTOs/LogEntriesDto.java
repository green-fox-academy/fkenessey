package com.greenfoxacademy.dountil.models.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.dountil.models.Log;

import java.util.List;

public class LogEntriesDto {
  private List<Log> entries;
  @JsonProperty(value = "entry_count")
  private Integer entryCount;

  public LogEntriesDto() {
  }

  public LogEntriesDto(List<Log> entries, Integer entryCount) {
    this.entries = entries;
    this.entryCount = entryCount;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public Integer getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(Integer entryCount) {
    this.entryCount = entryCount;
  }
}

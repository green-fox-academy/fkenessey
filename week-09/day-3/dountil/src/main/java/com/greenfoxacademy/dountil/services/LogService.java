package com.greenfoxacademy.dountil.services;

import com.greenfoxacademy.dountil.models.Log;

import java.util.List;

public interface LogService {
  void addLog(Log log);
  List<Log> listLogs();
}

package com.greenfoxacademy.dountil.services;

import com.greenfoxacademy.dountil.models.Log;
import com.greenfoxacademy.dountil.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceDbImpl implements LogService {

  @Autowired
  LogRepository logRepository;

  @Override
  public void addLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> listLogs() {
    List<Log> logList = new ArrayList<>();
    logRepository.findAll().forEach(logList::add);
    return logList;
  }
}

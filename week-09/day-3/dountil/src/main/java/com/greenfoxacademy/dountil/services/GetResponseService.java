package com.greenfoxacademy.dountil.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.dountil.models.*;
import com.greenfoxacademy.dountil.models.DTOs.LogEntriesDto;
import com.greenfoxacademy.dountil.repositories.LogPaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetResponseService {

  @Autowired
  LogServiceDbImpl logServiceDb;
  @Autowired
  LogPaging logPaging;

  public GetResponseBody sendResultDoubling(String receivedInput) {
      GetResponseBody getResponseBody = new GetResponseBody(receivedInput);
      return getResponseBody;
  }

  public GetGreeterBody sendResultGreeter(String receivedName, String receivedTitle) {
    GetGreeterBody getGreeterBody = new GetGreeterBody(receivedName, receivedTitle);
    return getGreeterBody;
  }

  public GetAppendABody sendResultAppendA(String receivedString) {
    GetAppendABody getAppendABody = new GetAppendABody(receivedString);
    return getAppendABody;
  }

  public PostDoUntilBody sendResultDoUntil(String receivedCommand, PostDoUntilBody receivedBody) {
    if (receivedCommand.equals("sum")) {
      for (int i = 0; i <= receivedBody.getUntil(); i++) {
        receivedBody.setResult(receivedBody.getResult() + i);
      }
      return receivedBody;
    } else if(receivedCommand.equals("factor")) {
      receivedBody.setResult(1);
      for (int i = 1; i <= receivedBody.getUntil(); i++) {
        receivedBody.setResult(receivedBody.getResult() * i);
      }
      return receivedBody;
    } else {
      return null;
    }
  }

  public Body sendResultArrayHandler(ArrayHandler postArrayHandlerBody) {
    if (postArrayHandlerBody.getWhat().equals("sum")) {
      return sendResultArrayHandlerSum(postArrayHandlerBody);
    } else if (postArrayHandlerBody.getWhat().equals("multiply")) {
      return sendResultArrayHandlerMultiply(postArrayHandlerBody);
    } else if (postArrayHandlerBody.getWhat().equals("double")) {
      return sendResultArrayHandlerDouble(postArrayHandlerBody);
    } else {
      return null;
    }
  }

  public Body sendResultArrayHandlerSum(ArrayHandler postArrayHandlerBody){
    PostArrayHandlerBody postArrayHandlerBody1 = new PostArrayHandlerBody();
    postArrayHandlerBody1.setWhat(postArrayHandlerBody.getWhat());
    postArrayHandlerBody1.setNumbers(postArrayHandlerBody.getNumbers());
    for (int i = 0; i < postArrayHandlerBody1.getNumbers().length; i++) {
      postArrayHandlerBody1.setResult(postArrayHandlerBody1.getResult()
              + postArrayHandlerBody1.getNumbers()[i]);
    }
    return postArrayHandlerBody1;
  }

  public Body sendResultArrayHandlerMultiply(ArrayHandler postArrayHandlerBody){
    PostArrayHandlerBody postArrayHandlerBody1 = new PostArrayHandlerBody();
    postArrayHandlerBody1.setWhat(postArrayHandlerBody.getWhat());
    postArrayHandlerBody1.setNumbers(postArrayHandlerBody.getNumbers());
    postArrayHandlerBody1.setResult(1);
    for (int i = 0; i < postArrayHandlerBody1.getNumbers().length; i++) {
      postArrayHandlerBody1.setResult(postArrayHandlerBody1.getResult()
              * postArrayHandlerBody1.getNumbers()[i]);
    }
    return postArrayHandlerBody1;
  }

  public Body sendResultArrayHandlerDouble(ArrayHandler postArrayHandlerBody){
    PostArrayHandlerArrayBody postArrayHandlerBody1 = new PostArrayHandlerArrayBody();
    postArrayHandlerBody1.setWhat(postArrayHandlerBody.getWhat());
    postArrayHandlerBody1.setNumbers(postArrayHandlerBody.getNumbers());
    int[] result = new int[postArrayHandlerBody1.getNumbers().length];
    for (int i = 0; i < postArrayHandlerBody1.getNumbers().length; i++) {
      result[i] = postArrayHandlerBody.getNumbers()[i] * 2;
    }
    postArrayHandlerBody1.setResult(result);
    return postArrayHandlerBody1;
  }

  public Body sendArrayHandlerError() {
    ErrorGeneral errorGeneral = new ErrorGeneral("Please provide what to do with the numbers!");
    return errorGeneral;
  }

  public void newLogAdder(String endpoint, Object enteredData) {
    ObjectMapper converter = new ObjectMapper();
    String convertedDataInputToString;
    try {
      convertedDataInputToString = converter.writeValueAsString(enteredData);
    } catch (JsonProcessingException e) {
      convertedDataInputToString = null;
      e.printStackTrace();
    }
    logServiceDb.addLog(new Log(endpoint,convertedDataInputToString));
  }

  public List<Log> listAllLogs() {
    return logServiceDb.listLogs();
  }

  public LogEntriesDto listLogsByPaging(Integer page, Integer size) {
    List<Log> logReturnList = new ArrayList<>();
    PageRequest pageRequest = new PageRequest(page, size, Sort.Direction.DESC, "createdAt");
    logPaging.findAll(pageRequest).forEach(logReturnList::add);
    LogEntriesDto logEntriesDto = new LogEntriesDto(logReturnList, logReturnList.size());
    return logEntriesDto;
  }
}

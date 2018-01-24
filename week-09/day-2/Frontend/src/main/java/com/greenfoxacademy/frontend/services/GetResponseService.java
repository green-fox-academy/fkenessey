package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.*;
import org.springframework.stereotype.Service;

@Service
public class GetResponseService {

  public GetResponseBody sendResultDoubling(String receivedInput) {
      GetResponseBody getResponseBody = new GetResponseBody(receivedInput);
      return getResponseBody;
  }

  public ErrorBodyDoubling sendErrorNullDoubling() {
      ErrorBodyDoubling errorBodyDoubling = new ErrorBodyDoubling();
      return errorBodyDoubling;
  }

  public GetGreeterBody sendResultGreeter(String receivedName, String receivedTitle) {
    GetGreeterBody getGreeterBody = new GetGreeterBody(receivedName, receivedTitle);
    return getGreeterBody;
  }

  public ErrorBodyGreeterName sendErrorNullName() {
    ErrorBodyGreeterName errorBodyGreeterName = new ErrorBodyGreeterName();
    return errorBodyGreeterName;
  }

  public ErrorBodyGreeterTitle sendErrorNullTitle() {
    ErrorBodyGreeterTitle errorBodyGreeterTitle = new ErrorBodyGreeterTitle();
    return errorBodyGreeterTitle;
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

  public ErrorGeneral sendDoUntilBodyError() {
    ErrorGeneral errorGeneral = new ErrorGeneral("Please provide a number!");
    return errorGeneral;
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
}

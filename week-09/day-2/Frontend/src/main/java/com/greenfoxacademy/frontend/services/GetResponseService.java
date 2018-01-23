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
}

package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.ErrorBody;
import com.greenfoxacademy.frontend.models.GetResponseBody;
import org.springframework.stereotype.Service;

@Service
public class GetResponseService {

  public GetResponseBody sendResult(String receivedInput) {
      GetResponseBody getResponseBody = new GetResponseBody(receivedInput);
      return getResponseBody;
  }

  public ErrorBody sendErrorNullError() {
      ErrorBody errorBody = new ErrorBody();
      return errorBody;
  }

}

package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.Factory.ErrorMessageFactory;
import com.greenfoxacademy.pallida.models.DTOs.ErrorMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorMessageServiceImpl implements ErrorMessageService{

  @Autowired
  ErrorMessageFactory errorMessageFactory;

  @Override
  public ErrorMessageDto createInitialErrorMessage(String input) {
    return errorMessageFactory.createNewErrorMessageDto(input);
  }
}

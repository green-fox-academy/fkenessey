package com.greenfoxacademy.pallida.Factory;

import com.greenfoxacademy.pallida.models.DTOs.ErrorMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorMessageFactory {

  public ErrorMessageDto createNewErrorMessageDto(String initialMessage) {
    return new ErrorMessageDto(initialMessage);
  }
}

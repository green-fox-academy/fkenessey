package com.greenfoxacademy.pallida.services;

import com.greenfoxacademy.pallida.models.DTOs.ErrorMessageDto;

public interface ErrorMessageService {

  public ErrorMessageDto createInitialErrorMessage(String input);
}

package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Enums.Status;
import org.springframework.stereotype.Service;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.*;

@Service
public class RetrofitService {

  private List<Object> userList = new ArrayList<>();

  Retrofit retrofit = new Retrofit.Builder()
          //TODO when secured create an environmental variable
          .baseUrl("https://matchmaking-fake-backend.herokuapp.com/")
          .addConverterFactory(GsonConverterFactory.create())
          .build();

  ExternalRestCommunicationService comms = retrofit.create(ExternalRestCommunicationService.class);

  public List callApprenticeList(String firstName, String lastName, String cohort, String cohortClass,
                                 String slackChannelId, String email, Status status) {

    Call<List<Object>> call = comms.ListAllApprentices(
            firstName, lastName, cohort, cohortClass, slackChannelId, email, status);

    try {
      userList = call.execute().body();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return userList;
  }

  public List callPartnerList(String companyName, String email, Status status) {

    Call<List<Object>> call = comms.ListAllPartners(
            companyName, email, status);

    try {
      userList = call.execute().body();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return userList;
  }

  public List callAdminList(String firstName, String lastName, String email, Status status) {

    Call<List<Object>> call = comms.ListAllAdmin(firstName, lastName, email, status);

    try {
      userList = call.execute().body();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return userList;
  }
}

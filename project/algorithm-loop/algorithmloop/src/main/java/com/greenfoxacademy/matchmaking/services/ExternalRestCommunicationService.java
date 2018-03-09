package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Enums.Status;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ExternalRestCommunicationService {

//  @Headers({
//          //TODO:access token shall be entered here
//  })
  @GET("api/apprentice")
  Call<List<Object>> ListAllApprentices(@Query("firstName") String firstName,
                                        @Query("lastName") String lastName,
                                        @Query("cohort") String cohort,
                                        @Query("cohortClass") String cohortClass,
                                        @Query("slackChannelId") String slackChannelId,
                                        @Query("email") String email,
                                        @Query("status") Status status);

//  @Headers({
//          //TODO:access token shall be entered here
//  })
  @GET("api/partner")
  Call<List<Object>> ListAllPartners(@Query("companyName") String companyName,
                                     @Query("email") String email, 
                                     @Query("status") Status status);

//  @Headers({
//          //TODO:access token shall be entered here
//  })
  @GET("api/admin")
  Call<List<Object>> ListAllAdmin(@Query("firstName") String firstName,
                                  @Query("lastName") String lastName, 
                                  @Query("email") String email, 
                                  @Query("status") Status status);
}

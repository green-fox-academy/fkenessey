package com.greenfoxacademy.matchmaking.controllers;

import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.services.AlgorithmService;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import com.greenfoxacademy.matchmaking.models.Enums.Status;
import com.greenfoxacademy.matchmaking.services.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MainController {

  @Autowired
  RetrofitService retrofitService;

  @Autowired
  ApprenticeRepository apprenticeRepository;

  @Autowired
  PartnerRepository partnerRepository;

  @Autowired
  AlgorithmService algorithmService;

  @GetMapping(value = "/user")
  public Principal user(Principal principal) {
    return principal;
  }

  @RequestMapping("/apprenticecall")
  public List requestApprenticeList(@RequestParam(name = "firstName", required = false) String firstName,
                                    @RequestParam(name = "lastName", required = false) String lastName,
                                    @RequestParam(name = "cohort", required = false) String cohort,
                                    @RequestParam(name = "cohortClass", required = false) String cohortClass,
                                    @RequestParam(name = "slackChannelId", required = false) String slackChannelId,
                                    @RequestParam(name = "email", required = false) String email,
                                    @RequestParam(name = "status", required = false) Status status) {

    return retrofitService.callApprenticeList(firstName, lastName, cohort, cohortClass, slackChannelId, email, status);
  }

  @RequestMapping("/partnercall")
  public List requestApprenticeList(@RequestParam(name = "companyName", required = false) String companyName,
                                    @RequestParam(name = "email", required = false) String email,
                                    @RequestParam(name = "status", required = false) Status status) {

    return retrofitService.callPartnerList(companyName, email, status);
  }

  @RequestMapping("/admincall")
  public List requestAdminList(@RequestParam(name = "firstName", required = false) String firstName,
                               @RequestParam(name = "lastName", required = false) String lastName,
                               @RequestParam(name = "email", required = false) String email,
                               @RequestParam(name = "status", required = false) Status status) {

    return retrofitService.callAdminList(firstName, lastName, email, status);
  }

  @RequestMapping("/matchmaking")
  public List matchmaking() {
    return algorithmService.matchmaker();
  }

}

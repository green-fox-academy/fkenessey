package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Preference;
import com.greenfoxacademy.matchmaking.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PreferenceService {

  List<Preference> findAll();
  Preference findOne(long id);
  List<Preference> findByUser(User user);
  List<Preference> findByUserEmail(String email);
  List<Preference> findByUserPhoneNumber(String phoneNumber);
  List<Preference> findBySelectionId(String selectionId);
  Preference findByUserAndRanking(User user, int ranking);
  List<Preference> findByRanking(int ranking);
  List<Preference> findByCohort(String cohort);
  List<Preference> findByCohortClass(String cohortClass);
  List<Preference> findByCompanyName(String companyName);

}

package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Apprentice;
import com.greenfoxacademy.matchmaking.models.Preference;
import com.greenfoxacademy.matchmaking.models.User;
import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.repositories.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class PreferenceServiceDbImpl implements PreferenceService {

  private final PreferenceRepository preferenceRepository;
  private final ApprenticeRepository apprenticeRepository;
  private final PartnerRepository partnerRepository;

  @Autowired
  public PreferenceServiceDbImpl(PreferenceRepository preferenceRepository, ApprenticeRepository apprenticeRepository, PartnerRepository partnerRepository) {
      this.preferenceRepository = preferenceRepository;
      this.apprenticeRepository = apprenticeRepository;
      this.partnerRepository = partnerRepository;
  }

  @Override
  public List<Preference> findAll() {
      return preferenceRepository.findAll();
  }

  @Override
  public Preference findOne(long id) {
      return preferenceRepository.findOne(id);
  }

  @Override
  public List<Preference> findByUser(User user) {
      return preferenceRepository.findByUser(user);
  }

  @Override
  public List<Preference> findByUserEmail(String email) {
      return preferenceRepository.findByUserEmail(email);
  }

  @Override
  public List<Preference> findByUserPhoneNumber(String phoneNumber) {
      return preferenceRepository.findByUserPhoneNumber(phoneNumber);
  }

  @Override
  public List<Preference> findBySelectionId(String selectionId) {
      return preferenceRepository.findBySelectionId(selectionId);
  }

  @Override
  public Preference findByUserAndRanking(User user, int ranking) {
      return preferenceRepository.findByUserAndRanking(user, ranking);
  }

  @Override
  public List<Preference> findByRanking(int ranking) {
      return preferenceRepository.findByRanking(ranking);
  }

  @Override
  public List<Preference> findByCohort(String cohort) {
      List<Apprentice> apprentices =  apprenticeRepository.findByCohort(cohort);
      return getDistinctPreferenceList(apprentices);

  }

  @Override
  public List<Preference> findByCohortClass(String cohortClass) {
      List<Apprentice> apprentices =  apprenticeRepository.findByCohortClass(cohortClass);
      return getDistinctPreferenceList(apprentices);
  }

  @Override
  public List<Preference> findByCompanyName(String companyName) {
      return partnerRepository.findByCompanyName(companyName).getPreferences();
  }

  private List<Preference> getDistinctPreferenceList(List<Apprentice> apprentices) {
      List<Preference> preferences = new ArrayList<>();

      for(Apprentice apprentice : apprentices) {
          List<Preference> apprenticePreferences = apprentice.getPreferences();
          preferences.addAll(apprenticePreferences);
      }

      return new ArrayList<>(new HashSet<>(preferences));
  }

}

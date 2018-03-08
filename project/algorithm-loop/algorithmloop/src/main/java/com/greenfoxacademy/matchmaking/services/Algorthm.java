package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Apprentice;
import com.greenfoxacademy.matchmaking.models.Partner;
import com.greenfoxacademy.matchmaking.models.Preference;
import com.greenfoxacademy.matchmaking.models.User;
import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.repositories.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@Service
public class Algorthm {

  @Autowired
  ApprenticeRepository apprenticeRepository;
  
  @Autowired
  PartnerRepository partnerRepository;

  @Autowired
  PreferenceRepository preferenceRepository;
  
  public List matchmaker() {
    
    int changeCounter = 1;
    int followerCounter = 0;
    
    while (!(changeCounter == followerCounter)) {
      followerCounter = changeCounter;

      List<User> allApprentices = (List)apprenticeRepository.findAll();

      for (int i = 0; i < allApprentices.size(); i++) {

        List<Preference> currentUserPreferenceList = preferenceRepository.findByUser(allApprentices.get(i));
        currentUserPreferenceList.sort(Comparator.comparing(Preference::getRanking));

        for (int j = 0; j < currentUserPreferenceList.size(); j++) {

          if (partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId().isEmpty()) {

            partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId())
                    .setMatchedUserId(allApprentices.get(i).getId());
            partnerRepository.save(partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()));

            allApprentices.get(i)
                    .setMatchedUserId(partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()).getId());

            apprenticeRepository.save((Apprentice)allApprentices.get(i));

            changeCounter++;

            break;

          } else {

            int currentSelectedUserRankingByPartner = preferenceRepository
                    .findByUserAndSelectionId(
                            partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()),
                            partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId())
                    .getRanking();

            int potentialUserRankingByPartner = preferenceRepository
                    .findByUserAndSelectionId(
                            partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()),
                            allApprentices.get(i).getId())
                    .getRanking();

            if (potentialUserRankingByPartner < currentSelectedUserRankingByPartner) {

              apprenticeRepository.findById(
                      partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId())
                              .getMatchedUserId())
                      .setMatchedUserId(null);
              apprenticeRepository.save(apprenticeRepository.findById(
                      partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId()));

              partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId())
                      .setMatchedUserId(allApprentices.get(i).getId());

              allApprentices.get(i)
                      .setMatchedUserId(partnerRepository.findById(currentUserPreferenceList.get(j).getSelectionId()).getId());
              apprenticeRepository.save((Apprentice)allApprentices.get(i));

              changeCounter++;

              break;
            }
          }
        }
      }
    }
    List<Partner> partners = (List) partnerRepository.findAll();
    HashMap<String, String> partnersMatchedUserIds = new HashMap<>();
    for (Partner partner : partners) {
      partnersMatchedUserIds.put(partner.getId(), partner.getMatchedUserId());
    }

    List<Apprentice> apprentices = (List) apprenticeRepository.findAll();
    HashMap<String, String> apprenticeMatchedUserIds = new HashMap<>();
    for (Apprentice apprentice : apprentices) {
      apprenticeMatchedUserIds.put(apprentice.getId(), apprentice.getMatchedUserId());
    }

    List<HashMap> results = new ArrayList<>();
    results.add(partnersMatchedUserIds);
    results.add(apprenticeMatchedUserIds);
    return results;
  }
}

package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Preference;
import com.greenfoxacademy.matchmaking.models.User;
import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.repositories.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlgorithmServiceStreamlined {

  final private ApprenticeRepository apprenticeRepository;
  final private PartnerRepository partnerRepository;
  final private PreferenceRepository preferenceRepository;

  @Autowired
  public AgorithmServiceStreamlined(ApprenticeRepository apprenticeRepository,
                                    PartnerRepository partnerRepository,
                                    PreferenceRepository preferenceRepository) {
    this.apprenticeRepository = apprenticeRepository;
    this.partnerRepository = partnerRepository;
    this.preferenceRepository = preferenceRepository;
  }

  public List matchmaker() {

    int changeCounter = 1;
    int followerCounter = 0;

    List<User> allApprentices = listAllApprentices();
    List<User> allPartners = listAllPartners();
    List<Preference> allPreferences = listAllPreferences();

    while (!(changeCounter == followerCounter)) {
      followerCounter = changeCounter;

      for (int i = 0; i < allApprentices.size(); i++) {

        List<Preference> currentUserPreferenceList = findPreferenceByUser(allPreferences, allApprentices.get(i));
        currentUserPreferenceList.sort(Comparator.comparing(Preference::getRanking));

        for (int j = 0; j < currentUserPreferenceList.size(); j++) {

          if (findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId().equals("")) {

            createMatch(currentUserPreferenceList, allApprentices, allPartners, i, j);

            changeCounter++;

            break;

          } else if (findPreferenceByUserAndSelectionId(allPreferences,
                  findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()),
                  allApprentices.get(i).getId()) != null){

            int partnerSRankingOfAlreadyRecordedApprenticeMatch = findPreferenceByUserAndSelectionId(
                    allPreferences,
                    findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()),
                    findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId())
                    .getRanking();

            int partnerSRankingOfCurrentApprenticeMatch = findPreferenceByUserAndSelectionId(
                    allPreferences,
                    findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()),
                    allApprentices.get(i).getId()).getRanking();

            int apprenticeSRankingOfAlreadyRecordedPartnerMatch = findPreferenceByUserAndSelectionId(
                    allPreferences,
                    findUserById(
                            allApprentices,
                            findUserById(
                                    allPartners,
                                    currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId()),
                            currentUserPreferenceList.get(j).getSelectionId())
                    .getRanking();

            int apprenticeSRankingOfCurrentPartnerMatch = currentUserPreferenceList.get(j).getRanking();

            if ((partnerSRankingOfCurrentApprenticeMatch + apprenticeSRankingOfCurrentPartnerMatch <
                    partnerSRankingOfAlreadyRecordedApprenticeMatch + apprenticeSRankingOfAlreadyRecordedPartnerMatch) &&
                    !(allApprentices.get(i).getId()).equals(findUserById(
                            allApprentices,
                            findUserById(
                                    allPartners,
                                    currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId()
                            ).getId())) {

              deleteAlreadyRecordedApprenticeMatch(currentUserPreferenceList, allApprentices, allPartners, j);

              createMatch(currentUserPreferenceList, allApprentices, allPartners, i, j);

              changeCounter++;

              break;
            } else if ((partnerSRankingOfCurrentApprenticeMatch + apprenticeSRankingOfCurrentPartnerMatch) ==
                    (partnerSRankingOfAlreadyRecordedApprenticeMatch + apprenticeSRankingOfAlreadyRecordedPartnerMatch) &&
                    !(allApprentices.get(i).getId()).equals(findUserById(
                            allApprentices,
                            findUserById(
                                    allPartners,
                                    currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId()
                            ).getId())) {

              if (apprenticeSRankingOfCurrentPartnerMatch < apprenticeSRankingOfAlreadyRecordedPartnerMatch) {

                deleteAlreadyRecordedApprenticeMatch(currentUserPreferenceList, allApprentices, allPartners, j);

                createMatch(currentUserPreferenceList, allApprentices, allPartners, i, j);

              }
            }
          }
        }
      }
    }
    //TODO: edit according to implementation
    HashMap<String, String> partnersMatchedUserIds = new HashMap<>();
    for (User partner : allPartners) {
      partnersMatchedUserIds.put(partner.getId(), partner.getMatchedUserId());
    }
    //TODO: edit according to implementation
    HashMap<String, String> apprenticeMatchedUserIds = new HashMap<>();
    for (User apprentice : allApprentices) {
      apprenticeMatchedUserIds.put(apprentice.getId(), apprentice.getMatchedUserId());
    }
    //TODO: edit according to implementation
    List<HashMap> results = new ArrayList<>();
    results.add(partnersMatchedUserIds);
    results.add(apprenticeMatchedUserIds);
    return results;
  }

  public void createMatch(List<Preference> currentUserSPreferenceList,
                          List<User> allApprentices,
                          List<User> allPartners,
                          int i,
                          int j) {

    findUserById(allPartners, currentUserSPreferenceList.get(j).getSelectionId())
            .setMatchedUserId(allApprentices.get(i).getId());

    if (allApprentices.get(i).getMatchedUserId() != null && !allApprentices.get(i).getMatchedUserId().equals("")) {
      findUserById(allPartners, allApprentices.get(i).getMatchedUserId()).setMatchedUserId(null);
    }

    allApprentices.get(i)
            .setMatchedUserId(findUserById(allPartners, currentUserSPreferenceList.get(j).getSelectionId()).getId());

  }

  public void deleteAlreadyRecordedApprenticeMatch(List<Preference> currentUserPreferenceList,
                                                   List<User> allApprentices,
                                                   List<User> allPartners,
                                                   int j) {

    findUserById(
            allApprentices,
            findUserById(allPartners, currentUserPreferenceList.get(j).getSelectionId()).getMatchedUserId())
            .setMatchedUserId(null);

  }

  public List listAllApprentices() {
      return (List) apprenticeRepository.findAll();
  }

  public List listAllPartners() {
    return (List) partnerRepository.findAll();
  }

  public List listAllPreferences() {
    return (List) preferenceRepository.findAll();
  }

  public User findUserById (List<User> list, String id) {
    for (User user : list) {
      if (user.getId().equals(id)) {
        return user;
      }
    }
    return null;
  }

  public List<Preference> findPreferenceByUser(List<Preference> list, User user) {
    List<Preference> preferenceList = new ArrayList<>();
    for (Preference preference : list) {
      if (preference.getUser().getId().equals(user.getId())) {
        preferenceList.add(preference);
      }
    }
    return preferenceList;
  }

  public Preference findPreferenceByUserAndSelectionId (List<Preference> list, User user, String selectionId) {
    Preference foundPreference = null;
    for (Preference preference : list) {
      if (preference.getUser().getId().equals(user.getId()) && preference.getSelectionId().equals(selectionId)) {
        foundPreference = preference;
      }
    }
    return foundPreference;
  }
}

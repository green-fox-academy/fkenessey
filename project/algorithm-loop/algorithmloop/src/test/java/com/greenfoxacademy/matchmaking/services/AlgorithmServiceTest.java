package com.greenfoxacademy.matchmaking.services;

import com.greenfoxacademy.matchmaking.models.Apprentice;
import com.greenfoxacademy.matchmaking.models.Partner;
import com.greenfoxacademy.matchmaking.models.Preference;
import com.greenfoxacademy.matchmaking.repositories.ApprenticeRepository;
import com.greenfoxacademy.matchmaking.repositories.PartnerRepository;
import com.greenfoxacademy.matchmaking.repositories.PreferenceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlgorithmServiceTest {

  @Mock
  ApprenticeRepository apprenticeRepositoryMock;

  @Mock
  PartnerRepository partnerRepositoryMock;

  @Mock
  PreferenceRepository preferenceRepository;

  @InjectMocks
  AlgorithmService algorithmService;


  @Test
  public void matchmaker() throws Exception {
    List<Apprentice> apprentices = new ArrayList<>();
    apprentices.add(new Apprentice("a1@gmail.com", "1234-5678", "Pisti", "1", "karakk", "Csharp", true, "PistiDaSlack"));
    apprentices.add(new Apprentice("a2@gmail.com", "2234-5678", "Julcsi", "2", "karakk", "Csharp", true, "JulcsiDaSlack"));
    apprentices.add(new Apprentice("a3@gmail.com", "3234-5678", "Zoli", "3", "vukk", "java", true, "ZoliDaSlack"));
    apprentices.add(new Apprentice("a4@gmail.com", "4234-5678", "Piroska", "4", "vukk", "java", true, "PiroskaDaSlack"));
    apprentices.add(new Apprentice("a5@gmail.com", "5234-5678", "Jozsi", "5", "karakk", "Csharp", true, "JozsiDaSlack"));

    List<Partner> partners = new ArrayList<>();
    partners.add(new Partner("p1@gmail.com", "0123-4567", "CoolCode"));
    partners.add(new Partner("p2@gmail.com", "0223-4567", "AdvancedAPI"));
    partners.add(new Partner("p3@gmail.com", "0133-4567", "DreamLoop"));

    List<Preference> preferences = new ArrayList<>();
    preferences.add(new Preference(1, partners.get(1).getId(), apprentices.get(0)));
    preferences.add(new Preference(2, partners.get(0).getId(), apprentices.get(0)));
    preferences.add(new Preference(3, partners.get(2).getId(), apprentices.get(0)));
    preferences.add(new Preference(1, partners.get(0).getId(), apprentices.get(1)));
    preferences.add(new Preference(2, partners.get(0).getId(), apprentices.get(1)));
    preferences.add(new Preference(3, partners.get(2).getId(), apprentices.get(1)));

    String id;

    when(apprenticeRepositoryMock.findAll()).thenReturn(apprentices);

    when(apprenticeRepositoryMock.findById(apprentices.get(0).getId())).thenReturn(apprentices.get(0));
    when(apprenticeRepositoryMock.findById(apprentices.get(1).getId())).thenReturn(apprentices.get(1));
    when(apprenticeRepositoryMock.findById(apprentices.get(2).getId())).thenReturn(apprentices.get(2));
    when(apprenticeRepositoryMock.findById(apprentices.get(3).getId())).thenReturn(apprentices.get(3));
    when(apprenticeRepositoryMock.findById(apprentices.get(4).getId())).thenReturn(apprentices.get(4));
  }

  @Test
  public void createMatch() throws Exception {
  }

  @Test
  public void deleteAlreadyRecordedApprenticeMatch() throws Exception {
  }

}
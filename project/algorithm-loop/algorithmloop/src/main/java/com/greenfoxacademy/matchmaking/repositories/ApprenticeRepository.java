package com.greenfoxacademy.matchmaking.repositories;

import com.greenfoxacademy.matchmaking.models.Apprentice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenticeRepository extends CrudRepository<Apprentice, String> {

  List<Apprentice> findByCohort(String cohort);
  List<Apprentice> findByCohortClass(String cohortClass);
  List<Apprentice> findByFirstName(String firstName);
  List<Apprentice> findByLastName(String lastName);
  List<Apprentice> findBySlackChannelId(String slakcChannelId);
  Apprentice findById(String id);

}

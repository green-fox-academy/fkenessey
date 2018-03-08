package com.greenfoxacademy.matchmaking.repositories;

import com.greenfoxacademy.matchmaking.models.Partner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, String> {

  Partner findByCompanyName(String companyName);
  Partner findById(String id);

}

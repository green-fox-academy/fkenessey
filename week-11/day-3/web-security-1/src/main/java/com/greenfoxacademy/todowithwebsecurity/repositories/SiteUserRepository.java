package com.greenfoxacademy.todowithwebsecurity.repositories;

import com.greenfoxacademy.todowithwebsecurity.models.SiteUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SiteUserRepository extends CrudRepository<SiteUser, Long> {

  SiteUser findByUsername(String username);
}

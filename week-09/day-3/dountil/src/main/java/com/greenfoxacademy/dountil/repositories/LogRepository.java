package com.greenfoxacademy.dountil.repositories;

import com.greenfoxacademy.dountil.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log,Long> {
}

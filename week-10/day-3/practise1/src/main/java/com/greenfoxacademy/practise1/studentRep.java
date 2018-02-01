package com.greenfoxacademy.practise1;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRep extends CrudRepository<Student, Long>{
}

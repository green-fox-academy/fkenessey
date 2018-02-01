package com.greenfoxacademy.practise1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teacherRep extends CrudRepository<Teacher, Long>{
}

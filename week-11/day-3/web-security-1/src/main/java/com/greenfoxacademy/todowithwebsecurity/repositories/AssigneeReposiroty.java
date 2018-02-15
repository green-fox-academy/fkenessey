package com.greenfoxacademy.todowithwebsecurity.repositories;

import com.greenfoxacademy.todowithwebsecurity.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeReposiroty extends CrudRepository<ToDo,Integer> {
}

package com.greenfoxacademy.introductiontospring.repositories;

import com.greenfoxacademy.introductiontospring.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo,Integer> {

}

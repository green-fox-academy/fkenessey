package com.greenfoxacademy.todowithwebsecurity.repositories;

import com.greenfoxacademy.todowithwebsecurity.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Integer> {

  List<ToDo> findAllBySiteUserUsername(String username);
}

package com.greenfoxacademy.todowithwebsecurity.repositories;

import com.greenfoxacademy.todowithwebsecurity.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Integer> {

  //by title
  List<ToDo> findAllByTitle(String searchedTitle);

  //by id
  List<ToDo> findAllById(Integer searchedId);

  //by assignee One-to-One
  List<ToDo> findByAssignee(Integer searchedId);

  //by assignee Many-toOne
  List<ToDo> findAllByAssignee_Id(Integer searchedId);
}

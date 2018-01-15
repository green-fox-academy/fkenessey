package com.greenfoxacademy.listingtodosh2.repositories;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<Todo,Long> {

}

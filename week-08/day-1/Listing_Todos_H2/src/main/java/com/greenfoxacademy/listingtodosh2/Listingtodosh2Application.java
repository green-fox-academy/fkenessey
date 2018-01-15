package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import com.greenfoxacademy.listingtodosh2.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.expression.Strings;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

	@Autowired
	ToDoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Listingtodosh2Application.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    repo.save(new Todo("I have to learn Object Relational Mapping"));
  }
}

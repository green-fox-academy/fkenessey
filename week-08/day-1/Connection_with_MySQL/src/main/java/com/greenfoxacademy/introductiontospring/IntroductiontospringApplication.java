package com.greenfoxacademy.introductiontospring;

import com.greenfoxacademy.introductiontospring.models.Todo;
import com.greenfoxacademy.introductiontospring.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductiontospringApplication implements CommandLineRunner{

	@Autowired
	ToDoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(IntroductiontospringApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
      repo.save(new Todo("I have to learn Object Relational Mapping"));
      repo.save(new Todo("Finish first exercise"));
      repo.save(new Todo("Understand mySQL better"));
	}
}

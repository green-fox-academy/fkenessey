package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner{
	@Autowired
	Printer p;
    @Autowired
	MyColor colour;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		p.log(colour.printColor());
	}
}

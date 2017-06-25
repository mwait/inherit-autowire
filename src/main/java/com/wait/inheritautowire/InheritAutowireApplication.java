package com.wait.inheritautowire;

import com.wait.inheritautowire.services.PersonService;
import com.wait.inheritautowire.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritAutowireApplication implements CommandLineRunner {

	private PersonService personService;
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}


	public static void main(String[] args) {
		SpringApplication.run(InheritAutowireApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Startujemy");
		System.out.println("Metoda z PersonBaseService");
		System.out.println(personService.getRandomPerson());
		System.out.println("Metoda z PersonServiceImpl");
		System.out.println(personService.findRandomPersonByAge(56));

	}
}

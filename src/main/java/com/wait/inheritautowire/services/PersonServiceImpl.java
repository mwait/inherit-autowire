package com.wait.inheritautowire.services;

import com.wait.inheritautowire.converter.PersonStringConverter;
import com.wait.inheritautowire.domain.Person;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonServiceImpl extends PersonBaseService implements PersonService {

    public int generateRandomValueToNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    public String findRandomPersonByAge (int personAge) {
        Person person = new Person.PersonBuilder("Mark", "Wait").age(personAge).build();
        return getPersonStringConverter().apply(person);
    }
}

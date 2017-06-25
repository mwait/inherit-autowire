package com.wait.inheritautowire.services;

import com.wait.inheritautowire.converter.PersonStringConverter;
import com.wait.inheritautowire.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonBaseService {

    private PersonStringConverter personStringConverter;

    @Autowired
    public void setPersonStringConverter(PersonStringConverter personStringConverter) {
        this.personStringConverter = personStringConverter;
    }

    public PersonStringConverter getPersonStringConverter() {
        return personStringConverter;
    }

    public String getRandomPerson() {
        Person person =  new Person.PersonBuilder("jan", "kowalski").age(29).build();
        return personStringConverter.apply(person);
    }


}

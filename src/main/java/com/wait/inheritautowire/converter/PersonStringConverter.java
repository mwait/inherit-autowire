package com.wait.inheritautowire.converter;

import com.wait.inheritautowire.domain.Person;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PersonStringConverter implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        return "converter generate " + person;
    }
}

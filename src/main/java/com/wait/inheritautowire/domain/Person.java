package com.wait.inheritautowire.domain;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(PersonBuilder pb) {
        this.name = pb.name;
        this.lastName = pb.lastName;
        this.age = pb.age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class PersonBuilder {
        private final String name;
        private final String lastName;
        private int age;

        public PersonBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

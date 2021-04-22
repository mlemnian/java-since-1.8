package com.example.test;

import java.util.Objects;

// Almost a record!
// Java Records are final and you can not extend a record!
// But implementing Interfaces works
// Records are truly immutable – you can’t change their field values using reflection.
public class PersonEntityOld {

    private final String name;
    private final Integer age;
    private final String email;

    public PersonEntityOld(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String name() {
        return this.name;
    }

    public Integer age() {
        return this.age;
    }

    public String email() {
        return this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntityOld that = (PersonEntityOld) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return "PersonEntityOld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
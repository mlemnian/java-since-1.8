package com.example.test;

import java.io.Serializable;

// unfortunately no JavaBeans Conventions
// must implement Serializable to be serializable
public record PersonEntity(String name, Integer age, String email) {

    // compact constructor
    public PersonEntity {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
}
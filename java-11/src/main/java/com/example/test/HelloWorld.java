package com.example.test;

import java.util.HashMap;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class HelloWorld {

    // var is only for local variables allowed
    // static final var query = "";

    public static void main(String... args) {
        var logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");

        // compiler error in jdk 10
        // var myMap = new HashMap<>();

        // in jdk 11
        var myMap = new HashMap<>(); // <-- new Hash<Object, Object>()

        // pay attention to primitives
        var i = 1; // <-- int

        // compiler error in jdk 10 but works in jdk 11
        Predicate<String> predicate = (var a) -> true;
    }
}

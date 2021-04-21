package com.example.test;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String... args) {
        var logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");

        // compiler error in jdk 10
        // var myMap = new HashMap<>();

        // in jdk 11
        // var myMap = new HashMap<>(); <-- new Hash<Object, Object>()

        // pay attention to primitives
        var i = 1; // <-- int

        // compiler error in jdk 10 but works in jdk 11
        // Predicate<String> predicate = (@Nullable var a) -> true;
    }
}

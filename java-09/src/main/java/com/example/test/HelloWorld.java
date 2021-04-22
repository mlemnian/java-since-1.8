package com.example.test;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");

        // deprecated (since 9) and marked for removal (since 16)
        Integer myInt = new Integer(15);
        Integer myNewInt = Integer.valueOf(15);
    }
}

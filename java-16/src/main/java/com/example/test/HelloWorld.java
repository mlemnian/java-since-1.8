package com.example.test;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");

        // deprecated (since 9) and marked for removal
        Integer myInt = new Integer(15);
        Integer myNewInt = Integer.valueOf(15);

        // pattern matching of instanceof

        PersonEntityOld person = new Customer("",1, "a@b.c");

        if (person instanceof Customer) {
            Customer customer = (Customer) person;
            customer.email();
        }

        // the new way is
        if (person instanceof Customer customer) {
            customer.email();
        } else {
            // customer does not exist here! The local variable is bound to the if-block
        }


    }
    class innerClass {
        static final int x = 3;  // was OK: constant variable
        static int y = 4;  // was a Compile-time error, but now it is allowed
    }
}

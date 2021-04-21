package com.example.test;

public class SwitchExpressionExample {

    void preJava14() {
        int k = 3;
        String s;
        switch (k) {
        case 1:
            s = "one";
            break;
        case 2:
            s = "two";
            break;
        default:
            s = "many";
        }
        ;
        System.out.println(s);
    }

    void java14() {
        int k = 3;
        String s = switch (k) {
        case 1 -> "one";
        case 2 -> "two";
        default -> "many";
        };
        System.out.println(s);
    }

    void java14_2() {
        int k = 3;
        System.out.println(switch (k) {
        case 1 -> "one";
        case 2 -> "two";
        default -> "many";
        });
    }
}

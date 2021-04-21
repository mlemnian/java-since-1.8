package com.example.test;

public class DiamondOperator {

    public interface GenericClass<E> {
        E testMethod();
    }

    GenericClass<Integer> preJava9() {
        GenericClass<Integer> myList = new GenericClass<Integer>() {

            @Override
            public Integer testMethod() {
                return Integer.valueOf(8);
            }
        };
        return myList;
    }

    GenericClass<Integer> java9() {
        GenericClass<Integer> myList = new GenericClass<>() {

            @Override
            public Integer testMethod() {
                return Integer.valueOf(9);
            }
        };
        return myList;
    }
}
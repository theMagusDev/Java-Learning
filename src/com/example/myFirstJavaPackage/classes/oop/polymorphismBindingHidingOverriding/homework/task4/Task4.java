package com.example.myFirstJavaPackage.classes.oop.polymorphismBindingHidingOverriding.homework.task4;

public class Task4 {

    public static void abc(X x, Y y) {
        System.out.println("privet");
    }
    public static void abc(Y y, X x) {
        System.out.println("poka");
    }

    public static void main(String[] args) {

        Y a = new Y();
        // abc(a, a);
        // we can do so, because Y is subclass of X, but compiler
        // do not know which method to use
    }
}

class X {}

class Y extends X {}

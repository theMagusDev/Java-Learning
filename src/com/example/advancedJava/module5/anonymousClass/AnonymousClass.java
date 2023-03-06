package com.example.advancedJava.module5.anonymousClass;

public class AnonymousClass {

    public static void main(String[] args) {

        MathInterface mathInterface = new MathInterface() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Abc abc = new Abc() {
            @Override
            public void abc() {
                System.out.println("Override");
            }
        };
        abc.abc();
    }
}

interface MathInterface {
    int doOperation(int a, int b);
}

class Abc { public void abc(){}; }


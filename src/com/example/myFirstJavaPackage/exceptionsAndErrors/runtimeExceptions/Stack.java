package com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions;

public class Stack {

    public static void main(String[] args) {

        doSmth();
    }

    static void get4thElementFromArray() {
        int[] ints = {1, 2, 3};
        System.out.println(ints[5]);
    }

    static void doSmth() {
        get4thElementFromArray();
    }

}

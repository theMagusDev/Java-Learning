package com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions;

public class Program {

    public static void main(String[] args) {

        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("RunTime NullPointerException was handled.");
        }
    }

    static void abc(String s) throws NullPointerException {
        s = null;
        System.out.println(s.length());
    }
}

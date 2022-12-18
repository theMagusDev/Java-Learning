package com.example.myFirstJavaPackage.exceptionsAndErrors.tryCatchFinally;

public class Program {

    public static void main(String[] args) {

        int[] array = {4, 8, 1};
        System.out.println("We have an array");
        try {
            System.out.println(array[5]);
            System.out.println("Good day everyone!");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("[!] Exception '" + e + "' was handled.");
        } finally {
            System.out.println("This line is always printed");
        }

        System.out.println("Program finished.");
    }
}

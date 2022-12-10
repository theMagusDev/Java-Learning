package com.example.myFirstJavaPackage.overloading;

public class MethodOverloading {

    void printVar(int intToPrint) {
        System.out.println(intToPrint);
        System.out.println("Print int method was called.");
        System.out.println();
    }

    void printVar(boolean booleanToPrint) {
        System.out.println(booleanToPrint);
        System.out.println("Print boolean method was called.");
        System.out.println();
    }

    void printVar(String stringToPrint) {
        System.out.println(stringToPrint);
        System.out.println("Print String method was called.");
        System.out.println();
    }

    /** Note:
    int printVar(String stringToPrint) {

        System.out.println(stringToPrint);
        System.out.println("Print String method was called.");
        System.out.println();
        return 5;
    }
     * Causes an error. Different return types only != overloading
     */

    void printVar(String s, int a) {
        System.out.println("String: " + s + " int: " + a);
    }

    void printVar(int a, String s) {
        System.out.println("int: " + a + " String: " + s);
    }

}

class MethodOverloadingProgram {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        int a = 500;
        methodOverloading.printVar(a);

        boolean b = true;
        methodOverloading.printVar(b);

        String s = "Hello";
        methodOverloading.printVar(s);
    }
}

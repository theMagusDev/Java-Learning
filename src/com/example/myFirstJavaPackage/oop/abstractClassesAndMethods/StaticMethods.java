package com.example.myFirstJavaPackage.oop.abstractClassesAndMethods;

public class StaticMethods implements I1 {

    public static void main(String[] args) {

        // StaticMethods.def(); Error: static methods are not inherited
        I1.def(); // OK
    }
}

interface I1 {

    static void def() {
        System.out.println("Static method def");
    }

}

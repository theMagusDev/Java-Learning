package com.example.myFirstJavaPackage.classes.oop.abstractClassesAndMethods.interfaces;

public class StaticMethods implements Interf1 {

    public static void main(String[] args) {

        // StaticMethods.def(); Error: static methods are not inherited
        Interf1.def(); // OK
    }
}

interface Interf1 {

    static void def() {
        System.out.println("Static method def");
    }

}

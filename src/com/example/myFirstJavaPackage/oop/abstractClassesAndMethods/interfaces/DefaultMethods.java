package com.example.myFirstJavaPackage.oop.abstractClassesAndMethods.interfaces;

public class DefaultMethods {

    public static void main(String[] args) {

        BClass b = new BClass();
        b.def(); // Output: def method
    }
}

interface A {

    void abc();
    default void def() {
        System.out.println("def method");
    }
    // Note: 'default' does not mean 'default access modifier'!
    // Access modifier is still public
}

class BClass implements A {

    @Override
    public void abc() {
        System.out.println("abc() from A class");
    }
    // No need in overriding def()
}
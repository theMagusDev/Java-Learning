package com.example.myFirstJavaPackage.classes.oop.abstractClassesAndMethods.interfaces;

public class PrivateStaticMethods {

}

interface I1 {

    private static void method1() {
        System.out.println("Static method1");
    }

    private void method2() {
        System.out.println("Non-static method2");
    }

    // private void method2(); // Error: Private methods in interfaces should have a body
    // static void method2(); // Error: Static methods in interfaces should have a body
    // Why? Because these methods are not abstract, so they must have a body.

    // Private non-static method can not be called inside the private static methods
    private void nonStaticMethod1() {
        nonStaticMethod2();
        System.out.println("Non-static method1");
    }

    private void nonStaticMethod2() {
        nonStaticMethod1();
        System.out.println("Non-static method2");
    }

    private static void staticMethod1() {
        System.out.println("Static method1");
        // nonStaticMethod1(); // Error: Non-static method cannot be referenced from a static context
    }
}
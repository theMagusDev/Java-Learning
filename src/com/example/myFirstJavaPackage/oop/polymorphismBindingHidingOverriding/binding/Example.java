package com.example.myFirstJavaPackage.oop.polymorphismBindingHidingOverriding.binding;

public class Example {

    public static void main(String[] args) {

        A c1 = new C();
        c1.abc(new B()); // A
    }
}

class A {

    void abc(A a) {
        System.out.println("A");
    }
}

class B extends A {

    void abc(B b1) {
        System.out.println("B");
    }
}

class C extends B {

    @Override
    void abc(B b2) {
        System.out.println("C");
    }
}

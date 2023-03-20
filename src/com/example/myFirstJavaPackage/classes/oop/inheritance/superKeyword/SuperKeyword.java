package com.example.myFirstJavaPackage.classes.oop.inheritance.superKeyword;

public class SuperKeyword {

    public static void main(String[] args) {

        B b = new B();
    }
}

class A {

    String s1 = "Hello";
    static double d1 = 3.14;

    int sum(int ... ints) {
        int result = 0;

        for (int a : ints)
            result += a;

        return result;
    }
    static void abc() {
        System.out.println("Static method");
    }
}

class B extends A{

    String s2 = super.s1 + ", world!";
    // is the same as
    String s3 = s1 + ", world!";

    {
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }

    // Super keyword is useful when var or method are hidden
    double d1 = super.d1 + 1.00;
    // or
    double d2 = A.d1 + 1.00;
    {
        System.out.println("d1 (class A) = " + A.d1);
        System.out.println("d1 (class B) = " + d1 + "; d2 (class B) = " + d2);
    }

    int sum(int ... ints) {

        int result = super.sum(ints);
        return result;
    }
}

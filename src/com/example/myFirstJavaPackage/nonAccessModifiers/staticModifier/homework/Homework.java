package com.example.myFirstJavaPackage.nonAccessModifiers.staticModifier.homework;

public class Homework {

    public static void main(String[] args) {

        // Homework #1
        System.out.println("--- Homework #1 ---\n");

        System.out.println(MyCalculator.multiply(1, 2, 3));
        MyCalculator.divide(7, 3);

        System.out.println(MyCalculator.multiply(3, 5, 4));
        MyCalculator.divide(85, 15);

        // Homework #2
        System.out.println("\n--- Homework #2 ---\n");

        System.out.println(MyCalculator.calculateCircleLength(7));
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.calculateCircleArea(7));
        myCalculator.printCircleInfo(7);
    }
}

class MyCalculator {

    static final float pi = 3.14f;

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static void divide(int x, int y) {
        System.out.println("Divide " + x + " on " + y + " = " + x / y);
        System.out.println(x + " and " + y + " division leftover = " + x % y);
    }

    double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }

    static double calculateCircleLength(double radius) {
        return 2 * pi * radius;
    }

    void printCircleInfo(double radius) {
        System.out.println("=== Circle Info ===");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + calculateCircleArea(radius));
        System.out.println("Length = " + calculateCircleLength(radius));
        System.out.println("===================");
    }
}

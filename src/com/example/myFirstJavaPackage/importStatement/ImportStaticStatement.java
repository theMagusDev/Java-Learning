package com.example.myFirstJavaPackage.importStatement;

import static com.example.myFirstJavaPackage.nonAccessModifiers.staticModifier.Student.*;
// is equal to: import static com.example.myFirstJavaPackage.nonAccessModifiers.staticModifier.Student.counter;

public class ImportStaticStatement {

    // static int counter = 99;
    // the line above makes println print 99, but not the Student's class static variable

    public static void main(String[] args) {

        System.out.println("Amount of students: " + counter);
    }
}

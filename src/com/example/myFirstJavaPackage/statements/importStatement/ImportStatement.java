package com.example.myFirstJavaPackage.statements.importStatement;

import com.example.myFirstJavaPackage.classes.variablesAndVisibility.Car;
import com.example.myFirstJavaPackage.classes.variablesAndVisibility.*;
/*
is equal to:
import com.example.myFirstJavaPackage.variablesAndVisibility.Car;
import com.example.myFirstJavaPackage.variablesAndVisibility.Student;
 */

// Note: line #3 means: Import all CLASSES from package variablesAndVisibility
// (but not subpackages from package variablesAndVisibility)

import java.lang.*; // is imported by default. That's why we can use System and String classes, for example


public class ImportStatement {

    public static void main(String[] args) {

        Car car = new Car("blue");
        System.out.println(car.color);

        String string = new String("Abcd");

    }

}

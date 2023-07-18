package com.example.myFirstJavaPackage.reflection.part2;

import java.lang.reflect.Field;

public class BreakingEncapsulation {
    // 'salary' in Director.java is private

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Director director = new Director(1, "Yuriy");
        Class directorClass = director.getClass();
        Field salaryField = directorClass.getDeclaredField("salary");

        /*
        double salaryValue = (Double) salaryField.get(director);
        System.out.println(salaryValue); // Exception: cannot access a member of class Director with modifiers "private"
         */

        // Solution:
        salaryField.setAccessible(true);
        double salaryValue = (Double) salaryField.get(director);
        System.out.println(salaryValue); // 500000.0

        salaryField.set(director, 750000);
        salaryValue = (Double) salaryField.get(director);
        System.out.println(salaryValue); // 750000.0
    }
}

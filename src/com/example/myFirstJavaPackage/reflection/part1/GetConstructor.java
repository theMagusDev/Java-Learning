package com.example.myFirstJavaPackage.reflection.part1;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class GetConstructor {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class employeeClass = Class.forName("com.example.myFirstJavaPackage.reflection.part1.Employee");

        Constructor constructorWithNoParameters = employeeClass.getConstructor(); // Constructor with no parameters
        System.out.println("Constructor has " + constructorWithNoParameters.getParameterCount() + " parameters, their types: " + Arrays.toString(constructorWithNoParameters.getParameterTypes()));
        // Constructor has 0 parameters, their types: []

        Constructor constructorWithParameters = employeeClass.getConstructor(int.class, String.class, String.class); // Constructor with parameters 'int id, String name, String department, double salary'
        System.out.println("Constructor has " + constructorWithParameters.getParameterCount() + " parameters, their types: " + Arrays.toString(constructorWithParameters.getParameterTypes()));
        // Constructor has 3 parameters, their types: [int, class java.lang.String, class java.lang.String]

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() + " parameters, their types: " + Arrays.toString(constructor.getParameterTypes()));
        }
        /*
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 4 parameters, their types: [int, class java.lang.String, class java.lang.String, double]
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 3 parameters, their types: [int, class java.lang.String, class java.lang.String]
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 0 parameters, their types: []
         */

        // getDeclaredConstructors()
        Constructor[] declaredConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() + " parameters, their types: " + Arrays.toString(constructor.getParameterTypes()));
        }
        /*
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 4 parameters, their types: [int, class java.lang.String, class java.lang.String, double]
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 3 parameters, their types: [int, class java.lang.String, class java.lang.String]
         Constructor com.example.myFirstJavaPackage.reflection.part1.Employee has 0 parameters, their types: []
         */
    }
}

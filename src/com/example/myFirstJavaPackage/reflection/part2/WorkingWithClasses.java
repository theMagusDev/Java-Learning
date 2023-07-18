package com.example.myFirstJavaPackage.reflection.part2;

import com.example.myFirstJavaPackage.reflection.part1.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WorkingWithClasses {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class employeeClass = Class.forName("com.example.myFirstJavaPackage.reflection.part1.Employee");

        // Before Java 11:
        Employee oldEmployee = (Employee) employeeClass.newInstance(); // 'newInstance()' is deprecated
        System.out.println(oldEmployee); // Employee{id=0, name='null', department='null', salary=0.0}

        // After Java 11:
        Constructor<Employee> constructor = employeeClass.getConstructor();
        Object employee = constructor.newInstance();

        Constructor constructorWith3Parameters = employeeClass.getConstructor(int.class, String.class, String.class);
        Object employee2 = constructorWith3Parameters.newInstance(1, "Yuriy", "IT");
        System.out.println(employee2); // Employee{id=1, name='Yuriy', department='IT', salary=0.0}

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(employee2, 30000);
        System.out.println(employee2); // Employee{id=1, name='Yuriy', department='IT', salary=30000.0}
    }
}

package com.example.myFirstJavaPackage.oop.lesson26.hiding;

/** Non-private vars and static methods are 'hiding' when:
 * 1) Name are the same
 * 2) Subclass' arguments are the same as superclass' arguments
 * 3.1) Subclass' return type is the same as superclass' return type
 * OR
 * 3.2) Subclass' return type is superclass return type's subclass
 * 4) Access modifier in subclass is the same or less strict, then in superclass
 * 5) Static in superclass = static in subclass
 * 6) Not final
 */
public class Hiding {

    public static void main(String[] args) {
        Employee employee = new Teacher();
        Teacher teacher = new Teacher();
        employee.eat(); // Employee eats
        teacher.eat(); // Teacher eats
        // The line above calls hiding method
    }
}

class Employee {
    String name;
    int age = 18;

    static void eat() {
        System.out.println("Employee eats");
    }
    protected void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee {
    int studentsAmount;
    String age = "eighteen"; // Variable is hiding previous variable

    static void eat() { // hiding method
        System.out.println("Teacher eats");
    }

    public void sleep() {
        System.out.println("Teacher sleeps");
    }

    void teach() {
        System.out.println("Teach");
    }
}


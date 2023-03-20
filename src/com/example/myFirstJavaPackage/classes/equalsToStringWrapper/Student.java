package com.example.myFirstJavaPackage.classes.equalsToStringWrapper;

public class Student {

    {
        System.out.println("Student was initialized.");
    }

    static {
        System.out.println("Class was initialized.");
    }

    Student() {
        System.out.println("Student constructor called.");
    }

    public static void main(String[] args) {

        Student student = new Student();
    }
}



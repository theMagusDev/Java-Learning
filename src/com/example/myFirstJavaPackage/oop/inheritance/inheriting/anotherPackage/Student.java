package com.example.myFirstJavaPackage.oop.inheritance.inheriting.anotherPackage;

import com.example.myFirstJavaPackage.oop.inheritance.inheriting.Human;

public class Student extends Human {
    // extends only public and protected elements

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(Human.salary);
        // student.run(); error
        // Human.travel(); error
    }
}

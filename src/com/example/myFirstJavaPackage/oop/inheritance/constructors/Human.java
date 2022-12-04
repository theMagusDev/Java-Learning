package com.example.myFirstJavaPackage.oop.inheritance.constructors;

public class Human {

    Human() { // super constructor #1
        this("Ivan", 0);
    }
    Human(String name) { // super constructor #2
        this(name, 0);
    }
    Human (String name, int age) { // super constructor #3
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}

class Student extends Human {

    Student() { // constructor #1
        super(); // super constructor #1 is used
    }
    // The above constructor is created by default, so you can omit it
    Student(String name) { // constructor #2
        super(name); // super constructor #2 is used
    }

    public static void main(String[] args) {

        Student student = new Student("Petr"); // constructor #1 is used
    }
}

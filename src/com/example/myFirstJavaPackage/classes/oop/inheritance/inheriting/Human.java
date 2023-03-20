package com.example.myFirstJavaPackage.classes.oop.inheritance.inheriting;

public class Human { // Super class, Parent class, Base class
    protected String name = "Default name";
    int age;
    public static int salary;
    void run() {
        System.out.println("Run");
    }
    static void travel() {
        System.out.println("Travel in space");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Human { // Derived class, Child class, Subclass, Extended class
    // extends elements with default access-modifiers

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.age);
        System.out.println(Human.salary);
        student.run();
        Human.travel();
    }
}
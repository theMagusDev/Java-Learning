package com.example.myFirstJavaPackage.oop.inheritance;

public class Example {

    public static void main(String[] args) {


    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eat");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    String spezialization;

    void cure() {
        System.out.println("Cure");
    }
}

class Therapist extends Doctor {
    String tools;
    void examine() {

    }
}

class Dentist extends Doctor {
    String curingMashine;
    void cureTeeth() {

    }
}

class Teacher extends Employee {
    int studentsAmount;

    void teach() {
        System.out.println("Teach");
    }
}

class Driver extends Employee {

    String carName;

    void drive() {
        System.out.println("Drive");
    }
}
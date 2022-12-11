package com.example.myFirstJavaPackage.oop.abstractClassesAndMethods.interfaces;

public class Interfaces {

    public static void main(String[] args) {

        HelpAble helpAble = new Driver();
        helpAble.firstHelp(); // OK
        // helpAble.drive(); // ERROR
        // helpAble.eat(); // ERROR
    }
}

class Employee {
    String name;
    int age;

    void eat() {
        System.out.println("Eat");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee implements HelpAble {
    int studentsAmount;
    void teach() {
        System.out.println("Teach");
    }

    @Override
    public void firstHelp() {
        System.out.println("Teacher is helping");
    }

    @Override
    public void fightAFire(String water) {
        System.out.println("Teacher is fighting a fire");
    }

}

class Driver extends Employee implements HelpAble, SwimAble {
    String carName;
    void drive() {
        System.out.println("Drive");
    }

    @Override
    public void firstHelp() {
        System.out.println("Driver is helping");
    }

    @Override
    public void fightAFire(String fireExtinguisher) {
        System.out.println("Driver is fighting a fire");
    }

    @Override
    public void swim() {
        System.out.println("Driver is swimming");
    }
}

interface HelpAble {
    // Note: All interfaces are ABSTRACT
    public abstract void firstHelp();
    // void firstHelp(); is the same
    void fightAFire(String tool);
    // Note: All methods in interface are PUBLIC by default and always ABSTRACT
}

interface SwimAble {
    void swim();
    public final static int A = 10;
    int B = 5;
    // Note: All variables in interface are PUBLIC FINAL STATIC
}

interface DiveableAndHelpable extends SwimAble, HelpAble { // Interface can extend interface
    void dive();
}

abstract class Human implements SwimAble { } // abstract class can ignore overriding
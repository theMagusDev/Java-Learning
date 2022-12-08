package com.example.myFirstJavaPackage.oop.polymorphismBindingHidingOverriding.references;

public class Lesson26 {

    public Object abc() {
        return new Doctor(); // OK.
        // Why? Doctor is a subclass and the Object is super class
        // Every Doctor is an Object, so error here.
    }

    /* BUT Error:
    public Doctor abc1() {
        return Object();
    }
    // Not every Object is a Doctor, so error here.
     */

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Driver driver = new Driver();
        Dentist dentist = new Dentist();
        Employee employee = new Employee();

        // But, notice:
        Employee employee1 = new Doctor();
        Employee employee2 = new Teacher();
        Employee employee3 = new Driver();
        Employee employee4 = new Dentist();
        Doctor doctor1 = new Dentist();


        // Driver driver1 = new Employee(); // Error
        // Driver driver1 = new Teacher(); // Error
        // Super class var can link to subclass object
        // But subclass' var can not link to superclass object (or same inherit level object)

        System.out.println(employee1.name); // OK
        System.out.println(employee1.age); // OK
        System.out.println(employee1.experience); // OK
        employee1.sleep(); // OK
        // employee1.cure(); // Cannot resolve method 'cure' in 'Employee'
        // Why: Compiler checks the var's type, not object's

    }
}

class Employee {
    String name;
    int age;
    int experience;
    double salary;

    void eat() {
        System.out.println("Eat");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    String specialization;

    void cure() {
        System.out.println("Cure");
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

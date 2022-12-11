package com.example.myFirstJavaPackage.oop.advancedPolymorphismInstanceofCasting;

// Rule of Casting:
/*
 * Classes or Interfaces must have IS-A relationship
 * Note: casting does not change the var's type, it only makes it feel like another type's var
 */
public class Casting {

    static void abc(){}

    public static void main(String[] args) {

        // Preparation
        Employee employeeDoctor = new Doctor();
        Employee employeeTeacher = new Teacher();
        Helpable employeeDriver = new Driver();

        // ===================== Downcasting (variables!) ======================== //

        // System.out.println(employee1.specialization); // Error: Cannot resolve symbol 'specialization'
        Doctor doctor = (Doctor)employeeDoctor; // Casting Employee type var to Doctor type
        System.out.println(doctor.specialization); // OK
        doctor.cure(); // OK
        ((Teacher)employeeTeacher).teach(); // OK
        // ((Casting)employee3).abc(); // Error: Inconvertible types
        // Why? Compiler checks IS-A. employee3 of type Employee is Casting? No
        // But in line 19: Teacher is Employee? Yes. Ok, no problem here.

        /* Note:
        * In line 16, for example, we say: "Trust us, Doctor is Employee and has specialization var"
        * But if we cheat the compiler
         */
        // ((Teacher)employeeDoctor).teach();
        /*
        No compile error in line 29. But there is a RunTime error:
        * Doctor cannot be cast to class Teacher
         */

        employeeDriver.help(); // OK
        // employeeDriver.drive(); // Error
        ((Driver)employeeDriver).drive(); // OK

        // ===================== Downcasting (objects) ======================== //
        /* It is prohibited in Java! Objects can not be downcasted. Remember this. */

        // ===================== Upcasting (variables) ======================== //
        Employee employeeDoctor1 = new Doctor();
        ((Employee)employeeDoctor1).eat();
        // You can do this, but actually there is no use in it.

        // ===================== Upcasting (objects) ======================== //
        Employee employee1 = (Employee) new Doctor();
        // is the same as (ignore var's name):
        Employee employee2 = new Doctor();
        // Upcasting is done here. Upcasting is done automatically. It works for class and subclass.
        // Doctor is Employee's subclass, so upcast this var.
        // And Downcasting is done only manually, not automatically.

        // ===================== '==' operator ======================== //
        Casting casting = new Casting();
        Employee employeeVar = new Employee();
        System.out.println(employeeVar == employeeDriver); // No error. Objects have IS-A relationship
        // System.out.println(employeeVar == casting); // Error. == only works when IS-A relationship presents,
        // but Casting is not Employee
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

class Doctor extends Employee {
    String specialization = "Dentist";

    void cure() {
        System.out.println("Cure");
    }
}

class Teacher extends Employee {
    int studentsAmount;

    void teach() {
        System.out.println("Teach");
    }
}

class Driver extends Employee implements Helpable {

    String carName;

    @Override
    public void help() {
        System.out.println("Driver helps");
    }

    void drive() {
        System.out.println("Drive");
    }
}

interface Helpable {

    void help();
}

package com.example.myFirstJavaPackage.classes.overloading;

public class Employee {
    int employeeId;
    public String employeeSurname;
    int employeeAge;
    private double employeeSalary;
    String employeeDepartment;

    public Employee(String surname1, int age1) {
        this(0, surname1, age1, 0, null);
        // this = call the overloading constructor of this class
        // with 5 parameters
    }
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0, null);
        // this = call the overloading constructor of this class
        // with 5 parameters
    }
    private Employee(int id3, String surname3, int age3, int salary3, String department3) {
        employeeId = id3;
        employeeSurname = surname3;
        employeeAge = age3;
        employeeSalary = salary3;
        employeeDepartment = department3;
    }

    public void printEmployeeSalary() {
        System.out.println(employeeSalary);
    }
    public void printEmployeeSurname() {
        System.out.println(employeeSurname);
    }
    public void printEmployeeId() {
        System.out.println(employeeId);
    }

}

class ClassOverloading {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ivanov", 25);
        System.out.println(employee.employeeSurname);

        Employee employee1 = new Employee("Magus", 17);
        System.out.println(employee1.employeeDepartment);
    }
}

/*
public class Employee {
    int employeeId;
    String employeeSurname;
    int employeeAge;
    double employeeSalary;
    String employeeDepartment;

    Employee(String surname1, int age1) {
        employeeSurname = surname1;
        employeeAge = age1;
    }
    Employee(int id2, String surname2, int age2) {
        this(surname2, age2); // call the overloading constructor with (String, int)
        employeeId= id2;
    }
    Employee(int id3, String surname3, int age3, int salary3, String department3) {
        this(id3, surname3, age3); // call the overloading constructor with (int, String, int)
        employeeSalary = salary3;
        employeeDepartment = department3;
    }

}
 */

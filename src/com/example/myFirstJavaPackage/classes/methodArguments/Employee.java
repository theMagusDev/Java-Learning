package com.example.myFirstJavaPackage.classes.methodArguments;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double doubleDigit(double a) {
        return a * 2;
    }

    public void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeProgram {

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 100.5);

        System.out.println(employee.doubleDigit(employee.salary));
        System.out.println(employee.salary);

        employee.doubleSalary();
        System.out.println(employee.salary);
    }
}

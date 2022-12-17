package com.example.myFirstJavaPackage.lambdas.homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeProgram {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Boss", 100000);
        Employee employee2 = new Employee("Elena", "IT", 125000);
        Employee employee3 = new Employee("Peter", "Driver", 25000);
        Employee employee4 = new Employee("Poly", "Director", 120000);
        Employee employee5 = new Employee("Kolya", "Cleaner", 35000);
        Employee employee6 = new Employee("Irina", "IT", 85000);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        employeeArrayList.add(employee6);

        filterEmployees(employeeArrayList, employee -> employee.department.equals("IT") && employee.salary > 100000);
        filterEmployees(employeeArrayList, employee -> employee.name.startsWith("P") && employee.salary == 25000);
        filterEmployees(employeeArrayList, employee -> employee.name.startsWith(employee.department.substring(0, 1)));

    }

    static void printEmployee(Employee employee) {
        System.out.println("Employee with name: " + employee.name
                + ", department: " + employee.department
                + ", salary: " + employee.salary);
    }

    static void filterEmployees(ArrayList<Employee> employeeArrayList, Predicate<Employee> employeePredicate) {
        for (Employee employee : employeeArrayList) {
            if (employeePredicate.test(employee)) {
                printEmployee(employee);
            }
        }
    }
}

class Employee {

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    String name;
    String department;
    int salary;

}

package com.example.myFirstJavaPackage.statements.accessModifiers.subpackage;

import com.example.myFirstJavaPackage.statements.accessModifiers.Employee;

public class SubpackageClass {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Magus", 17);
        // (1, "Magus", 17) -> 'Employee(int, java.lang.String, int)' is not public. Cannot be accessed from outside package
        // (1, "Magus", 17, 2500, "Main") -> 'Employee(int, java.lang.String, int, int, java.lang.String)' has private access

        // employeeId -> variable is not public. Cannot be accessed from outside package
        System.out.println(employee1.employeeSurname); // variable is public, so no error here
        // employeeAge -> variable is not public. Cannot be accessed from outside package
        // employeeSalary -> variable has private access. Cannot be accessed from outside package
        // employeeDepartment -> variable is not public. Cannot be accessed from outside package

        System.out.println(); // separator

        employee1.printEmployeeId();
        employee1.printEmployeeSurname();
        employee1.printEmployeeSalary();
    }
}

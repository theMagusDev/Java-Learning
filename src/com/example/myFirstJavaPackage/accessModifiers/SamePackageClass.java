package com.example.myFirstJavaPackage.accessModifiers;

public class SamePackageClass {

    public static void main(String[] args) {

        com.example.myFirstJavaPackage.accessModifiers.Employee employee1 = new com.example.myFirstJavaPackage.accessModifiers.Employee("Magus", 17);
        com.example.myFirstJavaPackage.accessModifiers.Employee employee2 = new com.example.myFirstJavaPackage.accessModifiers.Employee(1, "Magus", 17);
        // (1, "Magus", 17, 2500, "Main") -> 'Employee(int, java.lang.String, int, int, java.lang.String)' has private access

        System.out.println(employee1.employeeId); // same package
        System.out.println(employee1.employeeSurname); // variable is public, so no error here
        System.out.println(employee1.employeeAge);
        // employeeSalary -> variable has private access
        System.out.println(employee1.employeeDepartment);

        System.out.println(); // separator

        employee1.printEmployeeId();
        employee1.printEmployeeSurname();
        employee1.printEmployeeSalary();
    }
}

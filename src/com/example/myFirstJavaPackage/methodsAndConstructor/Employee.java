package com.example.myFirstJavaPackage.methodsAndConstructor;

public class Employee {
    int employeeId;
    String employeeSurname;
    int employeeAge;
    double employeeSalary;
    String employeeDepartment;
    Employee(int id, String surname, int age, double salary, String department) {
        employeeId = id;
        employeeSurname = surname;
        employeeAge = age;
        employeeSalary = salary;
        employeeDepartment = department;
    }

    void doubleSalary() {
        employeeSalary *= 2;
    }

    void getEmployeeInfo() {
        System.out.println("=== Employee info ===");
        System.out.println("ID: " + employeeId);
        System.out.println("Surname: " + employeeSurname);
        System.out.println("Age:" + employeeAge);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Department: " + employeeDepartment);
        System.out.println();
    }

}

class EmployeeProgram {

    public static void main(String[] args) {

        Employee employee1 = new Employee(
                1,
                "Magus",
                17,
                100000,
                "Yandex"
        );

        Employee employee2 = new Employee(
                2,
                "Timan",
                17,
                150000,
                "MailRu"
        );

        employee1.doubleSalary();
        employee2.doubleSalary();

        employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
    }
}

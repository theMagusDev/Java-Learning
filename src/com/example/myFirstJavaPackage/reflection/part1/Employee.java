package com.example.myFirstJavaPackage.reflection.part1;

/*
Рефлексия - это механизм исследования данных о программе во время её выполнения.
Рефлексия позволяет исследовать информацию о полях, методах, контрукторах и других составляющих классов.
 */
public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    public void doubleSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
package com.example.myFirstJavaPackage.interfaces.comparator;

// Just compares 2 objects (does not belong to some of them, just a separate method)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(2, "Zaur", "Tregulov", 14500);
        Employee employee2 = new Employee(3, "Ivan", "Ivanov", 11500);
        Employee employee3 = new Employee(1, "Artem", "Pasechnik", 27500);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("List before sorting: " + employees);
        /*
        List before sorting: [Employee{id=2, name='Zaur', surname='Tregulov', salary=14500},
        Employee{id=3, name='Ivan', surname='Ivanov', salary=11500},
        Employee{id=1, name='Artem', surname='Pasechnik', salary=27500}]
        */

        // sort by id
        Collections.sort(employees, new IdComparator());
        // sort by name
        Collections.sort(employees, new NameComparator());

        System.out.println("List after sorting: " + employees);
        /*
        List after sorting: [Employee{id=1, name='Artem', surname='Pasechnik', salary=27500},
        Employee{id=2, name='Zaur', surname='Tregulov', salary=14500},
        Employee{id=3, name='Ivan', surname='Ivanov', salary=11500}]
         */
    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id - emp2.id;
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class Employee {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

}
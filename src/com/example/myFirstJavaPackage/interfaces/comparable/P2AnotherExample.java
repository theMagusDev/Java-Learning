package com.example.myFirstJavaPackage.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable - возможный для сравнения

public class P2AnotherExample {

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

//      Collections.sort(employees);
        /* Error: reason: Employee does not conform to Comparable<? super T>
        From Collections.java:
         public static <T extends Comparable<? super T>> void sort(List<T> list) {
             list.sort(null);
         }
         */

        // After implementation
        Collections.sort(employees);
        System.out.println("List after sorting: " + employees);
        /*
        List after sorting: [Employee{id=1, name='Artem', surname='Pasechnik', salary=27500},
        Employee{id=2, name='Zaur', surname='Tregulov', salary=14500},
        Employee{id=3, name='Ivan', surname='Ivanov', salary=11500}]
         */

        // Arrays class have sort() method, but if we do so:
//      Arrays.sort(new Employee[] {employee1, employee2, employee3});
        // we will get a RunTime exception.
    }
}

/* Before:
class Employee {
    int id;
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
 */

// After:

class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee anotherEmp) {
        // Convention:
        // n < 0 if current is less than the one being compared with
        // n > 0 if current is greater than the one being compared with
        // n = 0 if they are equal

        /* Решение "в лоб":
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
         */

        // Оптимальное решение:
        return this.id - anotherEmp.id;

        // С помощью Comparable полей (Integer implements compareTo):
//      return this.id.compareTo(anotherEmp.id);
    }
}
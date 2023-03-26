package com.example.myFirstJavaPackage.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Дан список студентов. Отсортируйте его в несколько уровней, сравнивая так:
Сортировка для журнала:
 а) По имени
 б) По фамилии
 в) По курсу
 */
public class P3Practice {

    public static void main(String[] args) {

        // data
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ann", "Kolobova", 3));
        studentList.add(new Student("Peter", "Kuibishev", 1));
        studentList.add(new Student("Anastasia", "Ostankina", 3));
        studentList.add(new Student("Bob", "Zibulko", 3));
        studentList.add(new Student("Ann", "Zibulko", 2));
        studentList.add(new Student("Artem", "Izmailov", 3));
        studentList.add(new Student("Yuriy", "Magus", 2));
        studentList.add(new Student("Masha", "Svidrigailova", 1));
        studentList.add(new Student("Mikhail", "Raskolnikov", 2));
        studentList.add(new Student("Mishel", "Luberetskiy", 3));
        studentList.add(new Student("Polina", "Ahmatova", 1));
        studentList.add(new Student("Zaur", "Tregulov", 3));
        studentList.add(new Student("Peter", "Ostankin", 4));

        Collections.sort(studentList);

        System.out.println("Sorted list: ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        /* Output:
        Student{name='Anastasia', surname='Ostankina', course=3, salary=0}
        Student{name='Ann', surname='Kolobova', course=3, salary=0}
        Student{name='Ann', surname='Zibulko', course=2, salary=0}
        Student{name='Artem', surname='Izmailov', course=3, salary=0}
        Student{name='Bob', surname='Zibulko', course=3, salary=0}
        Student{name='Masha', surname='Svidrigailova', course=1, salary=0}
        Student{name='Mikhail', surname='Raskolnikov', course=2, salary=0}
        Student{name='Mishel', surname='Luberetskiy', course=3, salary=0}
        Student{name='Peter', surname='Kuibishev', course=1, salary=0}
        Student{name='Peter', surname='Ostankin', course=4, salary=0}
        Student{name='Polina', surname='Ahmatova', course=1, salary=0}
        Student{name='Yuriy', surname='Magus', course=2, salary=0}
        Student{name='Zaur', surname='Tregulov', course=3, salary=0}
         */
    }
}

class Student implements Comparable<Student> {
    String name;
    String surname;
    int course;
    int salary;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student(String name, String surname, int course, int salary) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Student anotherStudent) {
        if (this.name.compareTo(anotherStudent.name) == 0) {
            if (this.surname.compareTo(anotherStudent.surname) == 0) {
                if (this.course == anotherStudent.course) {
                    return 0;
                } else {
                    return this.course - anotherStudent.course;
                }
            } else {
                return this.surname.compareTo(anotherStudent.surname);
            }
        } else {
            return this.name.compareTo(anotherStudent.name);
        }
    }
}

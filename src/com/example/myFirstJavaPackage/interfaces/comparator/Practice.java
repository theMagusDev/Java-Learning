package com.example.myFirstJavaPackage.interfaces.comparator;

/* Дан список студентов. Отсортируйте его в несколько уровней, сравнивая так:
1) Сортировка для журнала:
 а) По имени (А-Я)
 б) По фамилии (А-Я)
 в) По курсу (1-4)
2) Сортировка самых успешных:
 а) По з/п (max - min)
 б) По имени (А-Я)
 в) По фамилии (А-Я)
3) Сортировка самых опытных:
 а) По курсу (4-1)
 б) По з/п (max - min)
 в) По имени (А-Я)
 г) По фамилии (А-Я)
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        // data
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ann", "Kolobova", 3, 25000));
        studentList.add(new Student("Peter", "Kuibishev", 1));
        studentList.add(new Student("Anastasia", "Ostankina", 3));
        studentList.add(new Student("Bob", "Zibulko", 3, 37500));
        studentList.add(new Student("Ann", "Zibulko", 2, 17500));
        studentList.add(new Student("Artem", "Izmailov", 3, 55000));
        studentList.add(new Student("Yuriy", "Magus", 2, 185000));
        studentList.add(new Student("Masha", "Svidrigailova", 1, 15000));
        studentList.add(new Student("Mikhail", "Raskolnikov", 2));
        studentList.add(new Student("Mishel", "Luberetskiy", 4, 89000));
        studentList.add(new Student("Polina", "Ahmatova", 1));
        studentList.add(new Student("Zaur", "Tregulov", 3));
        studentList.add(new Student("Peter", "Ostankin", 4, 135000));

        // sorting #1
        studentList.sort(new JournalComparator());
        System.out.println("Journal sorted list: ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // sorting #2
        studentList.sort(new SuccessfulComparator());
        System.out.println("Successful students sorted list: ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // sorting #3
        studentList.sort(new ExperienceComparator());
        System.out.println("Experienced students sorted list: ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        /* Output:

        Journal sorted list:
         Student{name='Anastasia', surname='Ostankina', course=3, salary=0}
         Student{name='Ann', surname='Kolobova', course=3, salary=25000}
         Student{name='Ann', surname='Zibulko', course=2, salary=17500}
         Student{name='Artem', surname='Izmailov', course=3, salary=55000}
         Student{name='Bob', surname='Zibulko', course=3, salary=37500}
         Student{name='Masha', surname='Svidrigailova', course=1, salary=15000}
         Student{name='Mikhail', surname='Raskolnikov', course=2, salary=0}
         Student{name='Mishel', surname='Luberetskiy', course=4, salary=89000}
         Student{name='Peter', surname='Kuibishev', course=1, salary=0}
         Student{name='Peter', surname='Ostankin', course=4, salary=135000}
         Student{name='Polina', surname='Ahmatova', course=1, salary=0}
         Student{name='Yuriy', surname='Magus', course=2, salary=185000}
         Student{name='Zaur', surname='Tregulov', course=3, salary=0}

        Successful students sorted list:
         Student{name='Yuriy', surname='Magus', course=2, salary=185000}
         Student{name='Peter', surname='Ostankin', course=4, salary=135000}
         Student{name='Mishel', surname='Luberetskiy', course=4, salary=89000}
         Student{name='Artem', surname='Izmailov', course=3, salary=55000}
         Student{name='Bob', surname='Zibulko', course=3, salary=37500}
         Student{name='Ann', surname='Kolobova', course=3, salary=25000}
         Student{name='Ann', surname='Zibulko', course=2, salary=17500}
         Student{name='Masha', surname='Svidrigailova', course=1, salary=15000}
         Student{name='Anastasia', surname='Ostankina', course=3, salary=0}
         Student{name='Mikhail', surname='Raskolnikov', course=2, salary=0}
         Student{name='Peter', surname='Kuibishev', course=1, salary=0}
         Student{name='Polina', surname='Ahmatova', course=1, salary=0}
         Student{name='Zaur', surname='Tregulov', course=3, salary=0}

        Experienced students sorted list:
         Student{name='Peter', surname='Ostankin', course=4, salary=135000}
         Student{name='Mishel', surname='Luberetskiy', course=4, salary=89000}
         Student{name='Artem', surname='Izmailov', course=3, salary=55000}
         Student{name='Bob', surname='Zibulko', course=3, salary=37500}
         Student{name='Ann', surname='Kolobova', course=3, salary=25000}
         Student{name='Anastasia', surname='Ostankina', course=3, salary=0}
         Student{name='Zaur', surname='Tregulov', course=3, salary=0}
         Student{name='Yuriy', surname='Magus', course=2, salary=185000}
         Student{name='Ann', surname='Zibulko', course=2, salary=17500}
         Student{name='Mikhail', surname='Raskolnikov', course=2, salary=0}
         Student{name='Masha', surname='Svidrigailova', course=1, salary=15000}
         Student{name='Peter', surname='Kuibishev', course=1, salary=0}
         Student{name='Polina', surname='Ahmatova', course=1, salary=0}
         */


    }
}

// task #1
class JournalComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            if (student1.surname.equals(student2.surname)) {
                if (student1.course == student2.course) {
                    return 0;
                } else {
                    return student1.course - student2.course;
                }
            } else {
                return student1.surname.compareTo(student2.surname);
            }
        } else {
            return student1.name.compareTo(student2.name);
        }
    }
}

// task #2
class SuccessfulComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.salary == student2.salary) {
            if (student1.name.equals(student2.name)) {
                if (student1.surname.equals(student2.surname)) {
                    return 0;
                } else {
                    return student1.surname.compareTo(student2.surname);
                }
            } else {
                return student1.name.compareTo(student2.name);
            }
        } else {
            return (student1.salary - student2.salary) * -1; // in reverse order
        }
    }
}

// task #3
class ExperienceComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.course == student2.course) {
            if (student1.salary == student2.salary) {
                if (student1.name.equals(student2.name)) {
                    if (student1.surname.equals(student2.surname)) {
                        return 0;
                    } else {
                        return student1.surname.compareTo(student2.surname);
                    }
                } else {
                    return student1.name.compareTo(student2.name);
                }
            } else {
                return (student1.salary - student2.salary * -1);
            }
        } else {
            return (student1.course - student2.course) * -1;
        }
    }
}

class Student {
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

}

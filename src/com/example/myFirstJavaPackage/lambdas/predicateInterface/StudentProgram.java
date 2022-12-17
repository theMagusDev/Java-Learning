package com.example.myFirstJavaPackage.lambdas.predicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;
public class StudentProgram {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student student2 = new Student("Peter", 'M', 25, 6, 6.4);
        Student student3 = new Student("Elena", 'F', 21, 2, 9.7);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        for (Student student: arrayList) {
            System.out.println(student.name);
        }
        /*
        Ivan
        Peter
        Elena
         */

        System.out.println();

        arrayList.removeIf((Student student) -> student.name.endsWith("a"));
        for (Student student: arrayList) {
            System.out.println(student.name);
        }
        /*
        Ivan
        Peter
         */
    }
}

class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public static void printStudent(Student student) {

        System.out.println("Student with name: " + student.name
                + ", sex: " + student.sex
                + ", age: " + student.age
                + ", course: " + student.course
                + ", avgGrade: " + student.avgGrade);
    }

    public static void testStudents(ArrayList<Student> studentArrayList, Predicate<Student> studentChecks) {

        for (Student student : studentArrayList) {
            if (studentChecks.test(student)) {
                printStudent(student);
            }
        }

    }
}

interface StudentChecks {
    boolean testStudent(Student student);
}

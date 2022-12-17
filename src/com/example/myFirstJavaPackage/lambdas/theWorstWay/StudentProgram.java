package com.example.myFirstJavaPackage.lambdas.theWorstWay;

import java.util.ArrayList;

public class StudentProgram {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student student2 = new Student("Peter", 'M', 25, 6, 6.4);
        Student student3 = new Student("Elena", 'F', 21, 2, 9.7);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        Student.printStudentsOverGrade(arrayList, 8.5);
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

    public static void printStudentsOverGrade(ArrayList<Student> studentArrayList, double avgGrade) {

        for (Student student : studentArrayList) {
            if (student.avgGrade > avgGrade) {
                printStudent(student);
            }
        }
    }

    public static void printStudentsUnderGrade(ArrayList<Student> studentArrayList, double avgGrade) {

        for (Student student : studentArrayList) {
            if (student.avgGrade < avgGrade) {
                printStudent(student);
            }
        }
    }
}

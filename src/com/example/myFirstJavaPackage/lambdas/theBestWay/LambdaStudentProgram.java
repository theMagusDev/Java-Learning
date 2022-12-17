package com.example.myFirstJavaPackage.lambdas.theBestWay;

import java.util.ArrayList;
public class LambdaStudentProgram {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student student2 = new Student("Peter", 'M', 25, 6, 6.4);
        Student student3 = new Student("Elena", 'F', 21, 2, 9.7);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        // > 8.3
        Student.testStudents(arrayList, (Student student) -> { return student.avgGrade > 8.3; } );
        // Student with name: Elena, sex: F, age: 21, course: 2, avgGrade: 9.7

        // < 8.3
        Student.testStudents(arrayList, (Student student) -> { return student.avgGrade < 8.3; });
        // Student with name: Peter, sex: M, age: 25, course: 6, avgGrade: 6.4

        // age > 21
        Student.testStudents(arrayList, (Student student) -> student.age > 21 );
        // Student with name: Ivan, sex: M, age: 22, course: 3, avgGrade: 8.3

        // age < 21
        Student.testStudents(arrayList, student -> { return student.age < 21; } );
        // Student with name: Peter, sex: M, age: 25, course: 6, avgGrade: 6.4

        // 21 < age < 24
        Student.testStudents(arrayList, student -> student.age > 21 && student.age < 24);
        // Student with name: Ivan, sex: M, age: 22, course: 3, avgGrade: 8.3

        // males with age > 23 with grade < 7.0
        Student.testStudents(arrayList, (Student student) -> student.sex == 'M' && student.age > 23 && student.avgGrade < 7.0);
        // Student with name: Peter, sex: M, age: 25, course: 6, avgGrade: 6.4

        // Note: lambdas are something like anonymous methods in Java
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

    public static void testStudents(ArrayList<Student> studentArrayList, StudentChecks studentChecks) {

        for (Student student : studentArrayList) {
            if (studentChecks.testStudent(student)) {
                printStudent(student);
            }
        }

    }
}

interface StudentChecks { // Functional interface. Contains only one abstract method
    boolean testStudent(Student student); // functional method

    default ArrayList<Student> filterStudents(ArrayList<Student> studentArrayList) {
        ArrayList<Student> resultArrayList = new ArrayList<>();
        for (Student student: studentArrayList) {
            if (student.avgGrade >= 4.5) {
                resultArrayList.add(student);
            }
        }
        return  resultArrayList;
    }

    static void printStudentsName(ArrayList<Student> studentArrayList) {
        for (var student: studentArrayList) {
            System.out.println(student.name);
        }
    }

    // Note: interface contains 3 methods, but only 1 is abstract, so it is still functional
}

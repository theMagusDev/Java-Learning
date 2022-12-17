package com.example.myFirstJavaPackage.lambdas.theBetterWay;

import java.util.ArrayList;

public class NewStudentProgram {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Ivan", 'M', 22, 3, 8.3);
        Student student2 = new Student("Peter", 'M', 25, 6, 6.4);
        Student student3 = new Student("Elena", 'F', 21, 2, 9.7);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        System.out.println("Students with grade > 8.3:");
        Student.testStudents(arrayList, new FindNewStudentsOverGrade());
        System.out.println("Students with grade < 8.3:");
        Student.testStudents(arrayList, new FindNewStudentsUnderGrade());
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

    public static void testStudents(ArrayList<Student> studentArrayList, NewStudentChecks newStudentChecks) {

        for (Student student : studentArrayList) {
            if (newStudentChecks.testStudent(student)) {
                printStudent(student);
            }
        }

    }
}

interface NewStudentChecks {
    boolean testStudent(Student student);
}

class FindNewStudentsOverGrade implements NewStudentChecks {
    public boolean testStudent(Student student) {
        return student.avgGrade > 8.3;
    }
}

class FindNewStudentsUnderGrade implements NewStudentChecks {
    public boolean testStudent(Student student) {
        return student.avgGrade < 8.3;
    }
}

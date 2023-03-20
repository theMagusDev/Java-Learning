package com.example.myFirstJavaPackage.classes.methodArguments;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void changeName(Student student, String newName) {
        student.name = newName;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 3, 9.5);
        Student student2 = new Student("Peter", 1, 5.3);

        changeName(student1, "Yuriy");
        System.out.println(student1.name);
        // Output: Yuriy
    }
}

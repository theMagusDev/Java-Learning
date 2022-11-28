package com.example.myFirstJavaPackage.switchStatement;

public class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student student = new Student(3);

        switch (student.grade) {
            case 1, 2 -> System.out.println("Bad");
            case 3 -> System.out.println("Ok");
            case 4 -> System.out.println("Good");
            case 5 -> System.out.println("Excellent");
            default -> System.out.println("Incorrect grade!");
        }
    }
}

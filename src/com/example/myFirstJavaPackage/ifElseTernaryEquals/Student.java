package com.example.myFirstJavaPackage.ifElseTernaryEquals;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void compareStudents(Student student1, Student student2) {
        if (student1.equals(student2))
            System.out.println("Student #1 " + student1.name + " and Student #2 " + student2.name + " are the same.");
        else
            System.out.println("Student #1 " + student1.name + " and Student #2 " + student2.name + " are different.");
    }

    public static void compareStudentsInDetail(Student student1, Student student2) {
        if (student1.equals(student2)) {
            System.out.println("Students " + student1.name + " and " + student2.name + " are the same.");
        } else {
            System.out.println("Students " + student1.name + " and " + student2.name + " are different:");
            if (!student1.name.equals(student2.name)) {
                System.out.println("Student #1 name (" + student1.name + ") is not equal to Student #2 name (" + student2.name + ")");
            }
            if (student1.course != student2.course) {
                System.out.println("Student #1 course (" + student1.course + ") is not equal to Student #2 course (" + student2.course + ")");
            }
            if (student1.grade != student2.grade) {
                System.out.println("Student #1 grade (" + student1.grade + ") is not equal to Student #2 grade (" + student2.grade + ")");
            }
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 1, 5.3);
        Student student2 = new Student("Peter", 1, 5.3);

        compareStudents(student1, student2);

        System.out.println(); // separator

        compareStudentsInDetail(student1, student2);
    }
}

package com.example.myFirstJavaPackage.classes.oop.inheritance.homework;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public String getName() {
        return new String(name);
    }
    public void setName(String name) {
        if (name.length() > 2)
            this.name = new StringBuilder(name);
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if (course > 0 && course <= 4)
            this.course = course;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10)
            this.grade = grade;
    }

    public void showInfo() {
        System.out.println("=== Student " + getName() + " info ===");
        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}

class StudentProgram {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Ivan");
        student.setCourse(1);
        student.setGrade(5);
        student.showInfo();

        student.setCourse(234);
        student.setName("Ya");
        student.setGrade(-233);
        student.showInfo();

        // Outputs are the same thanks to the check in setters
    }
}

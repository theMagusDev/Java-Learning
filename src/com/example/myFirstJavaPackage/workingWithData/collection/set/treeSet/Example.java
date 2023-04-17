package com.example.myFirstJavaPackage.workingWithData.collection.set.treeSet;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

public class Example {

    public static void main(String[] args) {

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        Student student1 = new Student("Zaur", 4);
        Student student2 = new Student("Ivan", 1);
        Student student3 = new Student("Nastya", 2);
        Student student4 = new Student("Yuriy", 1);
        Student student5 = new Student("Fedor", 1);
        Student student6 = new Student("Irina", 3);

        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);
        studentTreeSet.add(student5);
        studentTreeSet.add(student6);

        System.out.println(studentTreeSet);
        // [Student{name='Ivan', course=1}, Student{name='Nastya', course=2}, Student{name='Irina', course=3}, Student{name='Zaur', course=4}]\
    }
}


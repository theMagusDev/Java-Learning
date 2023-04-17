package com.example.myFirstJavaPackage.workingWithData.collection.queue.priorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    String name;
    int course;
    int salary;

    public Student(String name, int course, int salary) {
        this.name = name;
        this.course = course;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && salary == student.salary && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, salary);
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (this.salary == otherStudent.salary) {
            if (this.course == otherStudent.course) {
                if (this.name == otherStudent.name) {
                    return 0;
                } else {
                    return this.name.compareTo(otherStudent.name);
                }
            } else {
                return (this.course - otherStudent.course) * -1;
            }
        } else {
            return (this.salary - otherStudent.salary) * -1;
        }
    }

}

public class StudentPriorityQueue {

    public static void main(String[] args) {

        // Составим список, с кем лучше познакомиться в первую очередь

        Student student1 = new Student("Petr", 3, 125000);
        Student student2 = new Student("Ivan", 3, 35000);
        Student student3 = new Student("Alexandr", 2, 125000);
        Student student4 = new Student("Elena", 4, 135000);
        Student student5 = new Student("Evgeniy", 1, 37500);
        Student student6 = new Student("Anastasia", 1, 55000);

        PriorityQueue<Student> priorityQueueToMeetWith = new PriorityQueue<>();
        priorityQueueToMeetWith.add(student1);
        priorityQueueToMeetWith.add(student2);
        priorityQueueToMeetWith.add(student3);
        priorityQueueToMeetWith.add(student4);
        priorityQueueToMeetWith.add(student5);
        priorityQueueToMeetWith.add(student6);

        System.out.println(priorityQueueToMeetWith);
        // [Student{name='Elena', course=4, salary=135000}, Student{name='Petr', course=3, salary=125000}, Student{name='Alexandr', course=2, salary=125000}, Student{name='Ivan', course=3, salary=35000}, Student{name='Evgeniy', course=1, salary=37500}, Student{name='Anastasia', course=1, salary=55000}]
    }
}



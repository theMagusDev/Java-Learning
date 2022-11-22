package com.example.myFirstJavaPackage.nonAccessModifiers.staticModifier;

public class Student {

    String name; // instance variable
    int course; // instance variable
    public static int counter; // class variable

    // What is a class variable:
    /*
    Class variable = one variable for all objects.
    Objects can modify it, however this var belongs
    not to them, but to their Class
     */

    public Student(String studentName, int studentCourse) {
        counter++;
        name = studentName;
        course = studentCourse;
        System.out.println("Student #" + counter + " was created!");
    }

    public static void printCount() {
        System.out.println("Number of students: " + counter);
    }

    public void printGreeting() {
        System.out.println("Welcome to the Student class!");
    }

    void incrementCourseNonstatic() {
        course++;
        counter++;
    }

    static void incrementCourseStatic() {
        counter++;
        // course++ -> Error: Non-static cannot be referenced from a static
        // But, if we create an object
        Student student = new Student("Nastya", 1);
        // We say: "This object 100% exists"
        student.course++;
    }

}

class StudentProgram {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 1);
        Student student2 = new Student("Peter", 4);
        Student student3 = new Student("Maria", 2);

        System.out.println(Student.counter); // Best practice
        System.out.println(student1.counter); // Not recommended

        // Conclusion: we can call Class's static methods
        // without creating an instance from this Class

        Student.printCount(); // Best practice
        student1.printCount(); // Not recommended

    }
}

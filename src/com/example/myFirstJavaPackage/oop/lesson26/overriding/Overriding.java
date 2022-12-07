package com.example.myFirstJavaPackage.oop.lesson26.overriding;

/** Methods are overriding when:
 * 1) Name is the same
 * 2) Parameters are the same
 * 3) Return type is:
 * 3.1) the same [for primitive types]
 * 3.2) the same class OR subclass from the same superclass [for reference types]
 * 4) Access modifier in subclass is the same or less strict, then in superclass
 * (because if it is stricter, then children of this subclass will not see this method, but they must because of inheritance rules)
 * 5) Subclass method must also be non-static, non-private and non-final
 * 6) Not final
 */

public class Overriding {

    public static void main(String[] args) {
        Employee employee = new Teacher();
        Teacher teacher = new Teacher();
        employee.eat(); // Teacher eats
        // employee.teach(); // error.
        // Why? Using such ref. var we can call only methods of class Employee. So here the 'compile time binding' works.
        // If these methods were overridden (both Employee and Teacher have them), then this line would call Teacher's method.
        teacher.eat(); // Teacher eats
        teacher.sleep(); // Teacher sleeps

    }
}

class Employee {
    String name;
    int age;

    void eat() {
        System.out.println("Employee eats");
    }
    protected void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee {
    int studentsAmount;
    @Override
    void eat() { // overriding method
        System.out.println("Teacher eats");
    }
    @Override
    public void sleep() {
        System.out.println("Teacher sleeps");
    }

    void teach() {
        System.out.println("Teach");
    }
}

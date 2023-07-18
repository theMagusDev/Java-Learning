package com.example.myFirstJavaPackage.annotations;

@MyAnnotation
public class Person {
    @MyAnnotation // we can mark anything with it
    String name;
    double salary;

    @MyAnnotation
    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void doubleSalary() {
        this.salary *= 2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@interface MyAnnotation {

}

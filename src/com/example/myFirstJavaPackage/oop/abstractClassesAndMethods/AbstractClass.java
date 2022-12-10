package com.example.myFirstJavaPackage.oop.abstractClassesAndMethods;

public class AbstractClass {

    public static void main(String[] args) {

        Figure figure = new Square();
        System.out.println(figure.sides);
        figure.area();
    }
}

abstract class Figure {

    int sides;
    // abstract int sides; // Error
    abstract void perimeter();
    abstract void area(); //
    // abstract void area(){}; // Error: abstract void can not have body (even empty)
    /*
     * All children will have these methods,
     * but their realization will be different.
     */
    void showInfo() {
        System.out.println("This is a figure");
    }
}

class Square extends Figure {

    int sides = 4;
    int side = 10;
    @Override
    void perimeter() {
        System.out.println("Perimeter of square is " + sides * side);
    }
    @Override
    void area() {
        System.out.println("Area of square is " + side * side);
    }
    void hello() {
        System.out.println("I am square.");
    }
}

class BigSquare extends Square {
    // No error here. BigSquare do not have to override super superclass' abstract methods
    // Why? Because Square (parent) has already overridden abstract methods.
}

class Rectangle extends Figure {

    int side1 = 5;
    int side2 = 10;
    @Override
    void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (side1 + side2));
    }
    @Override
    void area() {
        System.out.println("Area of rectangle is " + side1 * side2);
    }
}

class Circle extends Figure {

    int radius = 3;
    @Override
    void perimeter() {
        System.out.println("Perimeter of circle is " + 2 * 3.14 * radius);
    }
    @Override
    void area() {
        System.out.println("Area of rectangle is " + 3.14 * radius * radius);
    }
}

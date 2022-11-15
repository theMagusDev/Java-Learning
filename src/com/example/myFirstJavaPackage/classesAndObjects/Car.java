package com.example.myFirstJavaPackage.Lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarProgram {

    public static void main(String[] args) {

        int a;

        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";

        System.out.println("Color: " + car1.color);
        System.out.println("Motor: " + car1.engine);
    }
}

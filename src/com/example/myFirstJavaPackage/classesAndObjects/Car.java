package com.example.myFirstJavaPackage.classesAndObjects;

public class Car {
    Car(String myColor, String myEngine) { // User-defined constructor
        color = myColor;
        engine = myEngine;
        System.out.println("Car object is created.");
    }

    String color;
    String engine;
}

class CarConstructor {

    public static void main(String[] args) {

        Car car1 = new Car("Yellow", "V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
/*
class CarProgram {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.color = "black";
        myCar.engine = "V8";

        System.out.println("Color: " + myCar.color);
        System.out.println("Motor: " + myCar.engine);
    }

}
*/

package com.example.myFirstJavaPackage.stringClass.basics;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public static Car createTurboCar(String color) {
        Car car = new Car(color, "V8");
        return car;
    }

    public static void main(String[] args) {

        Car car = createTurboCar("white");
        System.out.println(car.color);
    }
}


package com.example.myFirstJavaPackage.equalsToStringWrapper;

import java.util.ArrayList;

public class CarProgram {

    public static void main(String[] args) {

        Car car1 = new Car("blue", "V4");
        Car car2 = new Car("blue", "V4");
        Car car3 = new Car("orange", "V6");

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);

        System.out.println(list.contains(car2)); // true

        System.out.println(car1);

    }
}

class Car {
    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    String color;
    String engine;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return color.equals(car.color) && engine.equals(car.engine);
        } else {
            return this == obj;
        }
    }

    @Override
    public String toString() {
        return "Car #" + hashCode() + " with color: " + color + ", car engine: " + engine;
    }

}
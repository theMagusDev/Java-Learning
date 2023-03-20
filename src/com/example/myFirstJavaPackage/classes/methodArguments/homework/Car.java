package com.example.myFirstJavaPackage.classes.methodArguments.homework;

public class Car {

    int id;
    static int counter;
    public String color;
    String engine;
    public int doorsAmount;

    Car(String color, String engine, int doorsAmount) {
        counter++;
        this.id = counter;
        this.color = color;
        this.engine = engine;
        this.doorsAmount = doorsAmount;
    }

    void printInfo() {
        System.out.println("=== Car #" + id + " info ===");
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Doors amount: " + doorsAmount);
        System.out.println();
    }
}

class CarProgram {

    void changeDoorsAmount(Car car, int newAmount) {
        car.doorsAmount = newAmount;
    }

    void swapColors(Car car1, Car car2) {
        String savedCar1Color = car1.color;
        car1.color = car2.color;
        car2.color = savedCar1Color;
    }

    public static void main(String[] args) {

        Car car1 = new Car("blue", "V6", 4);
        Car car2 = new Car("green", "V8", 2);
        CarProgram carProgram = new CarProgram();

        System.out.println("--- Objects were created. ---");
        car1.printInfo();
        car2.printInfo();

        System.out.println("--- Doors amount was changed. ---");
        carProgram.changeDoorsAmount(car1, 6);
        carProgram.changeDoorsAmount(car2, 8);
        car1.printInfo();
        car2.printInfo();

        System.out.println("--- Cars' colors swapped. ---");
        carProgram.swapColors(car1, car2);
        car1.printInfo();
        car2.printInfo();
    }
}

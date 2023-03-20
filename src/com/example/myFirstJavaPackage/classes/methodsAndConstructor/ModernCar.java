package com.example.myFirstJavaPackage.classes.methodsAndConstructor;

public class ModernCar {
    String color;
    String engine;
    int speed = 0;

    void speedUp(int increaseOn) {
        speed += increaseOn;
    }

    void slowDown(int decreaseOn) {
        speed -= decreaseOn;
    }

    void showInfo() {
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Speed: " + speed);
    }

}

class DriveCar {

    public static void main(String[] args) {

        ModernCar modernCar = new ModernCar();
        modernCar.color = "White";
        modernCar.engine = "V6";
        modernCar.speed = 60;

        modernCar.showInfo();

        modernCar.speedUp(20);
        modernCar.showInfo();

        modernCar.slowDown(120);
        modernCar.showInfo();
    }
}

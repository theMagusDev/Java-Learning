package com.example.myFirstJavaPackage.classes.variablesAndVisibility;

public class Car {
    public String color; // instance variable. Is visible in Instances (objects)
    public String engine;
    static int count; // static variable. Is visible in Class
    final int BASE_PRICE = 50000;
    final String DEFAULT_ENGINE = "V6";

    public Car(String _color, String _engine) {
        count++;
        this.color = _color; // i.e. this object color = $color
        this.engine = _engine;
    }

    public Car(String color) {
        this.color = color;
        // 'color' here is parameter var, not instance var
        // and 'this.color' is an instance var
        this.engine = DEFAULT_ENGINE;
    }

    public void printColor() {
        System.out.println("Car's color: " + color);
        changeColor("red"); // 'this' means 'this object', but it's not required here.
        // the line above is equal to: this.changeColor("red");
    }
    public void changeColor(String newColor /* parameter variable. Is visible only in method */) {
        System.out.println("Car's color changed: " + color + " - > " + newColor);
        int price = BASE_PRICE; // local variable. Is visible from creation to '{'
        color = newColor;
        price += 1000;

        int x;
        // System.out.println(x); -> ERROR: local variables do not have default value,
        // so they must be initialized to be used.
    }

    public static void main(String[] args) {

        Car car = new Car("blue", "V6");

    }

}

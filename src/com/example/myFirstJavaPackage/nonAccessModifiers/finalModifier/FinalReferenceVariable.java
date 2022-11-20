package com.example.myFirstJavaPackage.nonAccessModifiers.finalModifier;

public class FinalReferenceVariable {

    public static void main(String[] args) {

        Human human = new Human();
        // human.car = new Car(); -> Error: Cannot change final variable 'car'
        human.car.engine = "V8";
        /*
        * Explanation: Reference 'car' is final, but object is not final
         */
    }
}

class Car {
    String color = "blue";
    String engine = "V6";

}

class Human {
    String name = "Ivan";
    final Car car = new Car();
}

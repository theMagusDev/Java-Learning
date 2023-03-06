package com.example.advancedJava.module5.innerClass.example;

/*
 * Note: Inner nested class object is bound to outer class object.
 * Only after outer class' object was created, then inner class' object can be created.
 */
class CarProgram {

    public static void main(String[] args) {

        Car car = new Car("blue", 4, 325);
        System.out.println(car);
        // My car: {color='blue', doorCount=4, engine=My Engine {horsePower=325}}
    }
}

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private static int carCode;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {

        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

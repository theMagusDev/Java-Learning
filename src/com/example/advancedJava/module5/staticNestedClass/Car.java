package com.example.advancedJava.module5.staticNestedClass;

/*
* Note: Static nested class object is not bound to outer class object.
* But inner classes are (see innerClass package)
 */
class CarProgram {

    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(250);
        System.out.println(engine); //My Engine {horsePower=250}
        // Note: we can create Engine object without creating a Car object

        Car car = new Car("blue", 2, engine);
        System.out.println(car);
        //My car: {color='blue', doorCount=2, engine=My Engine {horsePower=250}}
    }
}

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private static int carCode;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println("Amount of created engines: " + Engine.countOfEngines);
        Engine engine1 = new Engine(150);
        // is equal to: Car.Engine engine1 = new Car.Engine(150); // Because this code is in Car class
        System.out.println(engine1.horsePower); // private fields can be accessed from the outer class
    }

    public static class Engine {

        private int horsePower;
        static int countOfEngines;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfEngines++;
            System.out.println(carCode);
            // Note: we can change class Car static vars, but we can not change non-static vars in Car class
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public interface Interface {
        // Nested interfaces also can be created.
    }
}

class Z extends Car.Engine {

    Z(){
        super(200);
    }
}

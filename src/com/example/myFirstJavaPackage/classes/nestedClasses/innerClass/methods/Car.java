package com.example.myFirstJavaPackage.classes.nestedClasses.innerClass.methods;

/*
 * Note: Inner class is linked to its outer class.
 * Only after outer class' object was created, then inner class' object can be created.
 */
class CarProgram {

    public static void main(String[] args) {

        Car car = new Car("blue", 4);
        System.out.println(car);
        // My car: {color='blue', doorCount=4, engine=null}
        Car.Engine engine = car.new Engine(325);
        car.setEngine(engine);
        System.out.println(car);
        // My car: {color='blue', doorCount=4, engine=My Engine {horsePower=325}}
    }
}

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private int carCode;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        System.out.println((new Engine(200)).horsePower);
        // Outer class can access inner class' elements using its instance
    }

    public void setEngine(Engine engine) {
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

    public class Engine {

        private int horsePower;
        public static int engineDBKey = 345325435;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(carCode);
            // inner classes have access to outer class' private elements
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

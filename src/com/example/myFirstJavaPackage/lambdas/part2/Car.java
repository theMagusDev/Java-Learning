package com.example.myFirstJavaPackage.lambdas.part2;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {

    String model;
    String color;
    String engine;

    Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car " + model + "; color: " + color + "; engine: " + engine;
    }
}

class CarProgram {

    public static void main(String[] args) {

        ArrayList<Car> autopark = createThreeCars(() -> new Car("Nissan Tiida", "Metallic", "V6"));
        System.out.println("Our autopark: " + autopark);

        changeCar(autopark.get(0), car -> {car.color = "Blue"; car.engine = "V8";});
        System.out.println("Our autopark: " + autopark);

        Consumer<Car> carConsumer = car -> {
            car.color = "Blue";
            car.engine = "V8";
        };
        carConsumer.accept(autopark.get(0));
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car , Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

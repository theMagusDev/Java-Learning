package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N2parameterizedClass;

import com.example.myFirstJavaPackage.classes.methodsAndConstructor.Employee;
import com.example.myFirstJavaPackage.classes.variablesAndVisibility.Car;

class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

public class TwoParams {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Five", 5);
        System.out.println(pair.getFirstValue()); // Five
        System.out.println(pair.getSecondValue()); // 5

        Pair<Car, Employee> workingCar =
                new Pair<>(
                        new Car("blue", "185 hp"),
                        new Employee(1, "Petrovich", 32, 35000, "cleaner")
                );

        OtherPair<String> otherPair = new OtherPair<>("Hello", "Bye");
        System.out.println(otherPair.getFirstValue()); // Hello
        System.out.println(otherPair.getSecondValue()); // Bye
    }
}

class OtherPair<T> {
    private T value1;
    private T value2;

    public OtherPair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirstValue() {
        return value1;
    }

    public T getSecondValue() {
        return value2;
    }
}

package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N5subtyping;

public class TaskAnswer {
    public static void main(String[] args) {
        Info<Integer> integerInfo = new Info<>(35);
//      Info<String> stringInfo = new Info<>("Thirty-five"); // Error now
//      Info<Car> carInfo = new Info<>(new Car()); // Error now
        Info<Double> doubleInfo = new Info<>(3.14);

        System.out.println(integerInfo.getValue()); // 35
        System.out.println(doubleInfo.getValue()); // 3.14
    }
}

class Info <T extends Number> {
    private T value;
    public Info(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return this.value;
    }
}

class Car{}

// Lets see how it works under the hood.

// Remember, that JVM inserts Object instead of 'T'.

// But when it sees '<T extends Number>' it uses not the
// Object, but Number, because now Number is the upper class.
// So for JVM it looks as follows:

/*
class Info <Number> {
    private Number value;
    public Info(Number value) {
        this.value = value;
    }

    public String toString() {
        return "{[ " + value + " ]}";
    }

    public Number getValue() {
        return this.value;
    }
}
 */

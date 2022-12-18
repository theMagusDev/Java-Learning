package com.example.myFirstJavaPackage.generics;

import java.util.ArrayList;
public class Program1 {

    public static void main(String[] args) {

        Information<String> name = new Information<>("Yuriy");
        System.out.println(name);
        Information<Integer> age = new Information<>(17);
        System.out.println(age);
        Integer myAge = age.getValue();
        String myName = name.getValue();
    }
}

class Information<T> {
    private final T value;
    public Information(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }
}

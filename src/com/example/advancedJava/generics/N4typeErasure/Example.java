package com.example.advancedJava.generics.N4typeErasure;

import java.util.ArrayList;

class Theory {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList1 = new ArrayList<>(); // compiler sees
        ArrayList<Object> intArrayList2 = new ArrayList<>(); // JVM sees

        // Runtime sees all generics as raw type (Object).

        int a1 = intArrayList1.get(0); // compiler sees
        int a2 = (Integer)intArrayList1.get(0); // JVM does

        // Type erasure - стирание типов.
        // JVM does not see them. It replaces them with Object type
        // and casts them, when you try to get them.
    }
}

public class Example {
/*
    public void abc(Info<String> info)  {
        String s = info.getValue();
    }

    public void abc(Info<Integer> info)  {
        Integer s = info.getValue();
    }
*/
    // Error: methods clash each other.
    // It's because they will be the same after type erasure.
    // For JVM they have the same signature: abc(Info info)
}

// Lets take a look at some moments with inheritance.

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
/*
    public void abc(Info<Integer> info) {
        Integer s = info.getValue();
    }

    // Error: methods have the same signature for JVM: abc(Info info)
 */
}

class Info <T> { // T - type placeholder
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



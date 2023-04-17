package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N3parameterizedMethod;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(123);
        integerArrayList.add(33);
        integerArrayList.add(744);
        int a = GenMethod.getSecondElement(integerArrayList);
        System.out.println(a); // 33
    }
}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        // <T> before 'T' helps compiler understand that this method
        // takes parameters with type T (arrayList in our case)
        return arrayList.get(1);
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V abc(V value) {
        // we can omit <V>, because in non-static methods Java
        // understand the type using class type.
        return value;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
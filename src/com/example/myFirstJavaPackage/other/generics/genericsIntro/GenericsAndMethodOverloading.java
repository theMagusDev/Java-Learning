package com.example.myFirstJavaPackage.other.generics.genericsIntro;

class Info<T> {
    private final T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }
}

class Parent {

    public void abc(Info<String> info) {
        String s = info.getValue();
        System.out.println(s);
    }
}

class Child extends Parent {
    /*
    public void abc(Info<Integer> info) {
        Integer s = info.getValue();
    }
    Error: name clash
    Why? Methods are the same for JVM, but compiler sees, that
    there might appear some problems while casting
    */
}

public class GenericsAndMethodOverloading {

    /*

    public void abc(Info<String> info) {
        String s = info.getValue();
    }

    public void abc(Info<Integer> info) {
        Integer s = info.getValue();
    }

    Error: 'abc(Info<String>)' clashes with 'abc(Info<Integer>)'; both methods have same erasure

    Why? Because RunTime will not see these generics, so it won't be able to determine which method to call.

    */
}




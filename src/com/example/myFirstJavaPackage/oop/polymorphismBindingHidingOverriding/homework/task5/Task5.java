package com.example.myFirstJavaPackage.oop.polymorphismBindingHidingOverriding.homework.task5;

public class Task5 {

    public static void main(String[] args) {

        X x = new Y();
        //System.out.println(x.s1 + " " + x.bool);
    }
}

class X {
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}
package com.example.myFirstJavaPackage.classes.oop.polymorphismBindingHidingOverriding.homework.task1.p2;

import com.example.myFirstJavaPackage.classes.oop.polymorphismBindingHidingOverriding.homework.task1.p1.X;
import com.example.myFirstJavaPackage.classes.oop.polymorphismBindingHidingOverriding.homework.task1.p1.*;

public class Y extends X {
    Y(){}

    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {

        Y y = new Y();
        y.abc();
    }
}

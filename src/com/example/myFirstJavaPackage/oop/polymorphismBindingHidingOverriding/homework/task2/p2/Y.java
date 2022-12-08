package com.example.myFirstJavaPackage.oop.polymorphismBindingHidingOverriding.homework.task2.p2;

import com.example.myFirstJavaPackage.oop.polymorphismBindingHidingOverriding.homework.task2.p1.X;

public class Y extends X {

    public void abc() {
        System.out.println("Y");
    }
    public void def() {
        Y y = new Y();
        y.abc();
    }
    public void ghi() {
        X x = new Y();
        // x.abc(); // Error: 'abc' has protected access modifier
    }

    public static void main(String[] args) {

        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}

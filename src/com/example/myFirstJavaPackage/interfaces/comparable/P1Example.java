package com.example.myFirstJavaPackage.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1Example {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Artem");
        list.add("Mariya");
        System.out.println("Before sorting: " + list);
        // Before sorting: [Zaur, Ivan, Mariya]
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        // After sorting: [Ivan, Mariya, Zaur]
    }
}

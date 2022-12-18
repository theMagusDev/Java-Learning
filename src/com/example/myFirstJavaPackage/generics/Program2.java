package com.example.myFirstJavaPackage.generics;

import java.util.ArrayList;

public class Program2 {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(30);
        integerArrayList.add(50);
        int a = GenericMethod.getSecondElement(integerArrayList);
        System.out.println(a); // 30

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Yuriy");
        names.add("Yarik");
        String name = GenericMethod.getSecondElement(names);
        System.out.println(name); // Yuriy

        // Note:

        /* Compiler sees: */ // ArrayList<Integer> integerArrayList = new ArrayList<>();
        /* Runtime sees: */  // ArrayList integerArrayList = new ArrayList();

        /* Compiler sees: */ // Integer a = integerArrayList.get(0)
        /* Runtime sees: */  // Integer a = (Integer)integerArrayList.get(0)

    }
}

class GenericMethod {

    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

package com.example.advancedJava.generics.N5subtyping;

import java.util.ArrayList;

public class TaskMethods1 {

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

    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        System.out.println(arrayList + " contains only Numbers");
        return arrayList.get(1);
    }
}

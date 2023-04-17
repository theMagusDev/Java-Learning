package com.example.myFirstJavaPackage.workingWithData.collection.set.linkedHashSet;

/*
Наследует HashSet. Хранит информацию о порядке добавления элементов.
В основе лежит HashMap. У элементов этого HashMap: КЛЮЧИ - элементы LinkedHashSet, ЗНАЧЕНИЯ - "заглушки".
 */

import java.util.LinkedHashSet;

public class Example {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(135);
        linkedHashSet.add(-9);

        System.out.println(linkedHashSet);
        // [5, 3, 135, -9]
    }
}

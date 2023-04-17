package com.example.myFirstJavaPackage.workingWithData.collection.set.treeSet;

/*
Хранит элементы в отсортированном по возрастанию порядке.
В основе лежит TreeMap. У элементов данного TreeMap КЛЮЧИ - это элементы TreeSet, а ЗНАЧЕНИЯ - "заглушки"-константы.
 */

import java.util.Set;
import java.util.TreeSet;

public class Create {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(135);
        treeSet.add(-1);
        treeSet.add(9);

        System.out.println(treeSet);
        // [-1, 3, 5, 7, 9, 135]

    }
}

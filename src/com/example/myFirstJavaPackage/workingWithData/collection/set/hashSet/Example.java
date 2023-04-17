package com.example.myFirstJavaPackage.workingWithData.collection.set.hashSet;

/*
Когда мы создаём HashSet, в его основе создаётся HashMap.
Когда мы добавляем элемент в Set, в его HashMap (основу HashSet) добавляется ключ "Zaur" со значением некоторой константы (такая "заглушка").
HashSet не имеет метода .get(), а, собственно, зачем он ему? HashSet итак хранит только ключи, что мы будем пытаться получить?
*/

import java.util.HashSet;
import java.util.Set;

public class Example {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        // Создаётся HashSet, в его основе лежит HashMap).

        names.add("Zaur");
        // Под капотом происходит:
        // hashMap.put("Zaur", CONSTANT)
    }
}

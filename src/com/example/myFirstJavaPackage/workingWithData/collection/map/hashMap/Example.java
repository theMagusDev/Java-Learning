package com.example.myFirstJavaPackage.workingWithData.collection.map.hashMap;

/*
Имплементирует интерфейс Map => хранит элементы КЛЮЧ -> ЗНАЧЕНИЕ
Особенность: не запоминает ПОРЯДОК добавления, поэтому работает БЫСТРЕЕ.
Хранит данные так:
{KEY1=VALUE, KEY2=VALUE, ...}

КЛЮЧИ должны быть УНИКАЛЬНЫМИ (иначе новый перезапишет старый), могут быть null.
ЗНАЧЕНИЯ могут повторяться, могут быть null.

hashMap.put(KEY<K>, VALUE<V>) - добавить элемент
hashMap.putIfAbsent(KEY<K>, VALUE<V>) - добавить элемент, если такого ещё нет
hashMap.get(KEY<K>) - вывести элемент
hashMap.remove(KEY<K>) - удалить элемент
hashMap.containsValue(KEY<K>) - имеется ли такой KEY
hashMap.containsValue(VALUE<V>) - имеется ли такой VALUE
hashMap.keySet() - вернуть Set всех ключей (его тип (самого, не элементов!) - KeySet (подкласс HashMp))
hashMap.values() - вернуть Set всех значений

 */

// Пример ниже: паспорт (номер -> имя гражданина)

import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        Map<Integer, String> passports = new HashMap<>();
        passports.put(507609, "Zaur Tregullov");
        passports.put(305901, "Ivan Ivanov");
        passports.put(510560, "Mariya Sidorova");
        passports.put(530609, "Nikolay Petrov");

        System.out.println(passports.keySet().getClass());

    }
}

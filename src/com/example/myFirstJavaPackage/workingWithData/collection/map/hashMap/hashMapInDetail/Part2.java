package com.example.myFirstJavaPackage.workingWithData.collection.map.hashMap.hashMapInDetail;

/*
 При создании HashMap мы можем задать 2 параметра, которые влияют на производительность:
  1) Initial capacity - размер;
  2) Load factor - коэф. того, насколько нужно заполнить массив для его увеличения вдвое (значение 0.75 - идеал)
 */

import java.util.HashMap;
import java.util.Map;

public class Part2 {

    public static void main(String[] args) {

        Map <Integer, String> stringMap = new HashMap<>(16); // initialCapacity = 16
        // Путь load factor = 0.75; После добавления 16 * 0.75 = 12 элементов массив будет увеличен вдвое.

        // больше capacity - больше памяти занимает массив, но меньше размер Linked list'ов, которые создаются, т.е. поиск будет быстрее.
        // Т.е. жертвуем память ради скорости поиска.

        // больше load factor - больше памяти экономим, но поиск дольше
    }
}

package com.example.myFirstJavaPackage.workingWithData.collection.queue.priorityQueue;

/*
Отличие от Queue: при вызове элемента мы будем иметь элемент тот, который идёт высшим по приоритету (наименьший!).
Сортировка идёт или на натуральной сортировке, или на интерфейсе Comparable / Comparator.
Элемент с наивысшим приоритетом (т.е. наименьший) будет использован в первую очередь.
 */

import java.util.PriorityQueue;

public class IntegerPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue();
        integerPriorityQueue.add(4);
        integerPriorityQueue.add(234);
        integerPriorityQueue.add(74);
        integerPriorityQueue.add(-5435);
        integerPriorityQueue.add(1);
        System.out.println(integerPriorityQueue);
        // [-5435, 1, 74, 234, 4]

    }
}

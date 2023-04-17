package com.example.myFirstJavaPackage.workingWithData.collection.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.offerFirst(3); // [3]
        integerDeque.offerFirst(2); // [2, 3]
        integerDeque.offerLast(4); // [2, 3, 4]
        integerDeque.offerLast(5); // [2, 3, 4, 5]
        integerDeque.offerFirst(1); // [1, 2, 3, 4, 5]
    }
}
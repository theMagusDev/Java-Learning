package com.example.myFirstJavaPackage.workingWithData.collection.queue.deque;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // .add() добавляет элемент в конец очереди
        queue.add("Yuriy");
        queue.add("Ivan");
        queue.add("Alex");


        // .offer() добавляет элемент в конец очереди
        queue.add("Anastasia");
        queue.add("Katya");

        System.out.println(queue);
        // [Yuriy, Ivan, Alex, Anastasia, Katya]


        // add() VS offer(): Пусть мест в очереди не осталось. Тогда:
        queue.add("Viktoria"); // throws exception
        queue.offer("Polina"); // no exception
        // [Yuriy, Ivan, Alex, Anastasia, Katya, Viktoria, Polina]


        // .poll() удаляет элемент с начала
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
        // [Anastasia, Katya, Viktoria, Polina]


        // element() and peek(). Возвращают первый элемент. Первый бросает exception, второй - нет.
        System.out.println(queue.element()); // Anastasia
        System.out.println(queue.peek()); // Anastasia

    }
}

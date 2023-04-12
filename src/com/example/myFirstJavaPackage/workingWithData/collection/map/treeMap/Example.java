package com.example.myFirstJavaPackage.workingWithData.collection.map.treeMap;

/*
Цель использования - нахождение range'ей, т.е. отрезков.

Элементы - пары KEY -> VALUE. Хранятся отсортированно, по возрастанию.
Работает быстро, но не быстрее, чем HashMap ( O(log) у дерева против O(1) у хэшМапы ).

Все операции идут при помощи метода compareTo().
Поэтому КЛЮЧ обязан имплементировать Comparable ЛИБО можно в параметре TreeMap передать Comparator.

Представляет собой красно-чёрное дерево. Большие элементы на правых ветвях, меньшие - на левых.
Вершина - корень; элементы - вершины; вершины без потомков - листья.
Оно является самобалансирующимся. Даже если мы будем добавлять элементы в порядке возрастания, то они
не просто добавятся в одну ветку и ветка будет долго расти, а произойдёт так:
Дерево увидит, что элементы идут в одну сторону, нужно перегрупироваться.

Двоичное дерево - у каждой вершины есть только 2 потомка.
 */

import java.util.TreeMap;

public class Example {

    public static void main(String[] args) {

        TreeMap<Double, String> marksJournal = new TreeMap<>();
        marksJournal.put(5.7, "John");
        marksJournal.put(3.2, "Ivan");
        marksJournal.put(7.1, "Konstantin");
        marksJournal.put(9.3, "Yuriy");
        marksJournal.put(5.5, "Sergey");

        // Для поиска отрезков:

        System.out.println(marksJournal);
        // {3.2=Ivan, 5.5=Sergey, 5.7=John, 7.1=Konstantin, 9.3=Yuriy}

        System.out.println(marksJournal.tailMap(/* from key = */ 5.0));
        // {5.5=Sergey, 5.7=John, 7.1=Konstantin, 9.3=Yuriy}

        System.out.println(marksJournal.headMap(/* to key = */ 5.0));
        // {3.2=Ivan}
    }
}

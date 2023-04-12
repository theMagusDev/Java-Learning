package com.example.myFirstJavaPackage.workingWithData.collection.map.hashMap.linkedHashMap;

import java.util.LinkedHashMap;

/*
То же самое, что hashMap, только содержит ссылку на следующий элемент (bucket).
Поэтому элементы находятся в том порядке, в котором добавляются.

 */

public class Example {

    public static void main(String[] args) {

        LinkedHashMap<Double, String> marksJournalWithoutAccessOrder = new LinkedHashMap<>(/* initial capacity = */ 16, /* load factor = */ 0.75f, /* access order = */ false);

        marksJournalWithoutAccessOrder.put(5.7, "John");
        marksJournalWithoutAccessOrder.put(9.3, "Yuriy");
        marksJournalWithoutAccessOrder.put(3.7, "Ivan");

        marksJournalWithoutAccessOrder.get(9.3);

        System.out.println(marksJournalWithoutAccessOrder);
        // {5.7=John, 9.3=Yuriy, 3.7=Ivan}


        // Пусть последним хранится тот, к который использовался недавно.
        LinkedHashMap<Double, String> marksJournalWithAccessOrder = new LinkedHashMap<>(/* initial capacity = */ 16, /* load factor = */ 0.75f, /* access order = */ true);

        marksJournalWithAccessOrder.put(5.7, "John");
        marksJournalWithAccessOrder.put(9.3, "Yuriy");
        marksJournalWithAccessOrder.put(3.7, "Ivan");

        marksJournalWithAccessOrder.get(9.3);

        System.out.println(marksJournalWithAccessOrder);
        // {5.7=John, 3.7=Ivan, 9.3=Yuriy}
        //                         ^
        //                      was used

    }
}

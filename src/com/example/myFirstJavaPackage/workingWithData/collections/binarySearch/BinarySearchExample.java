package com.example.myFirstJavaPackage.workingWithData.collections.binarySearch;

// Хорош только тогда, когда у нас отсортированный массив.

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(16);
        arrayList.add(33);
        arrayList.add(37);
        arrayList.add(54);
        arrayList.add(64);
        arrayList.add(75);
        arrayList.add(79);
        arrayList.add(89);
        arrayList.add(90);
        arrayList.add(91);
        int sixteenNumberIndex = Collections.binarySearch(arrayList, 16);

    }
}

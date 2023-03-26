package com.example.myFirstJavaPackage.workingWithData.collection.iterator;

import java.util.ArrayList;

public class Iterator {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Zaur");
        students.add("Mariya");
        students.add("Ivan");

        java.util.Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // moves iterator on the next element.
        }

        /* How it works:
        1) hasNext() -> Boolean
        2) True:
         a) go to next element using next()
         b) print next element
        3) False -> break while loop
         */

        // Итератор - что-то вроде курсора.

        while (iterator.hasNext()) {
            iterator.next(); // moves iterator on the next element.
            iterator.remove(); // remove element, where iterator is.
        }
    }
}

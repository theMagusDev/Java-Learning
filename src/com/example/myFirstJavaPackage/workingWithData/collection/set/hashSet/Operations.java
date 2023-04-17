package com.example.myFirstJavaPackage.workingWithData.collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Operations {

    public static void main(String[] args) {

        HashSet<Integer> integers1 = new HashSet<>();
        HashSet<Integer> integers2 = new HashSet<>();

        // 2 4 6 7 9
        integers1.add(2);
        integers1.add(4);
        integers1.add(6);
        integers1.add(7);
        integers1.add(9);

        // 1 3 5 7 9
        integers2.add(1);
        integers2.add(3);
        integers2.add(5);
        integers2.add(7);
        integers2.add(9);



        /* Methods */

        // Union //

        Set<Integer> union = new HashSet<>(integers1);
        union.addAll(integers2);
        System.out.println(union);
        // [1, 2, 3, 4, 5, 6, 7, 9]

        // Intersection //
        Set<Integer> intersect = new HashSet<>(integers1);
        intersect.retainAll(integers2);
        System.out.println(intersect);
        // [7, 9]

        // Subtraction //
        Set<Integer> subtract = new HashSet<>(integers1);
        subtract.removeAll(integers2);
        System.out.println(subtract);
        // [2, 4, 6]
    }
}

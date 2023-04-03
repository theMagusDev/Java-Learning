package com.example.myFirstJavaPackage.workingWithData.collection.list.arrayList;

import java.util.Arrays;

public class CompareMismatch {

    public static void main(String[] args) {

        // Arrays.compare

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array3 = {1, 2, 3, 5};
        // array2 is bigger than array1 (not by size, but by the value)
        // 1, 2, 3 - prefix, comparing next: 4 < 5

        char[] array4 = {'p', 'r', 'r', 'i', 'v', 'e', 't'};
        char[] array5 = {'p', 'r', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        char[] array6 = {'p', 'r', 'r', 'i', 'v', 'e', 't', 'o'};
        // array5 is bigger than array4 (not by size, but by the value)
        // 'p', 'r', 'r', 'i', 'v' - prefix, comparing next: 'e' < 'i'

        System.out.println(Arrays.compare(array1, array2)); // -1
        System.out.println(Arrays.compare(array2, array1)); // 1
        System.out.println(Arrays.compare(array2, array3)); // 0

        System.out.println(Arrays.compare(array4, array5)); // -4
        System.out.println(Arrays.compare(array5, array4)); // 4
        System.out.println(Arrays.compare(array4, array6)); // -1

        // Arrays.mismatch

        System.out.println(Arrays.mismatch(array4, array5)); // 5 (index)
    }
}

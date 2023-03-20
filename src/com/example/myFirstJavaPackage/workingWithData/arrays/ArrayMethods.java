package com.example.myFirstJavaPackage.workingWithData.arrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] array = {1, 5, 9, -5, 0};
        Arrays.sort(array);

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        int i1 = Arrays.binarySearch(array, 4);
        System.out.println(i1); // Output: -6
        // Why? The array is [-5 0 1 5 9], so 10 should be on index 6, but the max index is 4

        int[] array1 = {1, 2, 5, 9, -1};
        int[] array2 = {1, 2, 5, 9, -1};
        System.out.println(array1 == array2); // false
        System.out.println(array1.equals(array2)); // false, because equals is not overridden in the Array class

        System.out.println(Arrays.equals(array1, array2)); // true

        System.out.println(Program1.min(array));
        System.out.println(Program1.max(new int[] {1, 5, 9, -5, 0}));

        char[] greetingArray = {'P', 'r', 'i', 'v', 'e', 't'};
        StringBuilder greeting = new StringBuilder("Hello, world!");
        greeting.append(greetingArray, 2, 3); // append with 3 elements from an array from index 2
        System.out.println(greeting); // Hello, world!ive
        greeting.insert(6, greetingArray, 0, 4);
        System.out.println(greeting); // Hello,Priv world!ive

    }
}

class Program1 {

    public static int max(int[] array) {

        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static int min(int[] array) {

        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}

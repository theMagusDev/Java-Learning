package com.example.myFirstJavaPackage.arrays.homework;

import java.util.Arrays;

public class Homework {

    public static int[] bubbleSorting(int[] array) {
        int savedInt;
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    savedInt = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = savedInt;
                    flag = false;
                }
            }
        }

        return array;
    }

    private static int minInArray(int[] array, int fromIndex) {
        int min = array[0];

        for (int i = fromIndex; i < array.length - 1; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1)
                    System.out.print('"' + array[i][j] + '"' + ", ");
                else
                    System.out.print('"' + array[i][j] + '"');
            }
            if (i < array.length - 1)
                System.out.print("}, ");
            else
                System.out.print("}");
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {

        int[] array = {-7, -423, 0, 3, -345435};
        array = bubbleSorting(array);
        System.out.println("Result: " + Arrays.toString(array));

        String[][] stringArray = {{"Hello", "Hi", "Hey"}, {"Goodbye", "Bye", "Have a nice day"}, {"How are you", "What's up"}};
        showArray(stringArray);
    }
}

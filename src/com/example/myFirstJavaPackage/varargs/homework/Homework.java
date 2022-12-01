package com.example.myFirstJavaPackage.varargs.homework;

import java.util.Arrays;

public class Homework {

    public static void abc(String[] ... arrays) {

        String[][] result = new String[arrays.length][];
        int i = 0;

        System.out.print("[ ");
        for (String[] array : arrays) {
            result[i] = array;
            System.out.print(Arrays.toString(array) + " ");
            i++;
        }
        System.out.print("]");

    }

    public static void main(String[] args) {

        String[] array1 = new String[] {"Hello", "Hi", "Hey"};
        String[] array2 = new String[] {"How are you", "What's up"};
        String[] array3 = new String[] {"Goodbye", "Bye", "Have a nice day"};
        abc(array1, array2, array3);
    }
}

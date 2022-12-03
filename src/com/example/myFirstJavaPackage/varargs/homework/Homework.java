package com.example.myFirstJavaPackage.varargs.homework;

import java.util.Arrays;

public class Homework {

    public static String[][] abc(String[] exclude, String[] ... arrays) {

        String[][] result = new String[arrays.length][];
        int i = 0;
        boolean flag;

        for (String[] array : arrays) {
            result[i] = array;
            i++;
            for (String element: array) {
                flag = true;
                for (String excluding : exclude) {
                    if(element.equals(excluding)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    array[Arrays.binarySearch(array, element)] = null;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] array1 = new String[] {"Hello", "Hi", "Hey"};
        String[] array2 = new String[] {"How are you", "What's up"};
        String[] array3 = new String[] {"Goodbye", "Bye", "Have a nice day"};
        String[][] result = abc(args, array1, array2, array3);
        System.out.print("{ ");
        for (String[] array : result)
            if (array != result[result.length - 1])
                System.out.print(Arrays.toString(array) + ", ");
            else
                System.out.print(Arrays.toString(array));
        System.out.println(" }");
    }
}

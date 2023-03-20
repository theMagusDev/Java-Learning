package com.example.myFirstJavaPackage.workingWithData.arrays;

public class Arrays {

    public static void main(String[] args) {

        int[] array1 = {1, 5, 0};
        String[] array2 = {"Hello", "Bye", "Good day"};

        int[][] array3 = {{1, 2}, {3, 4}};

        int[] array4;
        int[][] array5;
        array4 = new int[9]; // set the length to 9
        array5 = new int[5][3]; // array's length = 9, subarrays' length = 3

        int[][] array6 = new int[3][];
        array6[0] = new int[3];
        array6[1] = new int[5];
        array6[2] = new int[10];

        for (int i = 0; i < array6.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = i + j;
                System.out.print(array6[i][j] + " ");
            }
            System.out.println("]");
        }

        int[] myArray1 = new int[7]; // OK

        int[] myArray2 = {1, 2, 3}; // OK
        int[] myArray3 = new int[] {1, 2, 3}; // The same as the line above
        // int[] myArray4 = new int[3] {1, 2, 3}; // Error: you should declare the length only once.

        int[] myArray5;
        myArray5 = new int[] {1, 2, 3}; // OK

        int[] myArray6;
        // myArray6 = {1, 2, 3}; // Error!

        int[] a, b; // 'a' and 'b' are arrays

    }
}

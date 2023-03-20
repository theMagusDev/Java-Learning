package com.example.myFirstJavaPackage.workingWithData.varargs;

import java.util.Arrays;

public class VarargsExmaple {

    public static void oldSum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }

    public static void newSum(int ... a) { // Java converts 'a' to array. So there is no difference between array and varargs for Java.
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }

    public static void newSum(String message, int ... a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.print("Your message: " + message + "; ");
        System.out.println(sum);
    }

    /*
    Rules:
    * Only one varargs
    * Must be in end
    * Can be empty
     */

    public static void main(String[] args) {

        oldSum(new int[] {3, 5, 7}); // 15
        newSum(3, 5, 7); // 15
        newSum(new int[] {3, 5, 7}); // 15
        newSum("Hello", 3, 5, 7); // Hello 15
        abc(5);
    }

    // Overloading priority

    static void abc(int a) {
        System.out.println("Method with int called; a = " + a);
    }

    static void abc(int ... a) {
        System.out.println("Method with varargs called; a = " + Arrays.toString(a));
    }

    // abc(5); Result -> Method with int called; a = 5
    // (int a) matches better than (int ... a), so it has a priority
}

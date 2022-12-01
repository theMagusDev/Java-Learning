package com.example.myFirstJavaPackage.stringClass.stringBuilder.homework;

import com.example.myFirstJavaPackage.arrays.Arrays;

public class Homework {

    public static boolean areEqual(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }

    public static void main(String[] args) {

        StringBuilder stringBuilder1 = new StringBuilder("Hello, world!");
        StringBuilder stringBuilder2 = new StringBuilder("Hello, world!");
        StringBuilder stringBuilder3 = new StringBuilder("Hello, world.");

        System.out.println(areEqual(stringBuilder1, stringBuilder2));
        System.out.println(areEqual(stringBuilder1, stringBuilder3));

    }
}

package com.example.myFirstJavaPackage.workingWithData.stringClass.stringBuilder;

public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(); // by default capacity is 16 chars
        StringBuilder stringBuilder1 = new StringBuilder("Good day!"); // capacity is 9 + 16 = 25
        StringBuilder stringBuilder2 = new StringBuilder(50); // capacity is 50
        StringBuilder stringBuilder3 = new StringBuilder(stringBuilder1);

    }
}

class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", world!"); // no new object, just this one was changed
        System.out.println(stringBuilder); // Hello, world!

        stringBuilder.insert(stringBuilder.indexOf(",") + 1, " beautiful");
        System.out.println(stringBuilder); // Hello, beautiful world!

        stringBuilder.insert(stringBuilder.length(), 1);
        System.out.println(stringBuilder); // Hello, beautiful world!1
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        System.out.println(stringBuilder); // Hello, beautiful world!

        System.out.println(stringBuilder.reverse());  // !dlrow lufituaeb ,olleH
        // New value of stringBuilder is stringBuilder.reverse()

        stringBuilder.reverse(); // Back in normal order
        stringBuilder.replace(stringBuilder.indexOf("beautiful"), stringBuilder.indexOf("world") - 1, "amazing");
        System.out.println(stringBuilder); // Hello, amazing world!

        StringBuilder stringBuilder1 = new StringBuilder(50);
        StringBuilder stringBuilder2 = new StringBuilder();
    }
}

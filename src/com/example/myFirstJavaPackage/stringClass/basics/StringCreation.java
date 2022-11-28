package com.example.myFirstJavaPackage.stringClass.basics;

public class StringCreation {

    public static void main(String[] args) {

        // Creation
        String s1 = "Hello"; // create new String object in String pool, assign the link to this object to 's1'
        String s2 = new String("Bye"); // create new String object in memory, assign the link to this object to 's2'

        // Links
        String s3 = "Hello";
        String s4 = "Hello";
        // s3 == s4 -> True, because they have the same link (to one String object in String pool)
    }
}

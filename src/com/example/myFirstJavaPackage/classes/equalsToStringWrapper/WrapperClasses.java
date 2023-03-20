package com.example.myFirstJavaPackage.classes.equalsToStringWrapper;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        // Inboxing
        Integer a = 5;

        // Outboxing
        int b = a;

        // Parsing
        String sNum1 = "50";
        String sNum2 = "abc50";
        int i1 = Integer.parseInt(sNum1);
        System.out.println(i1); // 50
        // int i2 = Integer.parseInt(sNum2); // Exception

        String s1 = "true";
        String s2 = "abctrue";
        System.out.println(Boolean.parseBoolean(s1)); // true
        System.out.println(Boolean.parseBoolean(s2)); // false

        // valueOf
        Integer i3 = Integer.valueOf(10);
        System.out.println(i3); // 10

    }
}

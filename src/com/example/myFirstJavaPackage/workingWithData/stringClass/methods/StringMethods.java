package com.example.myFirstJavaPackage.workingWithData.stringClass.methods;

public class StringMethods {

    public static void main(String[] args) {

        String s = "Hello, world! Hello everybody!";

        int a = s.length();
        int b = s.charAt(1);
        int c = s.indexOf('H'); // not found -> '-1'
        int d = s.indexOf("Hello"); // not found -> '-1'
        int e = s.indexOf('o', 5); // not found -> '-1'
        int f = s.indexOf("Hello", 1); // not found -> '-1'

        boolean g = s.startsWith("Hello"); // true
        boolean h = s.endsWith("everybody!"); // true

        String s1 = s.substring(7); // world! Hello everybody!
        String s2 = s.substring(7, 13); // world!

        String s3 = "     Hello!     ".trim(); // 'Hello!'

        String s4 = s.replace('l', 'L'); // HeLLo, worLd! HeLLo everybody! Note: replace returns the new object
        String s5 = s.replace("Hello", "Hey"); // Hey, world! Hey everybody! Note: replace returns the new object

        String s6 = s.toUpperCase(); // HELLO, WORLD! HELLO EVERYBODY!
        String s7 = s.toLowerCase(); // hello, world! hello everybody!

        boolean k = s.contains("world"); // true

        boolean b11 = "            ".isBlank(); // true // Explanation: Blank = contains only backspaces or tabs
        boolean b12 = "   sdfsd d sf".isBlank(); // false

        boolean bb = "".isEmpty(); // true

        String normalS = "    hello      ".strip(); // 'hello'
    }
}

package com.example.myFirstJavaPackage.Lesson2;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // <Data type> <Name> = <Value>
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;

        float f1 = 3.14F;
        float f2 = 2.5F;
        float f3 = 20.0F;

        double d1 = 5.50;
        double d2 = 87.25;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; // 10-ричная СС

        char c6 = '\u05AB'; // 16-ричная СС

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60; // dec (10)
        int a2 = 0b111100; // binary (2)
        int a3 = 074; // octal (i.e. 74 oct -> 60 dec)
        int a4 = 0x3C; // hex (16)
        // Note: a1, a2, a3, a4 = 60

        int a7 = 1_000_000; // _ is ignored

        /* DO NOT USE _:
        * 1) In start/end of a value
        * 2) Before/after . in float/double
        * 3) Before/after L, I, F, f, D, d (for example in long)
        * 4) Before/after 0x, 0b
         */

        System.out.println(a3);

    }
}

package com.example.myFirstJavaPackage.classes.oop.advancedPolymorphismInstanceofCasting;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // ===================== Narrowing ======================== //
        // Rules:
        /*
         * 1) int can be cast into byte, short or char
         * 2) int is constant
         * 3) value fits this data type
         */

        // Narrowing without casting:
        final int finalInt = 125;
        byte b1 = 10;
        short s = 127;
        byte b2 = finalInt;

        // Narrowing with casting
        byte b3 = (byte)s;

        // But:
        long l1 = 1;
        int i1 = (int)l1; // OK
        final long l2 = 2;
        // int i2 = l2; // Error

        int i = 5;
        long l = 10;
        // i = i * l; // Error. Correct:
        i = (int)(i * l);
        // but the following also works:
        i *= l;
        /* Order of execution:
        * 1) i * l, new type - long
        * 2) cast the result to int
        * 3) assign result to i
         */

        // byte, short and char are cast into int in arithmetic operations
        byte b4 = 3;
        short s4 = 5;
        char c4 = 'A';
        System.out.println(b4 + s4 + c4); // b4, s4, c4 are cast to int before the summation
        // But: '++' does not do this
    }
}

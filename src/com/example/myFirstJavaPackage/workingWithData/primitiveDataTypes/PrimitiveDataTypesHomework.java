package com.example.myFirstJavaPackage.workingWithData.primitiveDataTypes;

public class PrimitiveDataTypesHomework {

    public static void main(String[] args) {

        // Variables

        byte b10 = 12;
        byte b2 = 0b1100;
        byte b8 = 014;
        byte b16 = 0xC;

        short s10 = 1300;
        short s2 = 0b10100010100;
        short s8 = 02424;
        short s16 = 0x514;

        int i10 = 0;
        int i2 = 0b0;
        int i8 = 0x0;
        int i16 = 00;

        long l10 = 123456789L;
        long l2 = 0b111_010_110_111_100_110_100_010_101;
        long l8 = 0726_746_425;
        long l16 = 0x7_5BC_D15;

        float f1 = 231.74f;
        float f2 = 3755.739f;

        double d1 = 3.75d;
        double d2 = 15.37;

        boolean bool1 = true;
        boolean bool2 = false;

        char c1 = 'A';
        char c2 = 0x41;
        char c3 = 65; // 41 (hex) = 65 (dec)
        char c4 = '\u0041';


        // Output

        System.out.println(
                "b10 = " + b10 + "; "
                        + "b2 = " + b2 + "; "
                        + "b8 = " + b8 + "; "
                        + "b16 = " + b16 + "; ");

        System.out.println(
                "s10 = " + s10 + "; "
                        + "s2 = " + s2 + "; "
                        + "s8 = " + s8 + "; "
                        + "s16 = " + s16 + "; ");

        System.out.println(
                "i10 = " + i10 + "; "
                        + "i2 = " + i2 + "; "
                        + "i8 = " + i8 + "; "
                        + "i16 = " + i16 + "; ");

        System.out.println(
                "l10 = " + l10 + "; "
                        + "l2 = " + l2 + "; "
                        + "l8 = " + l8 + "; "
                        + "l16 = " + l16 + "; ");

        System.out.println("f1 = " + f1 + "; " + "f2 = " + f2 + "; ");

        System.out.println("d1 = " + d1 + "; " + "d2 = " + d2 + "; ");

        System.out.println("bool1 = " + bool1 + "; " + "bool2 = " + bool2 + "; ");

        System.out.println(
                "c1 = " + c1 + "; "
                        + "c2 = " + c2 + "; "
                        + "c3 = " + c3 + "; "
                        + "c4 = " + c4 + "; ");
    }
}

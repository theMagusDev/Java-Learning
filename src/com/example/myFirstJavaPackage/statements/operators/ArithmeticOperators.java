package com.example.myFirstJavaPackage.statements.operators;

public class ArithmeticOperators {

    /* Operators' execution order:
    * 1) ++ -- !
    * 2) * / %
    * 3) < <= > >=
    * 4) == !=
    * 5) == !=
    * 6) && ||
    * 7) = += -= *= /= %=
     */

    public static void main(String[] args) {

        // Assignment

        int a1 = 5;
        int b1 = a1 * 2;

        int X = 1, Y = 2, Z = 3; // same data type

        /* Operations */
        // '+' '-' '*' '/' '%'

        int a2 = 5;
        int b2 = 2;

        int zeloe = a2 / b2; // zeloe = 2 (остаток отбрасывается)
        int ostatok = a2 % b2; // ostatok = 1


        // -- and ++

        int x = 5;
        int y = 3;

        int z = x - y++; // z = 2; y = 4
        // I.e. minus operation execute first, then ++ operation execute

        x = 5;
        y = 3;

        z = x - ++y; // z = 1; y = 4
        // I.e. ++ is executed first, then minus operation execute

        /* Note:
        * x = 9; y = 5;
        * z = x-- - y;
        * Result: z = 9 - 5 = 4
         */

        // +=, -=

        int n = 5;

        int n1 = 0;
        n1 = n + 5; // is equal to: n += 5
        n1 = n - 3; // is equal to: n -= 3


        System.out.println(y);
    }
}

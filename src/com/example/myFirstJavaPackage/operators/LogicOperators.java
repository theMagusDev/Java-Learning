package com.example.myFirstJavaPackage.Lesson3;

public class LogicOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 0;

        System.out.println((a > b) && ++c > a);
        System.out.println(c); // c = 0
        /*
        * Explanation: Java see, that 'a > b' is false, and '&&' stands next,
        * so Java do not check the next expression (++c > a), because 'false' && [any] always = false
         */

        System.out.println((a > b) & ++c > a);
        System.out.println(c); // c = 1
         // '&' makes Java check the whole expression, so ++c is executed

        System.out.println(a & b); // Out: 0
        /*
        * bin(10) = 1010
        * bin(5) = 0101
        * 10 & 5 = 1 and 0; 0 and 1; 1 and 0; 0 and 1
        * Result: 0000
         */

        System.out.println(true ^ true ^ true); // false
        System.out.println(false ^ false ^ false); // false
        System.out.println(false ^ false ^ true); // true
        // '^' requires one and only one variable to be true


    }
}

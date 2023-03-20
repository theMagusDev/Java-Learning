package com.example.myFirstJavaPackage.statements.operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        int z = 10;

        x=y=z=15;
        /* Note:
        '=' operator executes from right to left:
        1) z = 15
        2) y = z
        3) x = y
        Out: x = 15, y = 15, z = 15
         */
    }
}

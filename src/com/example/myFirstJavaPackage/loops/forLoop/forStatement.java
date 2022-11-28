package com.example.myFirstJavaPackage.loops.forLoop;

public class forStatement {

    static void abc(int i) {
        System.out.println("i: " + (i - 1) + " -> " + i);
    }

    public static void main(String[] args) {

        System.out.println("--- Multiple initializations ---");
        for (int i = 1, j = 2, k = 5; i < 11; i++) { // Note: i, j and k must be the same type!
            System.out.println("For is executed " + i + " time");
        }

        System.out.println("\n--- Complex condition ---");
        for (int i = 1; i < 11 && i > 0; i++) {
            System.out.println("For is executed " + i + " time");
        }

        System.out.println("\n--- Methods call in Update section ---");
        for (int i = 1; i < 11; i++, abc(i)) {
            System.out.println("For is executed " + i + " time");
        }

        System.out.println("\n--- Update statement in 'for' body ---");
        for (int i = 1; i < 11;) {
            System.out.println("For is executed " + i + " time");
            i++;
        }

        System.out.println("\n--- Condition in 'for' body ---");
        for (int i = 1;;) {
            System.out.println("For is executed " + i + " time");
            i++;
            if (!(i < 11))
                break;
        }

    }
}

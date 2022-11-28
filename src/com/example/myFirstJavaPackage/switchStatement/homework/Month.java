package com.example.myFirstJavaPackage.switchStatement.homework;

public class Month {

    static int daysInTheMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
    }

    public static void main(String[] args) {

        System.out.println(daysInTheMonth(2));
        System.out.println(daysInTheMonth(9));
        System.out.println(daysInTheMonth(12));
    }
}

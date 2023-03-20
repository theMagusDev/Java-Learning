package com.example.myFirstJavaPackage.statements.loops.forLoop.homework;

public class Clocks {

    public static void printTime(int from, int to) {
        HOURS: for (int hour = from; hour < to; hour++) {
            MINUTES: for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) { break HOURS; }
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) { continue MINUTES; }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {

        printTime(0, 6);
    }
}

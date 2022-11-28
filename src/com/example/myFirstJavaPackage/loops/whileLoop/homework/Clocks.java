package com.example.myFirstJavaPackage.loops.whileLoop.homework;

public class Clocks {

    public static void printTime(int from, int to) {
        int hour = from;
        int minute = 0;
        int second = 0;

        HOURS: while (hour < to) {
            minute = 0;
            MINUTES: do {
                if (hour > 1 && minute % 10 == 0) { break HOURS; }
                second = 0;
                while (second < 60) {
                    if (second * hour > minute) {
                        minute++;
                        continue MINUTES;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            } while (minute < 60);
            hour++;
        }
    }

    public static void main(String[] args) {

        printTime(0, 6);
    }
}

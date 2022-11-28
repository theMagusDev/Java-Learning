package com.example.myFirstJavaPackage.loops.forLoop;

public class Practice {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++)
            for (int minute = 0; minute < 60; minute++)
                System.out.println(hour + ":" + minute);

        // labels
        HOURS: for (int hour = 0; hour < 24; hour++)
            MENUTES: for (int minute = 0; minute < 60; minute++) {
                if (hour == 12)
                    break HOURS;
                System.out.println(hour + ":" + minute);
            }

        // continue
        for (int hour = 0; hour < 24; hour++)
            for (int minute = 0; minute < 60; minute++) {
                if (minute % 15 != 0) { continue; } // only 0, 15, 30, 45 will be printed, others won't
                System.out.println(hour + ":" + minute);
            }
    }
}

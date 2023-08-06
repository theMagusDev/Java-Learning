package com.example.myFirstJavaPackage.multithreading.dataRaceAndSynchronizedMethods.problem;

/*
What if we need to modify some variable from multiple threads?
 */

public class Example {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();

        /*
         3
         2
         5
         6
         4
         7
         2
         8
         9
         */
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnable implements Runnable {

    public void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}

/*
Data race - это проблема, когда два и более потоков обращаются к одной
и той же переменной и как минимум 1 поток её изменяет.
 */

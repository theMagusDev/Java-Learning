package com.example.myFirstJavaPackage.workingWithData.atomicInteger;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    /*
    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }
    // 'synchronized' is quite heavy since lock is open\locks very often. We use
    // it just because increment operation is not atomic. But we can use AtomicInteger instead.
    // It works with 'int' using atomic operations.
     */

    private static AtomicInteger counter = new AtomicInteger(/* initial value = */ 0);
    public static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {

        HashSet<Integer> results = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            counter.set(0);
            Thread thread1 = new Thread(new MyRunnable());
            Thread thread2 = new Thread(new MyRunnable());
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            results.add(counter.intValue());
        }
        System.out.println(results);
        // [100, 200] was
        // [200] with AtomicInteger
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}

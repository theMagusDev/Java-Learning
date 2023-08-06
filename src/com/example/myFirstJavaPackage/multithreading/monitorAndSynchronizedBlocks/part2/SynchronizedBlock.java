package com.example.myFirstJavaPackage.multithreading.monitorAndSynchronizedBlocks.part2;

// Now increment() method is static

public class SynchronizedBlock {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {

    private static synchronized void increment() { // Now synchronized applies not to 'this' (object), but to class MyRunnable
        Counter.count++;
        System.out.println(Counter.count);
    }

    private static void doWork() {
        synchronized (MyRunnable.class) { // use 'CLASS_NAME.class' syntax for synchronized blocks
            greet();
        }
    }

    private static void greet() {
        System.out.println("Hello!");
    }


    @Override
    public void run() {
        increment();
    }
}

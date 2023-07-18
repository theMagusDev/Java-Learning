package com.example.myFirstJavaPackage.multithreading.methods;

public class DoNotCallRun {

    public static void main(String[] args) {

        Thread thread = new Thread(new SomeThread());
        thread.start();
        System.out.println("Method main. Name of thread = " + Thread.currentThread().getName() + ", priority = " + Thread.currentThread().getPriority());

        /*
         Method main. Name of thread = main, priority = 5
         Method run. Name of thread = Thread-0, priority = 5
         */

        /*
        Thread thread = new Thread(new SomeThread());
        thread.run();
        System.out.println("Method main. Name of thread = " + Thread.currentThread().getName() + ", priority = " + Thread.currentThread().getPriority());

        // Output:
        Method run. Name of thread = main, priority = 5
        Method main. Name of thread = main, priority = 5

        We do not create a separate thread. We just execute this code in main thread.
         */
    }
}

class SomeThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Name of thread = " + Thread.currentThread().getName() + ", priority = " + Thread.currentThread().getPriority());
    }
}

// Next file: Sleep.java

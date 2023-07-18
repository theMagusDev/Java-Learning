package com.example.myFirstJavaPackage.multithreading.methods;

public class Join {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyAnotherRunnable());
        Thread thread2 = new Thread(new MyAnotherRunnable());

        thread1.start();
        thread2.start();

        // Not we want main thread to wait until thread1 and thread2 will execute their code:

        thread1.join(); // current (main) thread will wait until given thread (thread1) will execute
        thread2.join();

        System.out.println("End");

        /*
         Thread-1 thread; i = 1
         Thread-0 thread; i = 1
         Thread-1 thread; i = 2
         Thread-0 thread; i = 2
         Thread-0 thread; i = 3
         Thread-1 thread; i = 3
         Thread-1 thread; i = 4
         Thread-0 thread; i = 4
         Thread-0 thread; i = 5
         Thread-1 thread; i = 5
         Thread-1 thread; i = 6
         Thread-0 thread; i = 6
         Thread-1 thread; i = 7
         Thread-0 thread; i = 7
         Thread-1 thread; i = 8
         Thread-0 thread; i = 8
         Thread-1 thread; i = 9
         Thread-0 thread; i = 9
         Thread-0 thread; i = 10
         Thread-1 thread; i = 10
         End
        */

        // Why 'End' was printed first? Because 2 other threads split from main thread
        // and 3 threads execute separately.
    }
}

class MyAnotherRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try { // we should use try-catch since run() can not throw exception (since we override it)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " thread; i = " + i);
        }
    }
}

// Next file: Example.java

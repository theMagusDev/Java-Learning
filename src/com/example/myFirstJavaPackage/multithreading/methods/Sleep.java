package com.example.myFirstJavaPackage.multithreading.methods;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {

        for(int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // give ms in arguments. 1 sec = 1000 ms
        }
        System.out.println("Lets go!");

        /*
        5
        4 (after 1 sec)
        3 (after 1 sec)
        2 (after 1 sec)
        1 (after 1 sec)
        Lets go! (after 1 sec)
         */

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        System.out.println("End");

        /*
         End
         Thread-0 thread; i = 1
         Thread-1 thread; i = 1
         Thread-0 thread; i = 2
         Thread-1 thread; i = 2
         Thread-0 thread; i = 3
         Thread-1 thread; i = 3
         Thread-1 thread; i = 4
         Thread-0 thread; i = 4
         Thread-0 thread; i = 5
         Thread-1 thread; i = 5
         Thread-0 thread; i = 6
         Thread-1 thread; i = 6
         Thread-1 thread; i = 7
         Thread-0 thread; i = 7
         Thread-0 thread; i = 8
         Thread-1 thread; i = 8
         Thread-0 thread; i = 9
         Thread-1 thread; i = 9
         Thread-0 thread; i = 10
         Thread-1 thread; i = 10
         */

        // Why 'End' was printed first? Because 2 other threads split from main thread
        // and 3 threads execute separately.
    }
}

class MyRunnable implements Runnable {

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

// Next file: Join.java

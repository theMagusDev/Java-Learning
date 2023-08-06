package com.example.myFirstJavaPackage.multithreading.threadPool.executorService;

/*
Thread Pool - группа потоков. Ему даётся пачка задач, и он
сам распределяет их по своим потокам.
 */

import java.util.concurrent.ExecutorService; // ExecutorService is interface
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(/* amount of threads = */ 5); // using factory method (method creating thread pools)
        Thread myThread = new Thread(new MyThread());
        for (int i = 0; i < 10; i++) {
            executorService.execute(myThread);
        }
        
        executorService.shutdown(); // stop Executor Service
        executorService.awaitTermination(15, TimeUnit.SECONDS); // main thread will wait until executorService ends its work (all threads become free) or 5 sec pass.
        System.out.println("Main ends.");

        /*
         pool-1-thread-1
         pool-1-thread-4
         pool-1-thread-5
         pool-1-thread-3
         pool-1-thread-2
         pool-1-thread-3
         pool-1-thread-4
         pool-1-thread-5
         pool-1-thread-1
         pool-1-thread-2
         Main ends.
         */
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



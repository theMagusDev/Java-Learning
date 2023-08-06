package com.example.myFirstJavaPackage.multithreading.threadPool.scheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorServiceExample = Executors.newScheduledThreadPool(/* corePoolSize = */ 1);
        Thread myThread = new Thread(new MyThread());
        scheduledExecutorServiceExample.schedule(/* command = */ myThread, /* delay = */ 3, TimeUnit.SECONDS); // сделай myThread через 3 секунды
        scheduledExecutorServiceExample.shutdown(); // executor service ended its work

        /*
        pool-1-thread-1
         */

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(/* corePoolSize = */ 1);
        Thread autosave = new Thread(new Autosave());
        scheduledExecutorService.scheduleAtFixedRate(/* command = */ autosave, /* init delay = */ 5, /* period */ 3, TimeUnit.SECONDS); // wait 5 sec and then regularly (every 3 sec) start this command
        // Important note: period is the time between starts of commands execution, not between end of one program and start of another.
        // Т.е. это время между началом запуска одного таска и следующего таска.
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
        System.out.println("scheduledExecutorService was shutdown.");

        /*
         Saving your progress...
         (3 seconds and next task will start)
         Progress saved.
         Saving your progress...
         (3 seconds and next task will start)
         Progress saved.
         scheduledExecutorService was shutdown.
         */

        ScheduledExecutorService anotherScheduledExecutorService = Executors.newScheduledThreadPool(/* corePoolSize = */ 1);
        Thread anotherAutosave = new Thread(new Autosave());
        anotherScheduledExecutorService.scheduleWithFixedDelay(/* command = */ autosave, /* init delay = */ 5, /* period */ 3, TimeUnit.SECONDS); // wait 5 sec and then regularly execute this command, delay between them is 3
        // Important note: period is the time between end of one program and start of another.
        Thread.sleep(10000);
        anotherScheduledExecutorService.shutdown();
        System.out.println("anotherScheduledExecutorService was shutdown.");

        /*
         Saving your progress...
         Progress saved.
         (3 seconds and next task will start)
         Saving your progress...
         Progress saved.
         (3 seconds and next task will start)
         anotherScheduledExecutorService was shutdown.
         */
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Autosave implements Runnable {

    @Override
    public void run() {
        System.out.println("Saving your progress...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Progress saved.");
    }
}

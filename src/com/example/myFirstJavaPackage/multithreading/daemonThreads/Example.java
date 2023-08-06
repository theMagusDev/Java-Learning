package com.example.myFirstJavaPackage.multithreading.daemonThreads;

/*
Daemon threads are often used for background services for other threads.
If user thread is active, then program will not end its execution. If no
user threads are active, but daemon thread is active, program will
finish its execution without waiting for daemon thread.
If user threads are inactive, then why we need supportive (daemon) threads active?
That is why they are terminated after user threads end.

To mark thread as daemon, we must call setDaemon() after it is created and before
its start. Otherwise, program will throw exception. We can check if thread is daemon by isDaemon() method.
 */

public class Example {

    public static void main(String[] args) {

        System.out.println("Main thread starts");

        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.setName("daemon_thread");

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");

        /*
         Main thread starts
         Main thread ends
         user_thread is daemon: false
         daemon_thread is daemon: true
         1
         2
         A
         3
         4
         5
         B
         6
         7
         8
         C
         9
         10
         11
         D
         12
         13
         14
         E
         15
         16
         17
         F
         18
         19
         G
         20
         21
         22
         H
         23
         24
         25
         I
         26
         27
         28
         J

         Process finished with exit code 0
         */
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


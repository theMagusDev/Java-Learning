package com.example.myFirstJavaPackage.multithreading.creatingThreads;

// This approach is used more often
public class ImplementingRunnableInterface {

    public static void main(String[] args) {
        Thread myRunnableThread1 = new Thread(new MyRunnableThread1());
        Thread myRunnableThread2 = new Thread(new MyRunnableThread2());
        myRunnableThread1.start();
        myRunnableThread2.start();
    }
}

class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class MyRunnableThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}



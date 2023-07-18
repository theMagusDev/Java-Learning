package com.example.myFirstJavaPackage.multithreading.creatingThreads;

public class AnonymousThread {

    public static void main(String[] args) {

        // Way #1
        new Thread(new Runnable() { // creating anonymous class
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        // Way #2
        new Thread(() -> System.out.println("Hello")).start(); // we can do so since Runnable is SAM interface
    }
}

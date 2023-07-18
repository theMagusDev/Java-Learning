package com.example.myFirstJavaPackage.multithreading.methods;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500); // Wait for 1500 ms or wait until Worker thread will end. One event is enough to resume.
        System.out.println("Method main ended");

        /*
         Method main begins
         Work begins
         Method main ended
         Work ended
        */
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ended");
    }
}

// Next file: State.java

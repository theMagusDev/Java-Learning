package com.example.myFirstJavaPackage.multithreading.interrupt;

/*
InterruptedException is thrown when some thread try
to interrupt another sleeping thread.
 */
public class InterruptedExceptionExplanation {

    public static void main(String[] args) throws InterruptedException {

        Thread myThread = new Thread(new MyThread());
        myThread.start();
        Thread.sleep(500);

        System.out.println("Main thread wants to interrupt MyThread thread after 0.5 sec of sleeping");
        myThread.interrupt();
    }
}

class MyThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Calculating some expression...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted when sleeping. We are going to end it.");
            return;
        }

        System.out.println("Calculation ended.");
    }
}
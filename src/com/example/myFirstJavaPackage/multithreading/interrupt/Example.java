package com.example.myFirstJavaPackage.multithreading.interrupt;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main starts");
        CalculatingSqrtsSumThread thread = new CalculatingSqrtsSumThread();
        thread.start();

        System.out.println("Main thread wants to interrupt CalculatingSqrtsSumThread");
        thread.interrupt(); // means: thread Main wants to interrupt CalculatingSqrtsSumThread thread.
        // but thread can force another thread to be interrupted. It is just a request.

        Thread.sleep(3000);

        System.out.println("Main thread slept for 3 sec and ended");

        /*
         Main starts
         Main thread wants to interrupt CalculatingSqrtsSumThread
         CalculatingSqrtsSumThread is wanted to be interrupted
         All is ok, CalculatingSqrtsSumThread can be interrupted, so we accept this request.
         Main thread slept for 3 sec and ended
         */
    }
}

class CalculatingSqrtsSumThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int n = 1; n <= 100000000; n++) {
            if (isInterrupted()) { // means: if some thread requested this thread to be interrupted
                System.out.println("CalculatingSqrtsSumThread is wanted to be interrupted");
                System.out.println("All is ok, CalculatingSqrtsSumThread can be interrupted, so we accept this request.");
                return; // return relates to method run()
            }
            sqrtSum += Math.sqrt(n);
        }

        System.out.println(sqrtSum);
    }

}

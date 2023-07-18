package com.example.myFirstJavaPackage.multithreading.methods;

// File #1

public class Methods {

    public static void main(String[] args) {

        Thread myThread = new Thread(new MyThread());
        System.out.println("Name of myThread = " + myThread.getName() + ", priority = " + myThread.getPriority());
        // Name of thread = Thread-0, priority = 5

        Thread myAnotherThread = new Thread(new MyThread());
        System.out.println("Name of myAnotherThread = " + myAnotherThread.getName() + ", priority = " + myAnotherThread.getPriority());
        // Name of myAnotherThread = Thread-1, priority = 5

        /*
        Priority:
         Default is 5
         Highest is 10
         Lowest is 1

        But there is no warranty that thread with higher priority
        will start earlier than with lower one.
         */

        myThread.setName("myChangedThread");
        myThread.setPriority(9);
        System.out.println("Name of myThread = " + myThread.getName() + ", priority = " + myThread.getPriority());
        // Name of myThread = myChangedThread, priority = 9

        myThread.setPriority(Thread.NORM_PRIORITY /* means priority 5 */);
        myThread.setPriority(Thread.MIN_PRIORITY /* means priority 1 */);
        myThread.setPriority(Thread.MAX_PRIORITY /* means priority 10 */);
        System.out.println("Name of myThread = " + myThread.getName() + ", priority = " + myThread.getPriority());
        // Name of myThread = myChangedThread, priority = 10
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

// Next file: DoNotCallRun.java
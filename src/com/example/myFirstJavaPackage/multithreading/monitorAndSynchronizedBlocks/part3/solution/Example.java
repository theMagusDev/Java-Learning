package com.example.myFirstJavaPackage.multithreading.monitorAndSynchronizedBlocks.part3.solution;

class OS {

    static final Object synchronizator = new Object();

    protected synchronized void mobileCall() {
        synchronized (synchronizator) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    protected synchronized void skypeCall() {
        synchronized (synchronizator) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    protected synchronized void telegramCall() {
        synchronized (synchronizator) {
            System.out.println("Telegram call starts");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Telegram call ends");
        }
    }
}

class RunnableMobile extends OS implements Runnable {

    @Override
    public void run() {
        OS os = new OS();
        os.mobileCall();
    }
}

class RunnableSkype extends OS implements Runnable {

    @Override
    public void run() {
        OS os = new OS();
        os.skypeCall();
    }
}

class RunnableTelegram extends OS implements Runnable {

    @Override
    public void run() {
        OS os = new OS();
        os.telegramCall();
    }
}

public class Example {

    public static void main(String[] args) {

        Thread mobileCallThread = new Thread(new RunnableMobile());
        Thread skypeCallThread = new Thread(new RunnableSkype());
        Thread telegramCallThread = new Thread(new RunnableTelegram());

        mobileCallThread.start();
        skypeCallThread.start();
        telegramCallThread.start();

        /* Output (can be different):
         Mobile call starts
         Mobile call ends (after 3000 ms)
         Skype call starts
         Skype call ends (after 5000 ms)
         Telegram call starts
         Telegram call ends (after 2500 ms)
         */

        /* Output (can be different):
         Mobile call starts
         Mobile call ends
         Telegram call starts
         Telegram call ends
         Skype call starts
         Skype call ends
         */
    }
}


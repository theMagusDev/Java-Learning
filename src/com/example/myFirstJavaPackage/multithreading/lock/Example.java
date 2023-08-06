package com.example.myFirstJavaPackage.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example {

    public static void main(String[] args) {

        Call call = new Call();
        Thread mobileThread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread skypeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread telegramThread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.telegramCall();
            }
        });

        mobileThread.start();
        skypeThread.start();
        telegramThread.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock(); // ReentrantLock implements Lock interface

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // we unlock ReentrantLock here since it must be opened after the block
            // of code above in any case: even if exception is caught.
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // we unlock ReentrantLock here since it must be opened after the block
            // of code above in any case: even if exception is caught.
            lock.unlock();
        }
    }

    void telegramCall() {
        lock.lock();
        try {
            System.out.println("Telegram call starts");
            Thread.sleep(4500);
            System.out.println("Telegram call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // we unlock ReentrantLock here since it must be opened after the block
            // of code above in any case: even if exception is caught.
            lock.unlock();
        }
    }
}

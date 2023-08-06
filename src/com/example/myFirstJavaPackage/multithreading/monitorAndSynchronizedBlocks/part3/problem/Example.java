package com.example.myFirstJavaPackage.multithreading.monitorAndSynchronizedBlocks.part3.problem;

/*
Пусть несколько методов синхронизированы по одному и тому же объекту. Пример:
нам могут звонить: по скайпу, по телефону, по телеграмму. В звонке мы можем
участвовать только по одному каналу.
 */

class OS {

    protected synchronized void mobileCall() {
        System.out.println(this);
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
    }

    protected synchronized void skypeCall() {
        System.out.println(this);
        System.out.println("Skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skype call ends");
    }

    protected synchronized void telegramCall() {
        System.out.println(this);
        System.out.println("Telegram call starts");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Telegram call ends");
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
    }
}

/*
 OS@27f1bf20
 Skype call starts
 OS@6ef58f67
 Telegram call starts
 OS@4b1aedb5
 Mobile call starts
 Telegram call ends
 Mobile call ends
 Skype call ends

Note that objects are different. So monitors are different. That is why
synchronized methods are not executed as we expect. They are synchronized
with different objects, and these objects' monitors are open. To solve
this, we have to synchronize methods with one object. See solution package.
 */

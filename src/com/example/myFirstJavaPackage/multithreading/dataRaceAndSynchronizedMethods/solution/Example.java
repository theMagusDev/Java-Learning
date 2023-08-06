package com.example.myFirstJavaPackage.multithreading.dataRaceAndSynchronizedMethods.solution;

/*
Нам нужно сделать так, чтобы в каждый момент времени только один
поток мог обращаться к переменной. Чтобы это сделать, нам
нужно поставить замок на метод. Поток зашёл - замок закрылся,
поток вышел - замок открылся. Это слово 'synchronized'.
 */

public class Example {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}

/* Output:
 1
 2
 3
 4
 5
 6
 7
 8
 9
 */

// Note: variable can not be synchronized.

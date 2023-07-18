package com.example.myFirstJavaPackage.multithreading.volatileKeyword.solution;

// volatile - изменчивый, непостоянный

/*
Когда переменная является volatile, её значение хранится
только в Main Memory. В CPU cache она не копируется и не хранится.

Для синхронизации щначения переменной между потоками ключевое
слово volatile используется тогда, когда только один поток может
изменять значение этой переменной, а остальные потоки могут его
только читать.
 */

public class Example extends Thread {

    volatile boolean flag = true;

    @Override
    public void run() {
        long counter = 0;
        while (flag) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Example myThread = new Example();
        myThread.start();
        Thread.sleep(3000);
        System.out.println("3 seconds passed. It is time to get up, main thread!");
        myThread.flag = false;
        myThread.join(); // main thread waits for myThread
        System.out.println("End of program");
    }

    /*
     3 seconds passed. It is time to get up, main thread!
     Loop is finished. Counter = 5939429628
     End of program
     */
}


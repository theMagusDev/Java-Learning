package com.example.myFirstJavaPackage.multithreading.waitAndNotify;

/*
wait() causes the current thread to wait until it is awakened;
notify() wakes up a single thread that is waiting on this object's monitor.
 */

class Market {
    private int breadCount = 0;

    public synchronized void takeBread() { // method is synchronized with Market object (its object monitor)
        while (breadCount < 1) { // if there is no break
            try {
                wait(); // Causes the current thread to wait until it is awakened
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Consumer bought 1 bread");
        System.out.println("Amount of bread in market: " + breadCount);
        notify(); // Wakes up a single thread that is waiting on this object's monitor
    }

    public synchronized void putBread() { // method is synchronized with Market object (its object monitor)
        while (breadCount >= 5) {
            try {
                this.wait(); // The same as without 'this'. Causes the current thread to wait until it is awakened
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Producer placed 1 bread");
        System.out.println("Amount of bread in market: " + breadCount);
        this.notify(); // The same as without 'this'. Wakes up a single thread that is waiting on this object's monitor
    }
}

class Producer implements Runnable {

    Market market;
    Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {

    Market market;
    Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.takeBread();
        }
    }
}

public class Example {

    public static void main(String[] args) {

        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        /* Output (can be different):
         Producer placed 1 bread
         Amount of bread in market: 1
         Producer placed 1 bread
         Amount of bread in market: 2
         Producer placed 1 bread
         Amount of bread in market: 3
         Consumer bought 1 bread
         Amount of bread in market: 2
         Consumer bought 1 bread
         Amount of bread in market: 1
         Consumer bought 1 bread
         Amount of bread in market: 0
         Producer placed 1 bread
         Amount of bread in market: 1
         Producer placed 1 bread
         Amount of bread in market: 2
         Producer placed 1 bread
         Amount of bread in market: 3
         Producer placed 1 bread
         Amount of bread in market: 4
         Producer placed 1 bread
         Amount of bread in market: 5
         Consumer bought 1 bread
         Amount of bread in market: 4
         Consumer bought 1 bread
         Amount of bread in market: 3
         Consumer bought 1 bread
         Amount of bread in market: 2
         Consumer bought 1 bread
         Amount of bread in market: 1
         Consumer bought 1 bread
         Amount of bread in market: 0
         Producer placed 1 bread
         Amount of bread in market: 1
         Producer placed 1 bread
         Amount of bread in market: 2
         Consumer bought 1 bread
         Amount of bread in market: 1
         Consumer bought 1 bread
         Amount of bread in market: 0
         */

        /*
         After producer/consumer added/taked bread, market thread's monitor gets free
         and one of thread (producer or consumer) will occupy it. Which exactly we can not know.
         */
    }
}

// this.wait(1000) means wait 1000 ms or until some thread will call notify()

// We use while() loop because sometimes (very rarely) thread can awake
// even without notify(). In this case out while() will make thread
// wait again.

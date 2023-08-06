package com.example.myFirstJavaPackage.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// lock() - lock the monitor. If unsuccessful, then wait until it is open and lock it.
// unlock() - unlock the monitor
// tryLock() - try to lock monitor. If unsuccessful, then do not do anything.

public class ATM {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Employee employee1 = new Employee("Yuriy", lock);
        Employee employee2 = new Employee("Ivan", lock);
        Employee employee3 = new Employee("Artur", lock);
        Employee employee4 = new Employee("Peter", lock);
        Employee employee5 = new Employee("John", lock);

        employee1.start();
        employee2.start();
        employee3.start();
        employee4.start();
        employee5.start();

        /*
         Peter is waiting.
         Yuriy is waiting.
         Artur is waiting.
         Peter is using ATM.
         John is waiting.
         Ivan is waiting.
         Peter has finished using ATM. (after 3.5 sec)
         Yuriy is using ATM.
         Yuriy has finished using ATM. (after 3.5 sec)
         Artur is using ATM.
         Artur has finished using ATM. (after 3.5 sec)
         John is using ATM.
         John has finished using ATM. (after 3.5 sec)
         Ivan is using ATM.
         Ivan has finished using ATM. (after 3.5 sec)
         */
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(name + " is waiting.");
        lock.lock();
        System.out.println(name + " is using ATM.");
        try {
            Thread.sleep(3500);
            System.out.println(name + " has finished using ATM.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

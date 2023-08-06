package com.example.myFirstJavaPackage.workingWithData.thread_safe.concurrentHashMap.solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
In ConcurrentHashMap lock is placed on each segment. While one thread works
with some segment, another thread can not work with it.
 */

public class Example {

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "Yuriy");
        hashMap.put(2, "Ivan");
        hashMap.put(3, "Yarik");
        hashMap.put(4, "Kiril");
        hashMap.put(5, "Peter");
        System.out.println(hashMap);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                Iterator<Integer> iterator = hashMap.keySet().iterator();
                Integer integer = 0;
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    integer = iterator.next();
                    System.out.println(integer + ":" + hashMap.get(integer));
                }
            }
        };

        Runnable anotherRunnable = new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hashMap.put(6, "Dima");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(anotherRunnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(hashMap);

        /*
         {1=Yuriy, 2=Ivan, 3=Yarik, 4=Kiril, 5=Peter}
         1:Yuriy
         2:Ivan
         3:Yarik
         4:Kiril
         5:Peter
         6:Dima
         {1=Yuriy, 2=Ivan, 3=Yarik, 4=Kiril, 5=Peter, 6=Dima}
         */
    }
}

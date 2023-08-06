package com.example.myFirstJavaPackage.workingWithData.thread_safe.synchronizedCollections;

/*
There are 2 types of thread-safe collections: Synchronized and Concurrent.
Synchronized collections are created by using wrappers for usual collections.
Concurrent collections are created exactly for multithreading and thus work
faster, than synchronized, but still slower, than usual collections.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        // Out threads will add elements from source to target

        ArrayList<Integer> target = new ArrayList<>(); // Old way
        List<Integer> synchronizedTargetList = Collections.synchronizedList(target); // synchronizedTargetList refers to target ArrayList
        // synchronizedTargetList is synchronized view (or wrapper) for out target ArrayList

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                synchronizedTargetList.addAll(source);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

        /*
        Some of threads starts adding elements to synchronizedTargetList. While this thread
        is doing this operation, synchronizedTargetList lock is closed.
         */

        thread1.join();
        thread2.join();

        System.out.println(synchronizedTargetList);
    }
}

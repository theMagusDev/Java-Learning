package com.example.myFirstJavaPackage.multithreading.monitorAndSynchronizedBlocks.part1;

/*
К каждому объекту (или классу) в Java дополнительно привязана такая сущность, как монитор.
Монитор может иметь статус "свободен" или "занят". Именно это используется, когда мы
используем ключевое слово 'synchronized'. Поток заходит в метод - монитор становится "занят".
Поток выходит - монитор становится "свободен".

Важное замечание: блокировка идёт на объекте или классе, а не на блоке кода.
 */

public class SynchronizedBlock {

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

    public void doWork() {
        synchronized (this /* чей монитор мы будем блокировать */) {
            Counter.count++; // этот код синхронизирован
            System.out.println(Counter.count);
        }
    }

    /*
     Когда мы писали synchronized перед методом, мы неявно указывали, что будет
     блокироваться монитор объекта, которому этот метод принадлежит (this). Тот
     код идентичен вышенаписанному.
     */

    private void doAnotherWork() {
        greet(); // Here there will be no data race (since threads do not read/modify vars), so why not to make it asynchronous?
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    private void greet() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
    }


    @Override
    public void run() {
        doAnotherWork();
    }
}

/* Output (can be different):
Hello from thread Thread-0
Hello from thread Thread-2
Hello from thread Thread-1
1
2
3
 */

/* Or such output:
Hello from thread Thread-1
Hello from thread Thread-2
Hello from thread Thread-0
1
2
3
 */



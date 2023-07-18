package com.example.myFirstJavaPackage.multithreading.volatileKeyword.problem;

public class Example extends Thread {

    boolean flag = true;

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
}

/*
Сейчас цикл не прерывается, хотя по идее должен. Потоков то два, они
concurrent.

Дело в том, что каждое задействованное ядро скопировало из Main Memory
значение переменной flag в свою кэш-память (CPU cache). В результате ядро
потока main изменило значение переменной flag в своей кэш-памяти, а значение
flag в Main Memory так и осталось false. Через какое-то время оно станет true,
однако мы не знаем, когда это будет (возможно, очень нескоро). Только после
этого пройдёт ещё время перед тем, как первое ядро (потока myThread) скопирует новое
значение из Main Memory.

См решение в solution package.
 */

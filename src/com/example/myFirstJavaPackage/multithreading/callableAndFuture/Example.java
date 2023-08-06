package com.example.myFirstJavaPackage.multithreading.callableAndFuture;

import java.math.BigInteger;
import java.util.concurrent.*;

/*
Callable, в отличие от Runnable, возвращает какое-то значение
(Runnable return type is void) и может выбрасывать Exception

Метод submit() передаёт наш task в thread pool и возвращает тип Future
Метод get() позволяет получить результат из объекта типа Future
 */
public class Example {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//      executorService.execute(); // use submit(), not execute(). Execute accepts Runnable
        Future<BigInteger> integerFuture = executorService.submit(factorial); // Future - будущее. Результата пока нет, он появится потом
        // submit() returns Future<T> type result

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        BigInteger factorialResult = BigInteger.valueOf(-1);
        try {
            System.out.println("Getting result from integerFuture. Main thread is blocked until task will return a result.");
            factorialResult = integerFuture.get(); // get() блокирует Main поток до тех пор, пока результат не будет получен.
            System.out.println("Result accepted, Main thread is unblocked.");
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getCause());
        }
        System.out.println("Factorial result is " + factorialResult);

        /*
         Getting result from integerFuture. Main thread is blocked until task will return a result.
         (some time)
         Result accepted, Main thread is unblocked.
         Factorial result is 120
         */
    }
}

class Factorial implements Callable<BigInteger> {
    int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public BigInteger call() throws Exception {
        if (number <= 0) {
            throw new Exception("Invalid number " + number + " for factorial function.");
        }

        BigInteger result = BigInteger.valueOf(1);
        for (int n = 1; n <= number; n++) {
            result = result.multiply(BigInteger.valueOf(n));
        }
        return result;
    }
}

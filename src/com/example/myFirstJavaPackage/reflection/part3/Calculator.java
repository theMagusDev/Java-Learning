package com.example.myFirstJavaPackage.reflection.part3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Summary of " + a + " and " + b + " = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " = " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + " and " + b + " = " + result);
    }
}

class CalculatorProgram {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter function name:");
        String function = scanner.nextLine().toLowerCase();
        System.out.println("Enter first argument:");
        String firstArgument = scanner.nextLine();
        System.out.println("Enter second argument:");
        String secondArgument = scanner.nextLine();

        Calculator calculator = new Calculator();
        Class calculatorClass = calculator.getClass();
        Method selectedMethod = null;

        Method[] methods = calculatorClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals(function)) {
                selectedMethod = method;
            }
        }

        selectedMethod.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
    }
}

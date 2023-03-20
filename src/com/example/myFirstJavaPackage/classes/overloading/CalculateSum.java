package com.example.myFirstJavaPackage.classes.overloading;

public class CalculateSum {

    int calculateSumOf() {
        int result = calculateSumOf(0, 0, 0, 0);
        System.out.println("Sum =" + result);
        return result;
    }

    int calculateSumOf(int a) {
        int result = calculateSumOf(a, 0, 0, 0);
        System.out.println("Sum =" + result);
        return result;
    }

    int calculateSumOf(int a, int b) {
        int result = calculateSumOf(a, b, 0, 0);
        System.out.println("Sum =" + result);
        return result;
    }

    int calculateSumOf(int a, int b, int c) {
        int result = calculateSumOf(a, b, c, 0);
        System.out.println("Sum =" + result);
        return result;
    }

    int calculateSumOf(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Sum =" + result);
        return result;
    }

}

class CalculateSumProgram {

    public static void main(String[] args) {

        CalculateSum calculateSum = new CalculateSum();
        calculateSum.calculateSumOf();
        calculateSum.calculateSumOf(5);
        calculateSum.calculateSumOf(5, 10);
        calculateSum.calculateSumOf(5, 10, 15);
        calculateSum.calculateSumOf(5, 10, 15, 25);

    }
}

package com.example.myFirstJavaPackage.overloading;

public class CalculateSum {

    int calculateSumOf() {
        int result = calculateSumOf(0, 0, 0, 0);
        return result;
    }

    int calculateSumOf(int a) {
        int result = calculateSumOf(a, 0, 0, 0);
        return result;
    }

    int calculateSumOf(int a, int b) {
        int result = calculateSumOf(a, b, 0, 0);
        return result;
    }

    int calculateSumOf(int a, int b, int c) {
        int result = calculateSumOf(a, b, c, 0);
        return result;
    }

    int calculateSumOf(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }

}

class CalculateSumProgram {

    public static void main(String[] args) {

        CalculateSum calculateSum = new CalculateSum();
        System.out.println(calculateSum.calculateSumOf());
        System.out.println(calculateSum.calculateSumOf(5));
        System.out.println(calculateSum.calculateSumOf(5, 10));
        System.out.println(calculateSum.calculateSumOf(5, 10, 15));
        System.out.println(calculateSum.calculateSumOf(5, 10, 15, 25));

    }
}

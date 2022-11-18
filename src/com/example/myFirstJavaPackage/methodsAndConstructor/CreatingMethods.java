package com.example.myFirstJavaPackage.methodsAndConstructor;

public class CreatingMethods {

    int summ(int a, int b, int c) { // a, b, c - parameters
        int result = a + b + c;
        return result;
    }

    int arithmeticMean(int x, int y, int z) {
        int meanResult = summ(x, y, z) / 3;
        return meanResult;
    }

}

class UsingMethods {

    public static void main(String[] args) {

        CreatingMethods creatingMethods = new CreatingMethods();
        System.out.println(creatingMethods.summ(5, 10, 15));
        // 5, 10, 15 - arguments

        System.out.println(creatingMethods.arithmeticMean(20, 40, 60));
    }

}

package com.example.myFirstJavaPackage.lambdas.part2;

public class Program {

    public static void main(String[] args) {

        var programInferenceType = new ProgramInferenceType();
        // is equal to: ProgramInferenceType programInferenceType = new ProgramInferenceType();
        var i = 10;
        var w = 1.5f;
        var result = abc();
        var array = new String[]{"hello", "hi"};
        for (var string: array) {
            System.out.println(string);
        }
    }

    static double abc() { return 3.14; }
}

class ProgramInferenceType {}

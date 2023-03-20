package com.example.myFirstJavaPackage.other.lambdas.otherExamples;

public class Program1 {

    static void def(Interface1 interface1) {
        System.out.println(interface1.abc("hello1"));
    }

    public static void main(String[] args) {

        def(string -> string.length()); // 6
        def(string -> {string = "Ok"; return string.length();}); // 6
        def(string -> countDigits(string)); // 1
        def(Program1::countDigits); // 1
    }

    static int countDigits(String string) {
        int result = 0;
        for (char c: string.toCharArray()) {
            result++;
        }
        return result;
    }
}

interface Interface1 {

    int abc(String s);
}

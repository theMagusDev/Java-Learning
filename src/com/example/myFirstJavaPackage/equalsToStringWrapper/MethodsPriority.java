package com.example.myFirstJavaPackage.equalsToStringWrapper;

public class MethodsPriority {

    void abc(int i) {
        System.out.println("int");
    }
    void abc(int ... i) {
        System.out.println("int varargs");
    }
    void abc(Integer i) {
        System.out.println("Integer");
    }
    void abc(byte b) {
        System.out.println("byte");
    }
    void abc(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {

        MethodsPriority methodsPriority = new MethodsPriority();
        methodsPriority.abc(5); // int
    }
}

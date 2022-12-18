package com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions;

public class WorkingWithException {

    public static void main(String[] args) {
        try {
            doSmth();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // Output: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
            e.printStackTrace();
            /* Output:
            java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	            at com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions.WorkingWithException.get4thElementFromArray(WorkingWithException.java:16)
	            at com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions.WorkingWithException.doSmth(WorkingWithException.java:20)
	            at com.example.myFirstJavaPackage.exceptionsAndErrors.runtimeExceptions.WorkingWithException.main(WorkingWithException.java:7)
             */
        }
    }

    static void get4thElementFromArray() {
        int[] ints = {1, 2, 3};
        System.out.println(ints[5]);
    }

    static void doSmth() {
        get4thElementFromArray();
    }
}

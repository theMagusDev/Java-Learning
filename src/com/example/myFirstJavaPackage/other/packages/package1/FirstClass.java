package com.example.myFirstJavaPackage.other.packages.package1;

public class FirstClass {

    protected int var1 = 5;
    protected void firstClassMethod() {
        System.out.println("FirstClass method executed.");
    }

}

class FirstClassProgram {

    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.var1);
        firstClass.firstClassMethod();
    }
}

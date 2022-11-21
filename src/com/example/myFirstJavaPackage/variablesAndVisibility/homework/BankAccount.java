package com.example.myFirstJavaPackage.variablesAndVisibility.homework;

public class BankAccount {

}
// Task 1
class Homework {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();
        BankAccount bankAccount5 = new BankAccount();
        BankAccount bankAccount6 = new BankAccount();
        BankAccount bankAccount7 = new BankAccount();
        BankAccount bankAccount8 = new BankAccount();

        bankAccount1 = null;
        bankAccount2 = null;
        bankAccount3 = null;
        bankAccount4 = null;
        bankAccount5 = null;
        bankAccount6 = null;

    }
}

// Task 2

class Test1{
    int a = 1;
    // static int a = 2;
    // the line above causes an error, but here you should determine, will it be used or not (if not commented)

    static void abc(int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {

        abc(5);
    }
}

class Test2{
    int a = 1;
    static int b = 2;

    static void abc(int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {

        abc(5);
    }
}

class Test3{
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {

        Test3 test3 = new Test3();
        test3.abc(4);
    }

    // What will the output be?

    // Output #1:
    /*
        3
        1
    */

    // Output #2:
    /*
        5
        2
    */

    // Output #3:
    /*
        2
        4
        1
        2
     */
}

package com.example.myFirstJavaPackage.variablesAndVisibility.homework;

public class BankAccount {

}
// Task 1
class Homework {

    public static void createBankAccounts() {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(); // 1 object created
        createBankAccounts(); // 2 more objects created
        createBankAccounts(); // 2 more objects created
        BankAccount bankAccount1 = new BankAccount(); // 1 more object created
        createBankAccounts(); // 2 more objects created

        // 8 objects were created, but only 2 are alive
    }
}

// Task 2

class Test1{
    int a = 1;
    // static int a = 2;
    // uncomment the line above

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.abc(5);
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
        Error.
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

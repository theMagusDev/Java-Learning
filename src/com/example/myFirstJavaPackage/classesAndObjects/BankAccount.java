package com.example.myFirstJavaPackage.Lesson4;

public class BankAccount {

    int id = 1; // instance's variable (because is used in multiple objects)
    String name; // instance's variable
    double balance; // instance's variable
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Yuriy";
        myAccount.balance = 15.35;

        yourAccount.id = 2;
        yourAccount.name = "Ivan";
        yourAccount.balance = 17.35;

        hisAccount.id = 3;
        hisAccount.name = "Yarik";
        hisAccount.balance = 19.35;

        System.out.println(hisAccount.name);
    }
}

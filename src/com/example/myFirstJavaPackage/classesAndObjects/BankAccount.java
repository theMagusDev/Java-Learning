package com.example.myFirstJavaPackage.classesAndObjects;

public class BankAccount {
    int id = 1; // instance variable (because is used in multiple objects)
    String name; // instance variable
    double balance; // instance variable
    // Note: instance variables are in all objects BankAccount,
    // no matter does constructor assign values to them or not

    void deposit(double amount) {
        System.out.println("Balance replenishment: $" + balance + " -> $" + (balance + amount) + " (+$" + amount + ")");
        balance += amount;
    }

    void withdraw(double amount) {
        System.out.println("Cash withdrawal: $" + balance + " -> $" + (balance - amount) + " (-$" + amount + ")");
        balance -= amount;
    }

    void getInfo() {
        System.out.println("ID: " + id);
        System.out.println("Owner name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountProgram {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Yuriy";
        myAccount.balance = 15.50;

        yourAccount.id = 2;
        yourAccount.name = "Ivan";
        yourAccount.balance = 17.00;

        hisAccount.id = 3;
        hisAccount.name = "Yarik";
        hisAccount.balance = 19.50;

        myAccount.deposit(57.25);
        myAccount.deposit(23.35);
        myAccount.withdraw(70);

    }
}

package com.example.myFirstJavaPackage.methodsAndConstructor;

public class Human {
    String name;
    HumanCar humanCar;
    HumanBankAccount humanBankAccount;

    void info() {
        System.out.println("Name: " + name + "; Car color: " + humanCar.color + "; Bank account balance: " + humanBankAccount.balance);
    }
}

class HumanCar {

    HumanCar(String carColor, String carEngine) {
        color = carColor;
        engine = carEngine;
    }
    String color;
    String engine;
}

class HumanBankAccount {

    HumanBankAccount(int accountId, double accountBalance) {
        id = accountId;
        balance = accountBalance;
    }
    int id;
    double balance;
}

class HumanProgram {

    public static void main(String[] args) {

        Human human = new Human();
        human.name = "David";
        human.humanCar = new HumanCar("White", "V8");
        human.humanBankAccount = new HumanBankAccount(1, 15.75);

        human.info();
    }
}

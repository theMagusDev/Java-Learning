package com.example.myFirstJavaPackage.oop.inheritance.homework;

public class Animal {

    public Animal() {
        System.out.println("I am animal");
    }
    public Animal(int eyes) {
        this.eyes = eyes;
    }

    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }
    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    Pet() {
        super(2);
        tail = 1;
        paw = 4;

        System.out.println("I am pet");
    }

    String name;
    int tail;
    int paw;

    void run() {
        System.out.println("Pet runs");
    }
    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + this.name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + this.name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Program {

    public static void main(String[] args) {

        Dog dog = new Dog("Nik");
        Cat cat = new Cat("Alisa");

        cat.sleep();
    }
}
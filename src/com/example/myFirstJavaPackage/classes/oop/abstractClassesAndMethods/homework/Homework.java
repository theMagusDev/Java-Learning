package com.example.myFirstJavaPackage.classes.oop.abstractClassesAndMethods.homework;

public class Homework {

    public static void main(String[] args) {

        Swordfish swordfish = new Swordfish("Petya");
        System.out.println(swordfish.name);
        swordfish.swim();
        swordfish.eat();
        swordfish.sleep();

        Speakable penguin = new Penguin("Pasha");
        penguin.speak();

        Animal lion = new Lion("Richard");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        Mammal lion1 = new Lion("Fedor");
        System.out.println(lion1.name);
        lion1.run();
        lion1.eat();
        lion1.sleep();
        lion1.speak();
    }
}

abstract class Animal {

    Animal(String name) {
        this.name = name;
    }
    String name;

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("It is quite interesting to watch fish sleeping...");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

class Swordfish extends Fish {

    Swordfish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Swordfish swims very beautifully and fast.");
    }

    @Override
    void eat() {
        System.out.println("Swordfish eats only special fish food.");
    }
}

class Penguin extends Bird {

    Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Penguin eats fish.");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep close to each other.");
    }

    @Override
    void fly() {
        System.out.println("Penguins can not fly!");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can not sing like nightingale.");
    }
}

class Lion extends Mammal {

    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lion, like any other predator, loves meat.");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps most of the day");
    }

    @Override
    void run() {
        System.out.println("Lion is not the fastest in the feline family.");
    }
}

interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

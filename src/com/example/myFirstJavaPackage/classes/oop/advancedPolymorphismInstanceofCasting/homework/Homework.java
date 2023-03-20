package com.example.myFirstJavaPackage.classes.oop.advancedPolymorphismInstanceofCasting.homework;

public class Homework {

    public static void main(String[] args) {

        Swordfish swordfish = new Swordfish("Petya");
        Penguin penguin = new Penguin("Pasha");
        Lion lion = new Lion("Richard");

        Speakable penguinSpeakable = new Penguin("Tolya");
        Speakable lionSpeakable = new Lion("Rafael");

        Speakable[] speakables = {penguinSpeakable, lionSpeakable};
        Animal[] animals = {swordfish, penguin, lion, new Mamont()};

        System.out.println("=== Speakables ===");
        for (Speakable speakable : speakables) {
            if (speakable instanceof Penguin) {
                System.out.println(((Penguin)speakable).name);
                speakable.speak();
                ((Penguin)speakable).fly();
                ((Penguin)speakable).eat();
                ((Penguin)speakable).sleep();
            } else if (speakable instanceof Lion) {
                System.out.println(((Lion)speakable).name);
                speakable.speak();
                ((Lion)speakable).run();
                ((Lion)speakable).eat();
                ((Lion)speakable).sleep();
            } else {
                System.out.println("This animal is not speakable");
            }
        }

        System.out.println("\n=== Animals ===");
        for (Animal animal : animals) {
            if (animal instanceof Swordfish) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Swordfish)animal).swim();
            } else if (animal instanceof Penguin) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Penguin)animal).speak();
                ((Penguin)animal).fly();
            } else if (animal instanceof Lion) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Lion)animal).run();
            } else {
                System.out.println("Unknown animal: " + animal.getClass() + " with name: " + animal.name);
            }
        }
    }
}
// Some unknown animal
class Mamont extends Animal {
    Mamont() {
        super("Mamont name");
    }
    @Override
    void eat() {
        System.out.println("Mamonts eat a grass");
    }

    @Override
    void sleep() {
        System.out.println("Mamonts sleep so long!");
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

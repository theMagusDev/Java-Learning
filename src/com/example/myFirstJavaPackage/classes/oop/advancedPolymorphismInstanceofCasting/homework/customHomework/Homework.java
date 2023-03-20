package com.example.myFirstJavaPackage.classes.oop.advancedPolymorphismInstanceofCasting.homework.customHomework;

public class Homework {

    public static void main(String[] args) {

        Swordfish swordfish = new Swordfish("Petya1");
        Fish swordfishFish = new Swordfish("Petya2");
        Animal swordfishAnimal = new Swordfish("Petya3");

        Penguin penguin = new Penguin("Pasha1");
        Bird penguinBird = new Penguin("Pasha2");
        Animal penguinAnimal = new Penguin("Pasha3");

        Lion lion = new Lion("Richard1");
        Mammal lionMammal = new Lion("Richard2");
        Animal lionAnimal = new Lion("Richard3");

        Speakable penguinSpeakable = new Penguin("Tolya");
        Speakable lionSpeakable = new Lion("Rafael");

        Speakable[] speakables = {penguinSpeakable, lionSpeakable, penguin, penguinBird, lion, lionMammal};
        Animal[] animals = {swordfish, swordfishFish, swordfishAnimal, penguin, penguinBird, penguinAnimal, lion, lionMammal, lionAnimal, new Mamont()};

        System.out.println("=== Speakables ===");
        for (Speakable speakable : speakables) {
            if (speakable instanceof Penguin) {
                System.out.println(((Penguin)speakable).name);
                speakable.speak();
                ((Penguin)speakable).fly();
                ((Penguin)speakable).eat();
                ((Penguin)speakable).sleep();
                System.out.println();
            } else if (speakable instanceof Lion) {
                System.out.println(((Lion)speakable).name);
                speakable.speak();
                ((Lion)speakable).run();
                ((Lion)speakable).eat();
                ((Lion)speakable).sleep();
                System.out.println();
            } else {
                System.out.println("This animal is not speakable");
            }
        }

        System.out.println("\n=== Animals ===");
        for (Animal animal : animals) {
            if (animal instanceof Fish) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Fish)animal).swim();
                if (animal instanceof Swordfish) {
                    ((Swordfish) animal).swordfishGreeting();
                }
                System.out.println();
            } else if (animal instanceof Bird) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Penguin)animal).speak();
                ((Penguin)animal).fly();
                if (animal instanceof Penguin) {
                    ((Penguin) animal).penguinGreeting();
                }
                System.out.println();
            } else if (animal instanceof Lion) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Lion)animal).run();
                if (animal instanceof Lion) {
                    ((Lion) animal).lionGreeting();
                }
                System.out.println();
            } else if (animal instanceof Animal) {
                System.out.println("Unknown animal: " + animal.getClass() + " with name: " + animal.name);
                System.out.println();
            } else {
                System.out.println("It is not an animal at all!");
                System.out.println();
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

    void swordfishGreeting() {
        System.out.println("This is a swordfish!");
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

    void penguinGreeting() {
        System.out.println("This is a penguin!");
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

    void lionGreeting() {
        System.out.println("This is a lion!");
    }
}

interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

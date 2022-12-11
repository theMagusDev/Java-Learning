package com.example.myFirstJavaPackage.oop.advancedPolymorphismInstanceofCasting;

/** What is instaceOf
 * instance of checks if the object and class have IS-A relationship.
 */
public class InstanceofKeyword {

    public static void main(String[] args) {

        System.out.println(new Cat() instanceof Object); // true
        System.out.println(new Cat() instanceof Animal); // true
        System.out.println(new InstanceofKeyword() instanceof Object); // true
        System.out.println(new Dog() instanceof BarkAble); // true
        System.out.println(new Cat() instanceof BarkAble); // false
        Cat cat = new Cat();
        cat = null;
        System.out.println(cat instanceof Animal); // false: null is not Animal
        // System.out.println(new Cat() instanceof InstanceOfKeyword); // Error: Inconvertible types

        // Note: instanceof checks object with Class, not reference var with Class
    }
}

abstract class Animal { }

class Cat extends Animal { }

class Dog extends Animal implements BarkAble { }

interface BarkAble { }
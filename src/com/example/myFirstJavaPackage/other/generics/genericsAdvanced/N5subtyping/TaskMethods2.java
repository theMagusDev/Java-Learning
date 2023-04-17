package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N5subtyping;

import java.util.ArrayList;

// Now we need to add only Animals who implements interface Barkable and Swimable
// For example, if we are looking for rescue dogs.

abstract class Animal { }

class UsualDog extends Animal implements Barkable {

    @Override
    public void bark() {
        System.out.println("Woof-woof!");
    }
}
class RescueDog extends Animal implements Barkable, Swimable {

    @Override
    public void bark() {
        System.out.println("Woof-woof!");
    }
    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }
}

class Cat extends Animal {}
class Lion extends Animal {}
class Fish extends Animal {}

interface Barkable {
    void bark();
}
interface Swimable {
    void swim();
}

class GenMethod2 {

    public static <T extends Animal & Barkable & Swimable> T getSecondRescueDog(ArrayList<T> arrayList) {
        // extends Animal class and extends (implements) interface Barkable and Swimable
        return arrayList.get(1);
    }

    // Note: class must be written at first place.
    // public static <T extends Barkable & Swimable & Animal> T getSecondRescueDog(ArrayList<T> arrayList)
    // Creates a compile error.
}

public class TaskMethods2 {
    public static void main(String[] args) {
        ArrayList<UsualDog> myDogs = new ArrayList<UsualDog>();
        myDogs.add(new UsualDog());
        myDogs.add(new UsualDog());
        myDogs.add(new UsualDog());

        ArrayList<Cat> myCats = new ArrayList<Cat>();
        myCats.add(new Cat());
        myCats.add(new Cat());
        myCats.add(new Cat());

        ArrayList<Fish> myFishes = new ArrayList<Fish>();
        myFishes.add(new Fish());
        myFishes.add(new Fish());
        myFishes.add(new Fish());

        ArrayList<RescueDog> coolDogs = new ArrayList<RescueDog>();
        coolDogs.add(new RescueDog());
        coolDogs.add(new RescueDog());
        coolDogs.add(new RescueDog());

//      RescueDog assistant = GenMethod2.getSecondRescueDog(myDogs); // Error
//      RescueDog assistant = GenMethod2.getSecondRescueDog(myCats); // Error
//      RescueDog assistant = GenMethod2.getSecondRescueDog(myFishes); // Error
        RescueDog assistant = GenMethod2.getSecondRescueDog(coolDogs); // OK
    }
}

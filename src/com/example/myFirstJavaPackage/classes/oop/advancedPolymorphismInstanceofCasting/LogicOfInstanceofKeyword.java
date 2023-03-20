package com.example.myFirstJavaPackage.classes.oop.advancedPolymorphismInstanceofCasting;

public class LogicOfInstanceofKeyword {

    public static void main(String[] args) {

        Jumpable jumpableMan = new Man();
        Man man = new Man();
        Student student = new Student();

        if(jumpableMan instanceof Jumpable) System.out.println("jumpableMan is Man");
        // 'new Man()' object is Jumpable? True

        if(man instanceof Human) System.out.println("man is Human");
        // 'new Man()' object is Man? True

        // if(student instanceof Human) System.out.println("student is Human");
        // Error. Why?
        /*
        * student can link to Student subclass, compiler can not check this
        * BUT even if it is so, this subclass can not be the subclass of Human,
        * because its superclass is Student (classes can have only 1 superclass)
        */

        // But:
        if(student instanceof Jumpable) System.out.println("student is Jumpable");
        // Works. Var student can link to both Student class object or Student subclass object.
        // Imagine Subclass implemented this interface, but Student does not.
        // What object will be? Compiler does not know. It will be known in the RunTime only.
        // So compiler do not know if object implemented this interface or not.
    }
}

interface Jumpable {}
class Human implements Jumpable {}
class Man extends Human {}
class Student {}

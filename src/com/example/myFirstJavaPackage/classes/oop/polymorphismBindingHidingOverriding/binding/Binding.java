package com.example.myFirstJavaPackage.classes.oop.polymorphismBindingHidingOverriding.binding;

/** Binding
 * Associating an identifier to whatever it identifies,
 be it a method, a variable, or a type.

 * Types:

 * 1) Compile time binding (can not be overridden)

 a) private methods
 (we can not see private methods in other classes,
 so can not override them)

 b) static methods
(because of method hiding)

 c) final methods

 d) all variables

 * 2) Runtime binding (can be overridden)

 a) all other methods

 Note: all vars have a 'compile time binding'
 */

public class Binding {

    void abc(Animal a) {
        System.out.println("A");
    }
    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {

        Binding binding = new Binding();
        Animal animal /* Compiler thinks: var's type is Animal */ = new Mouse();
        binding.abc(animal); // So call here abc() with Animal type
        // Here the 'compile time binding' works.
        // BUT
        animal.getName();
        // Here the 'RunTime binding' works. Compiler does not know
        // which method we will call
    }
}

class Animal {
    static void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    static void getName() {
        System.out.println("Mouse");
    }
}
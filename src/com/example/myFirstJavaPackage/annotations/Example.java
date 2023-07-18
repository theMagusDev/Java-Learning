package com.example.myFirstJavaPackage.annotations;

// Аннотации - это специальные комментари/метки/метаданные, которые нужны для передачи определённой информации.

public class Example {

    public static void main(String[] args) {

        Child child = new Child("Ivan");
        child.showInfo(); // It's Child class. Name = Ivan

        child.oldShowInfo(); // Warning: 'oldShowInfo()' is deprecated
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("It's Parent class. Name = " + name);
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override // Compiler check if it is really overriding function
    void showInfo() {
        System.out.println("It's Child class. Name = " + name);
    }

    @Deprecated
    void oldShowInfo() {
        System.out.println("You are using an old method! It's Child class. Name = " + name);
    }
}

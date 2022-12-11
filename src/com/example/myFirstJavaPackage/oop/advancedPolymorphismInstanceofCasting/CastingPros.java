package com.example.myFirstJavaPackage.oop.advancedPolymorphismInstanceofCasting;

public class CastingPros {

}

class Test1 {
    int a = 5;
    void abc() {
        System.out.println("ok1");
    }
}

class Test2 extends Test1 {
    int a = 10;
    void abc() {
        System.out.println("ok2");
    }

    void setA() {}
}

class Test3 extends Test2 {
    int a = 15;
    void abc() {
        System.out.println("ok3");
        super.abc();
    }

    public static void main(String[] args) {

        Test3 test3 = new Test3();
        // how to print a from Test1?
        // System.out.println(super.super.a); // Error: Cannot resolve symbol 'super'
        System.out.println(((Test1)test3).a); // OK
        // Remember: vars hide each other, not override. Vars have compile-time binding

        // Remember: methods abc() have RunTime binding
        ((Test1)test3).abc(); // ok3

        // Important note:
        Test2 test2 = (Test2) new Test1();
        // Error: class Test1 cannot be cast to class Test2
        /*
        *
        */
        ((Test2) new Test1()).setA();
        // Compiler thinks: Ok, type is Test2, so no problem in calling setA();
        // RunTime thinks: You can not downcast the object. Object Test1 is not 100% object Test2.
    }
}

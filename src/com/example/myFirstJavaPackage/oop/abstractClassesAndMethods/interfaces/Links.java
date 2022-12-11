package com.example.myFirstJavaPackage.oop.abstractClassesAndMethods.interfaces;

public class Links {

}

interface Interface1 { }

interface Interface2 { }

abstract class O { };

class D implements Interface2 { };

class R extends O implements Interface1{

    R method1 () {
        return new R();
    }

    O method2() {
        return new R();
    }

    Interface1 method3() {
        return new R();
    }

    Interface2 method4() {
        return new D();
    }
}


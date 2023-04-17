package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N5subtyping;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        X x = new Y();
//      List<X> list = new ArrayList<Y>();
        // Although Y is child class of X
        // and ArrayList implements List interface,
        // it is not allowed.

        List<Number> list = new ArrayList<Number>(); // OK
//      List<Number> list = new ArrayList<Integer>(); // Error
//      ArrayList<Number> list = new ArrayList<Integer>(); // Error also

        // Even though Integer is a subclass of Number.

        // Why? Suppose we can do so.
        list.add(18);
        list.add(3.14); // OK, 3.14 is Number (Double extends Number)
        // Compile-time this 'list' has type List<Number>
        // but in runtime object of type ArrayList<Integer>
        // is created. So we can not add other subtypes of Number.

    }
}

class X {

}

class Y extends X {

}

package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N1intro;

import com.example.myFirstJavaPackage.classes.nestedClasses.innerClass.example.Car;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw use, type is Object
        list.add("OK");
        list.add(5);
        list.add(new Car("Yellow", 4, 185));

        // We can add anything we want, this is a raw use.
        // What problems we can face?

        List strings = new ArrayList();
        strings.add("Hello");
        strings.add("How are you?");
        strings.add("Bye.");
        strings.add(5); // fake string

//      for (String s : list) { } // Error: type is Object, not String

        for (Object o : list) {
//          System.out.println(o + " length = " + o.length());
            // Error: Object does not have length()
        }

        for (Object o : list) {
            System.out.println(o + " length = " + ((String)o).length());
            // Works, but '5' will throw a class cast exception.
        }

        // That is why we shouldn't use raw type.

        List<String> fakeStrings = new ArrayList();
        // QUESTION: what is the type?
        // Answ: it is still RAW! You must use diamonds twice.

        List<String> realStrings = new ArrayList<String>();
        realStrings.add("Hello");
        realStrings.add("How are you?");
        realStrings.add("Bye.");
//      realStrings.add(5); // fake string: Error now.

        List<String> anotherRealStrings = new ArrayList<>();
        // You can omit type in second diamonds.
    }
}

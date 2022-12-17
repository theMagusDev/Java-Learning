package com.example.myFirstJavaPackage.lambdas.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class LambdasInCollections {

    public static void main(String[] args) {

        List<String> list = List.of("Hello!", "Bye.", "What's up?", "Great, and you?");

        // Old way
        for (String s: list) {
            System.out.println(s);
        }
        // New way
        list.forEach(string -> System.out.println(string));

        List<StringBuilder> stringBuilderList = List.of(new StringBuilder("Hello!"), new StringBuilder("Bye."), new StringBuilder("What's up?"), new StringBuilder("Great, and you?"));
        stringBuilderList.forEach(StringBuilder::reverse); // using the method reference
        System.out.println(stringBuilderList);

        // ----------------- removeIf ---------------- //

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        // integerArrayList.removeIf(integer -> integer % 3 == 0); // [1, 2, 4, 5, 7]
        // or
        Predicate<Integer> integerPredicate = integer -> integer % 3 == 0;
        integerArrayList.removeIf(integerPredicate); // [1, 2, 4, 5, 7]
        System.out.println(integerArrayList);

        // ----------------- sort ---------------- //

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Svetlana");
        namesArrayList.add("Igor");
        namesArrayList.add("Ann");
        namesArrayList.add("Ivan");
        namesArrayList.add("Yuriy");
        namesArrayList.add("Konstantin");
        namesArrayList.add("Yan");
        namesArrayList.sort((first, second) -> first.compareTo(second));
        System.out.println(namesArrayList);
        namesArrayList.sort((first, second) -> -first.compareTo(second));
        System.out.println(namesArrayList);

        // ----------------- variables ---------------- //
        List<String> stringList = List.of("hi", "hello", "hey");
        String someString = "Hello, world!";
        for (String s: stringList) {
            Predicate<String> stringPredicate = str -> {
                System.out.println(someString); // someString must be final or effectively final, we must not change it outside the lambda
                return str.length() > 2;
            };
        }
        // someString = "abc"; // Error in line 59: String, used in lambda, must be final or effectively final
    }
}

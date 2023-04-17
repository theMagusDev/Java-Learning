package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N6wildcards;

import java.util.ArrayList;
import java.util.List;

class X {}
class Y extends X {}

public class Example {

    public static void intro() {

        /* Remember:
//      List<Number> list1 = new ArrayList<Integer>();
//      ArrayList<X> xList = new ArrayList<Y>();

        Error:
        Required type: ArrayList<X>
        Provided: ArrayList<Y>
         */

        // BUT
        ArrayList<?> list = new ArrayList<Y>(); // OK
/*                ^
               Wildcard
 */
    }

    // Where is it used?

    static void showListInfo(List<?> list) {
        System.out.println("Given list contains: " + list);
    }

    static void showListInfoWithoutWildcard(List<Object> list) {
        System.out.println("Given list contains: " + list);
    }

    public static void program1() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        showListInfo(doubleList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        showListInfo(stringList);

        // But why not just to use Object instead?

//      showListInfoWithoutWildcard(doubleList);
        // Error:
        // Required type: List<Object>
        // Provided: List<Double>

        // You can also add "extends"
        List<? extends Number> doubles = new ArrayList<Double>();
        // ? must extend Number
        sumDoubles(doubles); // OK
//      sumDoubles(stringList); // Error: String is not extending Number
    }

    public static double sumDoubles(List<? extends Number> doubles) {
        double summ = 0.0;
        for (Number num : doubles) {
            summ += num.doubleValue();
        }
        return summ;
    }

    public static void program2() {
        // Also we can write so:

        List<? super Number> doubles1 = new ArrayList<Number>(); // OK
        List<? super Number> doubles2 = new ArrayList<Object>(); // OK
        // ? must be superclass of Number
    }

    public static void main(String[] args) {

    }
}



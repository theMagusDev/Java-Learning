package com.example.myFirstJavaPackage.arrayList;

import java.util.*;

public class Methods {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        System.out.println("ArrayList1: " + arrayList1);
        // ArrayList1: [one, two, three]

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("one");
        arrayList2.add("two");
        arrayList2.add("three");
        arrayList2.add("four");
        arrayList2.removeAll(arrayList1);
        System.out.println("ArrayList2: " + arrayList2);
        // ArrayList2: [four]

        arrayList2.add("three");
        arrayList2.retainAll(arrayList1);
        System.out.println("ArrayList2: " + arrayList2);
        // ArrayList2: [three]

        System.out.println(arrayList1.containsAll(arrayList2)); // true
        System.out.println(arrayList2.containsAll(arrayList1)); // false

        List<String> mySubList = arrayList1.subList(0, 2);
        System.out.println(mySubList); // [one, two]
        // Note: mySubList is not List itself, it is the View of arrayList1
        mySubList.add("ten");
        // the last elem of mySubList is "two", so add "ten" after it
        System.out.println("mySubList: " + mySubList);
        System.out.println("ArrayList1: " + arrayList1);
        /* Output:
        mySubList: [one, two, ten]
        ArrayList1: [one, two, ten, three]
         */

        /* arrayList1.add("million");
        System.out.println("mySubList: " + mySubList);
        System.out.println("ArrayList1: " + arrayList1);
`       * Output:
        ConcurrentModificationException
        ArrayList1: [one, two, ten, three]
         */

        String[] array1 = arrayList1.toArray(new String[10]);
        System.out.println(Arrays.toString(array1));
        // [one, two, ten, three, null, null, null, null, null, null]

        List<String> list = List.of("one", "two", "three");
        System.out.println(list); // [one, two, three]
        // Note: List<E> is immutable.
        // list.add("four"); -> UnsupportedOperationException

        List<String> list1 = List.copyOf(arrayList1);
        // list1.add("four"); -> UnsupportedOperationException

    }
}

class ArrayListDefinition {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        // elements of this arrayList have Object type
        // we are working with the raw-type elements

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");

        for (Object o : arrayList) {
            System.out.println("Number = " + o + ", length = " + ((String)o).length());
        }

        // We haven't mentioned arrayList elements type, so the following is allowed:
        arrayList.add(new CompareMismatch());

        /* But the following code causes an error:
        for (Object o : arrayList) {
            System.out.println("Number = " + o + ", length = " + ((String)o).length());
        }
         */
    }
}

class HashMapClass {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
    }
}
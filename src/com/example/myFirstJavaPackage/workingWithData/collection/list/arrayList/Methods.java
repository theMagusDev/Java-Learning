package com.example.myFirstJavaPackage.workingWithData.collection.list.arrayList;

import java.util.*;

class ArrayListDefinition {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        // elements of this arrayList have Object type for compiler.
        // We are working with the raw-type elements.

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

public class Methods {

    public static void main(String[] args) {

        // add()

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        System.out.println("ArrayList1: " + arrayList1);
        // ArrayList1: [one, two, three]

        // removeAll() -> Boolean

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("one");
        arrayList2.add("two");
        arrayList2.add("three");
        arrayList2.add("four");
        arrayList2.removeAll(arrayList1);
        System.out.println("ArrayList2: " + arrayList2);
        // ArrayList2: [four]

        // retainAll() (оставить только эти элементы) -> Boolean

        arrayList2.add("three");
        arrayList2.retainAll(arrayList1); // arrayList1 = [one, two, three]
        System.out.println("ArrayList2: " + arrayList2);
        // ArrayList2: [three]

        // contains() & containsAll() -> Boolean

        System.out.println(arrayList2.contains("three")); // true

        System.out.println(arrayList1.containsAll(arrayList2)); // true
        System.out.println(arrayList2.containsAll(arrayList1)); // false

        // subList(int from index, int toIndex) -> List<E>

        // arrayList1: [one, two, three]
        List<String> mySubList = arrayList1.subList(0, 2); // [0;2)
        System.out.println(mySubList); // [one, two]

        // Note: mySubList is not List itself, it is the View of arrayList1.
        // View - представление List'а, не конкретная сущность. Пример:

        mySubList.add("ten");
        // the last elem of mySubList is "two", add "ten" after it.
        System.out.println("mySubList: " + mySubList);
        System.out.println("ArrayList1: " + arrayList1);
        /* Output:
        mySubList: [one, two, ten]
        ArrayList1: [one, two, ten, three]
         */

        // Попробуем добавить элемент в представление List'а:

        /* arrayList1.add("million");
        System.out.println("mySubList: " + mySubList);
        System.out.println("ArrayList1: " + arrayList1);
`       * Output:
        ConcurrentModificationException
        arrayList1: [one, two, ten, three]
         */

        // Структурные модификации нужно выполнять, используя представление List'а.
        // Если мы их выполним через List, а потом выведем View, то получим Exception.

        // toArray(T [] arrayList) -> T []

        // arrayList1: [one, two, three]
        String[] array1 = arrayList1.toArray(new String[10]);
        System.out.println(Arrays.toString(array1));
        // [one, two, ten, three, null, null, null, null, null, null]
        String[] array2 = arrayList1.toArray(new String[0]);
        System.out.println(Arrays.toString(array1));
        // [one, two, ten, three]
        // Java достаточно умна, создаст Array с нужным размером.

        // Arrays.asList(DataType []) -> List<DataType>

        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder[] stringBuildersArray = {stringBuilder1, stringBuilder2, stringBuilder3};
        List<StringBuilder> stringBuilderList = Arrays.asList(stringBuildersArray);
        System.out.println(stringBuilderList);
        // [A, B, C]

        stringBuildersArray[0] = new StringBuilder("F");
        System.out.println(stringBuilderList);
        // [F, B, C]
        stringBuilderList.set(0, new StringBuilder("5"));

        // List.of(@NotNull E ... elements) -> List<E>

        List<String> list = List.of("one", "two", "three");
        System.out.println(list); // [one, two, three]
        // Note: List<E> is immutable.
        // list.add("four"); -> UnsupportedOperationException

        // List.copyOf(Collection <E> collection) -> List<E>
        List<String> list1 = List.copyOf(arrayList1);
        // Recall: List<E> is immutable.
        // list1.add("four"); -> UnsupportedOperationException

        // Note: you can not add null to List<E>:
//      List<String> stringList = List.of("one", "two", null); // Exception
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
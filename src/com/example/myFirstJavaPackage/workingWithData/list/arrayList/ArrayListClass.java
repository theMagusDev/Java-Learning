package com.example.myFirstJavaPackage.workingWithData.list.arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");

        Car car = new Car();
        arrayList.add(car);

        Student student = new Student();
        arrayList.add(student);

        arrayList.add(new StringBuilder("Ok"));

        // Default DataType is object, so we can add any class

        ArrayList<String> stringArrayList = new ArrayList<String>();
        //stringArrayList.add(student); // error
        stringArrayList.add("Hello");

        ArrayList<String> stringArrayList1 = new ArrayList<String>(30); // 30 - initial capacity

        List<String> stringArrayList2 = new ArrayList<String>();
        stringArrayList2.add("Hello");

        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        ArrayList <StringBuilder> stringBuilderArrayList = new ArrayList<>();
        stringBuilderArrayList.add(new StringBuilder("Hello"));
        stringBuilderArrayList.add(new StringBuilder("Hi"));
        stringBuilderArrayList.add(new StringBuilder("Hey"));
        ArrayList <StringBuilder> stringBuilderArrayList1 = new ArrayList<>(stringBuilderArrayList);
        ArrayList <StringBuilder> stringBuilderArrayList2 = stringBuilderArrayList;
        ArrayList <StringBuilder> stringBuilderArrayList3 = (ArrayList<StringBuilder>) stringBuilderArrayList.clone();
        for (StringBuilder element: stringBuilderArrayList1) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println(stringBuilderArrayList == stringBuilderArrayList1);
        System.out.println(stringBuilderArrayList == stringBuilderArrayList2);
        System.out.println(stringBuilderArrayList == stringBuilderArrayList3);

        // toArray
        StringBuilder[] arrayStringBuilder = stringBuilderArrayList.toArray(new StringBuilder[10]);
        for (StringBuilder element : arrayStringBuilder) {
            System.out.print(element + " ");
        } // Hello Hi Hey null null null null null null null
        System.out.println();
        StringBuilder[] arrayStringBuilder1 = stringBuilderArrayList.toArray(new StringBuilder[3]);
        for (StringBuilder element : arrayStringBuilder1) {
            System.out.print(element + " ");
        } // Hello Hi Hey
        System.out.println();
        // BUT
        StringBuilder[] arrayStringBuilder2 = stringBuilderArrayList.toArray(new StringBuilder[1]);
        for (StringBuilder element : arrayStringBuilder2) {
            System.out.print(element + " ");
        } // Hello Hi Hey
        System.out.println();

        stringArrayList.add("Hey");
        stringArrayList.add("Hi");
        Iterator <String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class Car {

}

class Student {

}

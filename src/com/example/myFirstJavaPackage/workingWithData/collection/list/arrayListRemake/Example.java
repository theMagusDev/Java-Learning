package com.example.myFirstJavaPackage.workingWithData.list.arrayListRemake;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<String>();
        // or
        ArrayList<String> arrayList2 = new ArrayList<>();
        // or
        List<String> arrayList3 = new ArrayList<>(); // but now compiler treat arrayList3 as List
        // or
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1); // have the same elements


        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Peter", 22);
        Student student3 = new Student("Elena", 22);

        ArrayList<Student> students = new ArrayList<>(4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        // Как работает remove(Object o):
        // 1) Он ищет в ArrayList переданный элемент
        // 2) Сохраняет его индекс
        // 3) Удаляет через индекс

        Student student4 = new Student("Elena", 22);
        students.remove(student4);
        System.out.println(students);

        // If do not have overriden equals():
        // [Student{name='Ivan', age=22}, Student{name='Peter', age=22}, Student{name='Elena', age=22}]

        // If have overriden equals():
        // [Student{name='Ivan', age=22}, Student{name='Peter', age=22}]
    }
}

/* Под капотом:
1) Создаётся массив с default capacity (размером) = 10, тип элементов - Object (всегда!).
2) Когда добавляем элемент в заполненый массив:
 а) создаётся новый массив
 б) копируются элементы из старого
 в) добавляются новые места
 */

// Support code
class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
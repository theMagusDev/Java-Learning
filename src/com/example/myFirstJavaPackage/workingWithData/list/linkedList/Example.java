package com.example.myFirstJavaPackage.workingWithData.list.linkedList;

import java.util.LinkedList;

/* Когда использовать:
1) Не надо (или надо очень редко) получать элементы по индексу
2) Часто добавляем / удаляем элементы
 */

public class Example {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 3);
        Student student2 = new Student("Nikolay", 1);
        Student student3 = new Student("Elena", 2);
        Student student4 = new Student("Yuriy", 1);
        Student student5 = new Student("Denis", 5);

        LinkedList<Student> studentLinkedList = new LinkedList<>();

        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);

        System.out.println(studentLinkedList);
        // [Student{name='Ivan', course=3}, Student{name='Nikolay', course=1}, Student{name='Elena', course=2}]

        /* LinkedList - цепочка связанных элементов. Элементы хранят:
         а) Данные
         б) Ссылки на предыдущий и следующий элементы
        */

        // См иллюстрации в папке для более ясного понимания.

        System.out.println(studentLinkedList.get(1));
        // пойдёт с начала LinkedList по каждому элементу до нужного;
        System.out.println(studentLinkedList.get(3));
        // подйёт с конца LinkedList по каждому элементу до нужного.

        // Начинает идти с того конца, с которого быстрее.


        // add() method
        Student newStudent = new Student("Fedor", 1);
        studentLinkedList.add(1, newStudent);
        // теперь первый ссылается на null и newStudent,
        // а student 2 на newStudent и student3

        // тем и прекрасен LinkedList: элементы легко вставляются, просто меняются ссылки.

    }
}


// -------------------------------
// -------- Helper code ----------

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}



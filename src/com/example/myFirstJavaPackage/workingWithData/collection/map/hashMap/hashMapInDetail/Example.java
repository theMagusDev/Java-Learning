package com.example.myFirstJavaPackage.workingWithData.collection.map.hashMap.hashMapInDetail;

/* Theory
HashMap сравнивает объекты СНАЧАЛА по hashCode(), а ПОТОМ ещё по equals(), т.к. hashCode() работает БЫСТРЕЕ, а equals() для того, чтобы полностью убедиться.
Хэширование - это преобразование с помощью методы hashCode() любого объекта в int.
Коллизии - когда разные объекты возвращают одинаковый hashCode. Чем их меньше, тем лучше.
Их не избежать, т.к. int ограничен, а значений может быть очень много.
Правила:
 1) hashCode одного и того же объекта должен быть одинаковым;
 2) Если согласно equals() объекты равны, то и hashcode этих объектов должен быть одинаковым.
 3) Если по equals() объекты не равны, то hashCode этих элементов не обязан быть разным.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {

        Map<Student, String> studentsJournal = new HashMap<>();
        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Ivan", "Ivanov", 3);
        Student student3 = new Student("Peter", "Bondarenko", 3);
        studentsJournal.put(student1, "09.03.01");
        studentsJournal.put(student2, "09.03.04");
        studentsJournal.put(student3, "05.01.03");
        System.out.println(studentsJournal);
        // {Student{name='Zaur', surname='Tregulov', course=3}=7.5, Student{name='Ivan', surname='Ivanov', course=3}=9.3, Student{name='Peter', surname='Bondarenko', course=3}=4.7}

        // Пришёл какой-то студент
        Student student4 = new Student("Zaur", "Tregulov", 3);
        boolean isOurStudent = studentsJournal.containsKey(student4);
        System.out.println(isOurStudent);
        // без overriden hashCode() вернёт false
        // т.к. HashMap сравнивает объекты сначала по hashCode(), а потом и по equals().


        // метод entrySet()

        for (Map.Entry<Student, String> entry : studentsJournal.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        /*
         Student{name='Zaur', surname='Tregulov', course=3} -> 09.03.01
         Student{name='Ivan', surname='Ivanov', course=3} -> 09.03.04
         Student{name='Peter', surname='Bondarenko', course=3} -> 05.01.03
         */

        /*
         Класс Node<K, V> имплементирует Map.Entry. Этот интерфейс, в свою очередь,
         содержить методы getKey(), getValue(), setValue(), equals(), hashCode(), Comparator и т.д.
         */
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student anotherStudent = (Student) o;
        return this.course == anotherStudent.course && Objects.equals(this.name, anotherStudent.name) && Objects.equals(this.surname, anotherStudent.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}



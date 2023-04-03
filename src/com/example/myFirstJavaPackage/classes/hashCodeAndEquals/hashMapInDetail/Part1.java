package com.example.myFirstJavaPackage.classes.hashCodeAndEquals.hashMapInDetail;

/*
Хэширование - преобразование любого объекта с помощью метода hashCode() в int.
Все объекты в Java наследуют стандартную реализацию hashCode(), которая описывается в классе Object.
Этот метод возвращает число, полученное конвертацией внутреннего адреса в число.
static class Node<K, V> в HashMap.java - единица данных, пара КЛЮЧ -> ЗНАЧЕНИЕ

HashMap.java:
...
 static class Node<K,V> implements Map.Entry<K,V> {
        final int hash; - хэш
        final K key; - ключ
        V value; - значение
        Node<K,V> next; - следующий элемент

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }
        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;

            return o instanceof Map.Entry<?, ?> e
                    && Objects.equals(key, e.getKey())
                    && Objects.equals(value, e.getValue());
        }
    }
...

В основе HashMap лежит массив. Элементами этого массива являются LinkedList`ы.
Данные типа LinkedList и заполняются элементами, которые мы добавляем в HashMap.
Такой массив называется table, а его элементы - bucket'ы.
См рисунок hashMapUnderTheHood



// Как работает hashMap.put(): //

1) student == null?
Если да, то помещаем на нулевой индекс LinkedList [null, 7.5]
Иначе идём дальше:

2) Вычисляется hashCode(student)

3) Вычисляется для него индекс алгоритмом, который использует hashCode student'а.
Следствие: одинаковые элементы (с одинаковым hashCode) будут помещены на один индекс, т.е. последний перезапишет первый.

4) На позицию по индексу добавляется объект Node<K, V> с полями:
 а) final int hash;
 б) final K key;
 в) V value;
 г) Node<K, V> next;

Map<K, V> map = new HashMap<>();

// [[], [], [], [], ...]

map.put(student1, 7.5)

// Пусть hashCode = 356
// Пусть вычислился index = 2
// [[], [], Node<student1, 7.5>(hash=356, key=st1, value=7.5, next=null), [], ...]

map.put(student2, 5.3)

// Пусть hashCode = 562
// Пусть вычислился index = 2
// Индексы одинаковые! Проверяем hashCodes этого со всеми элементами этого LinkedList'а. Они все разные (у нас 2 шт.), значит эти ключи разные ( если бы hashCodes оказались бы равными, мы бы проверяли далее что? Правильно, по методу equals() )
// Добавляем в LinkedList по index 2 ещё одну Node<student2, 6.2>.
// Теперь предыдущяя Node<student1, 7.5> имеет next равный Node<student2, 6.2>.
// [[], [], [Node<student1, 7.5>(hash=356, key=st1, value=7.5, next=Node<student2, 6.2>), Node<student2, 6.2>(hash=562, key=st2, value=5.3, next=null)], [], ...]



// Как работает hashMap.get(): //

1) Вычисляется его hashCode
2) Вычисляется его index по hashCode'у (где бы он находился, если бы мы его добавляли)
3) Находим LinkedList по этому index'у.
4) Идёт проверка: сначала по hashCode'у, потом по equals'у КАЖДОГО элемента LinkedList'а.

Замечание: пункт 4 выполняется немного хитрее обычного поиска по LinkedList:
Обычно, можно и просто пройтись по всему LinkedList'у и сравнивать искомое с каждым элементом.
А иногда происходит так:
а) Этот большой LinkedList разбивается на несколько маленьких
б) Мы знаем, в каком из этих маленьких LinkedList'ов находится наш элемент.
в) Таким образом, поиск по маленьким LinkedList'ам будет намного быстрее, чем по исходному большому.
Это реализовано в HashMap.
 */
public class Part1 {

}

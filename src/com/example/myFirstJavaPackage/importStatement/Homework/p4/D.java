package com.example.myFirstJavaPackage.importStatement.Homework.p4;

import com.example.myFirstJavaPackage.importStatement.Homework.p1.A;
import com.example.myFirstJavaPackage.importStatement.Homework.p1.p2.p3.C;
import com.example.myFirstJavaPackage.importStatement.Homework.p4.p5.E;
import static com.example.myFirstJavaPackage.importStatement.Homework.p1.p2.B.*;

public class D {

    String name = "Class D";

    public static void main(String[] args) {

        // Class A
        A a = new A();
        System.out.println(a.name);

        // Class B
        System.out.print(bClassInt + "; ");
        System.out.print(bClassFloat + "; ");
        System.out.println(bClassString);

        // Class C
        C c = new C();
        System.out.println(c.name);

        // Class D
        D d = new D();
        System.out.println(d.name);

        // Class E
        E e = new E();
        System.out.println(e.name);
    }
}

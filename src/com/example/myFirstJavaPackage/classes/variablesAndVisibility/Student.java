package com.example.myFirstJavaPackage.classes.variablesAndVisibility;

public class Student {


}

class StudentProgram {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3;

        student1 = null; // means "delete reference (link) to the object."
        // garbage collector will delete this object when he wants,
        // we can not know when he will do it.

    }

    // student1 and the object it is linked to do not exist here,
    // they were deleted after the main method ended
}

package com.example.myFirstJavaPackage.Lesson4;

public class Student {

    // personal info
    int studentCardId;
    String name;
    String surname;
    int studyYear;

    // average marks
    float mathAvgMark;
    float economicsAvgMark;
    float foreignLangAvgMark;
    float totalAvgMark;
}

class StudentProgram {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentCardId = 1;
        student1.name = "Yuriy";
        student1.surname = "Magus";
        student1.studyYear = 2023;
        student1.mathAvgMark = 4.9f;
        student1.economicsAvgMark = 5.0f;
        student1.foreignLangAvgMark = 4.8f;
        student1.totalAvgMark = (student1.mathAvgMark + student1.economicsAvgMark + student1.foreignLangAvgMark) / 3;

        student2.studentCardId = 2;
        student2.name = "Ivan";
        student2.surname = "Gedzik";
        student2.studyYear = 2023;
        student2.mathAvgMark = 4.0f;
        student2.economicsAvgMark = 4.9f;
        student2.foreignLangAvgMark = 4.1f;
        student2.totalAvgMark = (student2.mathAvgMark + student2.economicsAvgMark + student2.foreignLangAvgMark) / 3;

        student3.studentCardId = 3;
        student3.name = "Yarik";
        student3.surname = "Timan";
        student3.studyYear = 2023;
        student3.mathAvgMark = 5.0f;
        student3.economicsAvgMark = 4.7f;
        student3.foreignLangAvgMark = 4.7f;
        student3.totalAvgMark = (student3.mathAvgMark + student3.economicsAvgMark + student3.foreignLangAvgMark) / 3;

        System.out.println("Student1 average mark: " + student1.totalAvgMark);
        System.out.println("Student2 average mark: " + student2.totalAvgMark);
        System.out.println("Student3 average mark: " + student3.totalAvgMark);
    }
}

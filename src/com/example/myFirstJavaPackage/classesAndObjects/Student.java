package com.example.myFirstJavaPackage.classesAndObjects;

public class Student {

    // personal info
    int id;
    String name;
    String surname;
    int course;

    // average marks
    float mathAvgMark;
    float economicsAvgMark;
    float foreignLangAvgMark;

    Student() {
        this(0, null, null, 0, 0.0f, 0.0f, 0.0f);
    }
    Student(int studentId, String studentName, String studentSurname, int studentCourse) {
        this(studentId, studentName, studentSurname, studentCourse, 0.0f, 0.0f, 0.0f);
    }
    Student(int studentId, String studentName, String studentSurname, int studentCourse, float studentMathAvgMark, float studentEconomicsAvgMark, float studentForeignLangAvgMark) {
        id = studentId;
        name = studentName;
        surname = studentSurname;
        course = studentCourse;
        mathAvgMark = studentMathAvgMark;
        economicsAvgMark = studentEconomicsAvgMark;
        foreignLangAvgMark = studentForeignLangAvgMark;
    }
}

class StudentProgram {

    void calculateAndPrintTotalAvg(Student student) {
        System.out.println((student.mathAvgMark + student.economicsAvgMark + student.foreignLangAvgMark) / 3);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student(1, "Yuriy", "Magus", 1);
        Student student3 = new Student(2, "Yaroslav", "Timan", 1, 4.9f, 4.7f, 5.0f);


    }
}

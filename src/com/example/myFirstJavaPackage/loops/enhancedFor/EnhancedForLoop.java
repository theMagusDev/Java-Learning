package com.example.myFirstJavaPackage.loops.enhancedFor;

public class EnhancedForLoop {

    public static void main(String[] args) {

        int[] array = new int[] {-5, 7, 0, 15};
        for (int element : array) {
            System.out.println(element);
        }
    }
}

class StudentExams {

    public static void takeExams() {
        String[] students = new String[] {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = new String[] {"Math analysis", "Philosophy"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println(student + " is having an exam on topic: " + exam);
            }
        }
    }

    public static void main(String[] args) {

        takeExams();
    }

}

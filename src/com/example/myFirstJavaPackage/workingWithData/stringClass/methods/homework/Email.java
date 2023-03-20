package com.example.myFirstJavaPackage.workingWithData.stringClass.methods.homework;

public class Email {

    public static void getEmailServices(String email) {
        String service;
        while (email.contains(".")) {
            service = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
            email = email.substring(email.indexOf('.') + 1);
            System.out.println(service);
        }
    }

    public static void main(String[] args) {

        getEmailServices("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}

class DebugProgram {

    public static void main(String[] args) {
        String email = "ya@yahoo.com; on@mail.ru; ona@gmail.com";
        String result = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        email = email.substring(email.indexOf(';') + 2);
        System.out.println(result + " " + email);
        result = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        email = email.substring(email.indexOf(';') + 2);
        System.out.println(result + " " + email);
        result = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        email = email.substring(email.indexOf(';') + 2);
        System.out.println(result + " " + email);
        result = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        email = email.substring(email.indexOf(';') + 2);
        System.out.println(result + " " + email);
    }
}

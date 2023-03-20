package com.example.myFirstJavaPackage.other.exceptionsAndErrors.javaIO;

import java.io.*;
public class Program {

    public static void main(String[] args) {

        String pathname = "message.txt";
        File file = new File(pathname);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println(fileInputStream.read());
            System.out.println("File was found!");
        } catch (IOException e) {
            System.out.println("Unable to read file: " + pathname);
        } finally {
            System.out.println("File reading ended.");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(100);
        } catch (IOException e) {
            System.out.println("Unable to write file: " + pathname);
        } finally {
            System.out.println("File writing ended.");
        }
    }

    public static void abc() throws IOException { // Error without 'throws IOException' here

        String pathname = "message.txt";
        File file = new File(pathname);

        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println(fileInputStream.read());
        System.out.println("File was found!");
        System.out.println("File reading ended.");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(100);
        System.out.println("File writing ended.");
    }
}

package com.example.myFirstJavaPackage.reflection.part2;

public class Director {
    public int id;
    public String name;
    private double salary = 500000.0;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + "[PRIVATE INFO]" +
                '}';
    }
}

package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N7example.withoutGenerics;

public class Program {

    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 19);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 41);

        Team schoolarTeam = new Team("Dragons");
        Team studentTeam = new Team("Freelancers");
        Team employeeTeam = new Team("Mechanics");

        // Old decision:
        schoolarTeam.addNewParticipant(schoolar1); // schoolar1 can join
        schoolarTeam.addNewParticipant(schoolar2); // schoolar2 can join
        schoolarTeam.addNewParticipant(employee1); // employee1 can join, but shouldn't!

        employeeTeam.addNewParticipant(schoolar1); // same here: schoolar1 shouldn't join employee team!
        // How to solve it? You can create 3 team classes with 3 types and check each object there...
        // But won't it be better to use generics? Check 'generics' package for solution.
    }
}

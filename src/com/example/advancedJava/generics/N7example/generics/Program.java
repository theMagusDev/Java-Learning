package com.example.advancedJava.generics.N7example.generics;

/* Tasks:
1) Teams must have participants of a same type;
2) We shouldn't be able to create team from other objects (not Participants)
3) Teams must play with the teams of a same level (type)
 */
public class Program {

    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 19);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 41);

        // Task #1

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        Team<Student> studentTeam = new Team<>("Freelancers");
        Team<Employee> employeeTeam = new Team<>("Mechanics");
//      Team<String> stringTeam = new Team<String>("Crazy Strings");
        // Error: String is not extending Participant
        // So we can not create some strange team of Strings or StringBuilders.

        // Task #2

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//      schoolarTeam.addNewParticipant(employee1); // Error now.
//      employeeTeam.addNewParticipant(schoolar1); // Error now.
        // Required type: Employee, Provided: Schoolar

        // Task #3

        // Creation of a 2nd team
        Team<Schoolar> schoolarTeam2 = new Team<>("Vsadniki");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
//      schoolarTeam2.playWith(studentTeam); // Error now

    }
}

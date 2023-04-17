package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N7example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        this.participants.add(participant);
        System.out.println("Team " + this.name + " was updated with new participant " + participant.getName());
    }
    public void playWith(Team<T> anotherTeam) {
         String winner;
         Random random = new Random();
         int i = random.nextInt(2); // nextInt(2) gives '0' or '1'
         if (i == 0) {
             winner = this.name;
         } else {
             winner = anotherTeam.name;
         }
        System.out.println("Team " + winner + " won!");
    }
}

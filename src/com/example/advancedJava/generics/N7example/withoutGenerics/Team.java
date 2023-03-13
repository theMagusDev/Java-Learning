package com.example.advancedJava.generics.N7example.withoutGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant) {
        this.participants.add(participant);
        System.out.println("Team " + this.name + " was updated with new participant " + participant.getName());
    }
    public void playWith(Team anotherTeam) {
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

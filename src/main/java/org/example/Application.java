package org.example;

public class Application {
    public static void main (String[]args) {
        Knight story = new Knight();
        String questJournal = story.ventureQuest(new DeadIslandQuest());
        System.out.println(questJournal);
    }
}

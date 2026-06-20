package org.example;

import java.time.LocalTime;
import java.util.*;

public class ClockLinkedList {

    private LinkedList<Clock> clockLinkedList = new LinkedList<>();

    public void addSeveralRandomClocks() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 10;
        System.out.println("Creating clocks.");
        for(int i = 0; i < randomNumber ; i++) {
            Clock clock = new Clock(random.nextInt(24), random.nextInt(60), random.nextInt(60));
            System.out.println("Clock nr " + (i+1) + ": " + clock);
            clockLinkedList.add(clock);
        }
        System.out.println(randomNumber + " clocks created and added to the list." + "\n");
    }

    public void displayListSize() {
        System.out.println("List size: " + clockLinkedList.size() + "\n");
    }

    public void displayList() {
        for(Clock z: clockLinkedList) {
            System.out.println(z);
        }
        System.out.println("Every clock has been displayed." + "\n");
    }

    public void addOneMinuteToEveryClock() {
        int counter = 0;
        for(Clock x: clockLinkedList) {
            LocalTime y = x.getTime().plusMinutes(1);
            clockLinkedList.set(counter, new Clock(y.getHour(), y.getMinute(), y.getSecond()));
            counter++;
        }
        System.out.println("One minute has been added to every clock." + "\n");
    }
}

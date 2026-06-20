package org.example;

class Program {

    public static void main() {
        ClockLinkedList clockLinkedList = new ClockLinkedList();
        clockLinkedList.addSeveralRandomClocks();
        clockLinkedList.displayListSize();
        clockLinkedList.addOneMinuteToEveryClock();
        clockLinkedList.displayList();
        clockLinkedList.displayListSize();
    }
}
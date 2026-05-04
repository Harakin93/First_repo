package org.example;
import java.util.*;

public class StringArray {

    private ArrayDeque<String> randomStringQueue = new ArrayDeque<>();

    public void fillArray() {
        Random random = new Random();
        for(int x = 0; x < 50; x++) {
            String randomString = "a";
            for(int y = 0; y < random.nextInt(50); y++) {
                 randomString += "a";
            }
            System.out.println("String added to Array: " + randomString);
            randomStringQueue.offer(randomString);
        }
    }

    public void showQueue() {
        System.out.println();
        System.out.println("Displaying the queue");
        int arrayCounter = 1;
        for(String z: randomStringQueue) {
            System.out.println(arrayCounter + ": " + z);
            arrayCounter++;
        }
    }

    public void showQueueSize() {
        System.out.println();
        System.out.println("randomStringQueue's size is equal to : " + randomStringQueue.size());
    }

    public void peekQueue() {
        System.out.println();
        System.out.println("First task in queue is: " + randomStringQueue.peekFirst());
    }

    public void isFirstTaskLengthEven() {
        if(!randomStringQueue.isEmpty()) {
            System.out.println();
            System.out.println("First task in queue is: " + randomStringQueue.peekFirst() + " and its length is " + randomStringQueue.peekFirst().length() + " letters. ");
            if (randomStringQueue.peekFirst().length() % 2 == 0) {
                System.out.println("Number of letters is even");
            } else {
                System.out.println("Number of letters is odd");
            }
        } else {
            System.out.println("The queue is empty. Make sure that tasks in the queue are present.");
        }
    }

    public ArrayDeque<String> getRandomStringQueue() {
        return randomStringQueue;
    }
}


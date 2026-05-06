package org.example;
import java.util.*;

public class StringArray {

    private ArrayDeque<String> randomStringQueue = new ArrayDeque<>();

    public void fillQueue() {
        Random random = new Random();
        for(int x = 0; x < 50; x++) {
            String randomString = "a";
            for(int y = 0; y < random.nextInt(50); y++) {
                 randomString += "a";
            }
            System.out.println("String added to Array: " + randomString);
            randomStringQueue.offer(randomString);
        }
        System.out.println("All strings are now added to the queue" + "\n");
    }

    public void showQueue() {
        System.out.println("Displaying the queue");
        int arrayCounter = 1;
        for(String z: randomStringQueue) {
            System.out.println(arrayCounter + ": " + z);
            arrayCounter++;
        }
        System.out.println("Displaying process finished." + "\n");
    }

    public void showQueueSize() {
        System.out.println("randomStringQueue's size is equal to : " + randomStringQueue.size() + "\n");
    }

    public void peekQueue() {
        System.out.println("First task in queue is: " + randomStringQueue.peekFirst() + "\n");
    }

    public void isFirstTaskLengthEven() {
        if(!randomStringQueue.isEmpty()) {
            System.out.println("First task in queue is: " + randomStringQueue.peekFirst() + " and its length is " + randomStringQueue.peekFirst().length() + " letters.");
            if (randomStringQueue.peekFirst().length() % 2 == 0) {
                System.out.println("Number of letters is even" + "\n");
            } else {
                System.out.println("Number of letters is odd" + "\n");
            }
        } else {
            System.out.println("The queue is empty. Make sure that tasks in the queue are present." + "\n");
        }
    }

    public ArrayDeque<String> getRandomStringQueue() {
        return randomStringQueue;
    }
}
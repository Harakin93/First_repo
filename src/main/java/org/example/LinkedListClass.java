package org.example;
import java.util.*;

public class LinkedListClass {

    private LinkedList <Book> bookLinkedList = new LinkedList<>();

    public void addRandomBooksToLinkedList() {
        Random random = new Random();
        for (int i = 0; i < 300000; i++) {
            String randomTitle = "A";
            String randomAuthor = "B";
            for (int o = 0; o <random.nextInt(20); o++) {
                randomTitle += "a";
            }
            for (int f = 0; f <random.nextInt(20); f++) {
                randomAuthor += "b";
            }
            bookLinkedList.add(new Book(randomTitle, randomAuthor));
        }
        System.out.println(bookLinkedList.size() + " random books have been created " + "\n");
    }

    public void displayBookLinkedListSize() {
        System.out.println("LinkedList's size is equal to: " + bookLinkedList.size() + "\n");
    }

    public void removeFirstBookFromListAndShowTimeSpent() {
        long nanoTimeBefore = System.nanoTime();
        bookLinkedList.removeFirst();
        long nanoTimeAfter = System.nanoTime();
        long timeSpent = nanoTimeAfter - nanoTimeBefore;
        System.out.println("Time to perform operation of removing first book from the LinkedList: " + timeSpent + " nanoseconds" + "\n");
    }

    public void removeLastBookFromListAndShowTimeSpent() {
        long timeBefore = System.nanoTime();
        bookLinkedList.removeLast();
        long timeAfter = System.nanoTime();
        System.out.println("Time to perform operation of removing last book from the LinkedList: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void addBookAsFirstElementToListAndShowTimeSpent() {
        long timeBefore = System.nanoTime();
        bookLinkedList.addFirst(new Book("Title", "Author"));
        long timeAfter = System.nanoTime();
        System.out.println("Time to perform operation of removing last book from the LinkedList: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void addBookAsLastElementToListAndShowTimeSpent() {
        long timeBefore = System.nanoTime();
        bookLinkedList.addLast(new Book("Title", "Author"));
        long timeAfter = System.nanoTime();
        System.out.println("Time to perform operation of removing last book from the LinkedList: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void clearLinkedList() {
        bookLinkedList.clear();
        System.out.println("Linked list is now clear" + "\n");
    }
}

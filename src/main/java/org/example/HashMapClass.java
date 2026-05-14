package org.example;
import java.util.HashMap;

class HashMapClass {

    private HashMap<String,Book> bookHashMap = new HashMap<>();

    public void createAndPairKeyWithBookAndAddToHashMap() {
        String randomKey = "";
        Book book = new Book("A", "B");
        for(int i = 0; i < 64000; i++) {
            randomKey += "a";
            bookHashMap.put(randomKey, book);
        }
        System.out.println(bookHashMap.size() + " pairs added to HashMap" + "\n");
    }

    public void showTimeToDisplayElementFromHashMap(String stringKey) {
        long timeBefore = System.nanoTime();
        System.out.println("This is the requested hash Map element: " + bookHashMap.get(stringKey));
        long timeAfter = System.nanoTime();
        System.out.println("Nanoseconds to perform action: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void showTimeToDeleteElementFromHashMap(String stringKey) {
        System.out.println("Requested key and its correspondent value are now deleted: ");
        long timeBefore = System.nanoTime();
        bookHashMap.remove(stringKey);
        long timeAfter = System.nanoTime();
        System.out.println("Nanoseconds to perform action: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void showTimeToAddNewElementToHashMap(String newKey, String newTitle, String newAuthor) {
        System.out.println("Adding new pair to the hashmap");
        long timeBefore = System.nanoTime();
        bookHashMap.put(newKey,new Book(newTitle, newAuthor));
        long timeAfter = System.nanoTime();
        System.out.println("Nanoseconds to perform action: " + (timeAfter - timeBefore) + " nanoseconds" + "\n");
    }

    public void displayHashMapSize() {
        System.out.println("HashMap size : " + bookHashMap.size() + "\n");
    }
}

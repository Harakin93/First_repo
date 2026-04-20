package org.example;
import java.util.*;

public class HashSetCollection {

    private HashSet <Book> bookHashSet= new HashSet<>();

    public void addObjectToHashSet(Book addedBook) {
        bookHashSet.add(addedBook);
        System.out.println("Book \"" + addedBook.getBookName() + "\" has been added to the HashSet.");
    }

    public void displayHashSet() {
        System.out.println(" ");
        System.out.println("Displaying books added to the Hash Set");
        for(Book x: bookHashSet) {
            System.out.println(x);
        }
        System.out.println(" ");
    }

    public void displayBooksWrittenBefore2010() {
        System.out.println(" ");
        System.out.println("Books written before 2010:");
        for(Book y: bookHashSet) {
            if(y.getBookReleaseDate().getYear()<2010) {
                System.out.println(y);
            }
        }
    }
}

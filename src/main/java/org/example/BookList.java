package org.example;
import java.util.LinkedList;

public class BookList {

    private LinkedList<Book> bookLinkedList = new LinkedList<>();

    public void addElementToLinkedList(String title, Integer year) {
        Book newBook = new Book(title, year);
        bookLinkedList.add(newBook);
        System.out.println("Book \"" + title + "\" "+(" added to the list."));
    }

    public void bookDisplay() {
        for(Book d : bookLinkedList) {
            if(d.getYear()<=2000) {
                System.out.println("Book \""+ d.getTitle() + "\" was written in " + d.getYear());
            }
        }
    }
}






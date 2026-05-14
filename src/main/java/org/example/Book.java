package org.example;
import java.util.*;

class Book {

    private String author;
    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\" written by " + author;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}

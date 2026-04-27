package org.example;
import java.time.LocalDate;

public class Book {

    private String bookName;
    private String author;
    private LocalDate bookReleaseDate;

    public Book() {
    }

    public Book(String name, String author, int dayOfRelease, int monthOfRelease, int yearOfRelease) {
        this.bookName = name;
        this.author = author;
        this.bookReleaseDate = LocalDate.of(yearOfRelease, monthOfRelease, dayOfRelease);
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getBookReleaseDate() {
        return bookReleaseDate;
    }

    public Book createBookObject(String name, String author, int dayOfRelease, int monthOfRelease, int yearOfRelease) {
        Book createdBook = new Book(name, author, dayOfRelease, monthOfRelease, yearOfRelease);
        System.out.println("Book \"" + createdBook.bookName + "\" has been added to the library books collection.");
        return createdBook;
    }

    @Override
    public String toString() {
        return "\"" + bookName + ",\" written by " + author + ", released in " + bookReleaseDate + ".";
    }
}

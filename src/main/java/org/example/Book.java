package org.example;
import java.time.*;

public class Book {

    String bookName;
    String author;
    LocalDate bookReleaseDate;

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

    public Book createBookObject(String name, String author, int dayOfRelease, int monthOfRelease, int yearOfRelease){
        Book createdBook = new Book(name, author, dayOfRelease, monthOfRelease, yearOfRelease);
        System.out.println("Object " + createdBook.bookName + " has been created.");
        return createdBook;
    }

    @Override
    public String toString() {
        return "Book: \"" + bookName + "\" written by " + author + " released " + bookReleaseDate + ".";
    }

    @Override
    public boolean equals(Object x) {
        Book e = (Book) x;
        return bookName.equals(e.getBookName()) && author.equals(e.getAuthor()) && bookReleaseDate.getYear() == e.getBookReleaseDate().getYear() && bookReleaseDate.getMonthValue() == e.getBookReleaseDate().getMonthValue() && bookReleaseDate.getDayOfMonth() == e.getBookReleaseDate().getDayOfMonth();

    }

    @Override
    public int hashCode() {
        return bookReleaseDate.getYear() * 10000 + bookReleaseDate.getMonthValue() * 100 + bookReleaseDate.getDayOfMonth();
    }
}
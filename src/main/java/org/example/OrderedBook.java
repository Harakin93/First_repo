package org.example;
import java.time.LocalDate;

public class OrderedBook {

    private Book book;
    private LocalDate dateOfOrder;

    public OrderedBook(Book book, int year, int month, int day) {
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public OrderedBook() {
    }

    public OrderedBook createOrder(Book book,int year, int month, int day) {
        OrderedBook orderedBook = new OrderedBook(book, year, month, day);
        System.out.println("Order for book has been created. Book:" + book);
        return orderedBook;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public String toString() {
        return "Book \"" + book.getBookName() + "\" has been ordered on " + dateOfOrder + ".";
    }
}


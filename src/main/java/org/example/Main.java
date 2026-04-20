package org.example;

class Main {

    public static void main(String[] args) {

        Book book = new Book();
        HashSetCollection hashSetCollection = new HashSetCollection();
        Book book1 = book.createBookObject("American Gods", "Neil Gaiman", 19, 6, 2001);
        Book book2 = book.createBookObject("Jonathan Strange & Mr Norrell", "Susanna Clarke", 8, 9, 2004);
        Book book3 = book.createBookObject("The Blade Itself", "Joe Abercrombie", 4, 5 , 2006);
        Book book4 = book.createBookObject("The Name of the Wind", "Patrick Rothfuss", 27, 3, 2007);
        Book book5 = book.createBookObject("The Way of Kings", "Brandon Sanderson", 31, 8, 2010);
        Book book6 = book.createBookObject("The Night Circus", "Erin Morgenstern", 13, 9, 2011);
        Book book7 = book.createBookObject("Gideon the Ninth", "Tamsyn Muir", 10, 9, 2019);
        Book book8 = book.createBookObject("The Fifth Season", "N.K. Jemisin", 4, 8, 2015);
        Book book9 = book.createBookObject("Circe", "Madeline Miller", 10, 4, 2018);
        Book book10 = book.createBookObject("Babel", "R.F. Kuang", 23, 8, 2022);
        hashSetCollection.addObjectToHashSet(book1);
        hashSetCollection.addObjectToHashSet(book2);
        hashSetCollection.addObjectToHashSet(book3);
        hashSetCollection.addObjectToHashSet(book4);
        hashSetCollection.addObjectToHashSet(book5);
        hashSetCollection.addObjectToHashSet(book6);
        hashSetCollection.addObjectToHashSet(book7);
        hashSetCollection.addObjectToHashSet(book8);
        hashSetCollection.addObjectToHashSet(book9);
        hashSetCollection.addObjectToHashSet(book10);
        hashSetCollection.displayHashSet();
        hashSetCollection.displayBooksWrittenBefore2010();
        System.out.println(book1.equals(book2));
    }
}
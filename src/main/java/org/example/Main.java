package org.example;

class Main {
    public static String emptyLine = " ";

    public static void main(String[] args) {


        // poukladac main- jedna metoda do dodania fifo z wyswietleniem, druga metoda lifo  z wyswietleniem
        //
         //
        // czy wyjatki sa obsluzone ifem?
         //
         //



        Book book = new Book();
        OrderedBook order = new OrderedBook();
        Queue queue = new Queue();
        Book book1 = book.createBookObject("American Gods", "Neil Gaiman", 19, 6, 2001);
        Book book2 = book.createBookObject("Jonathan Strange & Mr Norrell", "Susanna Clarke", 8, 9, 2004);
        Book book3 = book.createBookObject("The Blade Itself", "Joe Abercrombie", 4, 5 , 2006);
        Book book4 = book.createBookObject("The Name of the Wind", "Patrick Rothfuss", 27, 3, 2007);
        Book book5 = book.createBookObject("The Way of Kings", "Brandon Sanderson", 31, 8, 2010);
        Book book6 = book.createBookObject("The Night Circus", "Erin Morgenstern", 13, 9, 2011);
        System.out.println(emptyLine);
        OrderedBook orderDate1 = order.createOrder(book1,2023, 4, 19);
        OrderedBook orderDate2 = order.createOrder(book2,2024, 6,12);
        OrderedBook orderDate3 = order.createOrder(book3,2022, 10,2);
        OrderedBook orderDate4 = order.createOrder(book4,2025, 7,8);
        OrderedBook orderDate5 = order.createOrder(book5,2026, 9,30);
        OrderedBook orderDate6 = order.createOrder(book6,2025, 12,15);
        OrderedBook orderDate7 = order.createOrder(book2,2014, 8,15);
        OrderedBook orderDate8 = order.createOrder(book3,2017, 1,3);
        OrderedBook orderDate9 = order.createOrder(book5,2022, 6,20);
        OrderedBook orderDate10 = order.createOrder(book1,2020, 4,15);
        OrderedBook orderDate11 = order.createOrder(book3,2019, 3,14);
        OrderedBook orderDate12 = order.createOrder(book4,2012, 2,11);
        OrderedBook orderDate13 = order.createOrder(book2,2018, 1,15);
        OrderedBook orderDate14 = order.createOrder(book6,2019, 10,1);
        queue.addObjectToArrayDequeFifo(orderDate1, orderDate2, orderDate3, orderDate4, orderDate5, orderDate6, orderDate7, orderDate8, orderDate9, orderDate10, orderDate11, orderDate12, orderDate13, orderDate14);
        queue.displayArrayDequeSize();
        queue.displayAllArrayDequeObjects();
        queue.displayArrayDequeSize();
        queue.deleteThirdOrder();
        queue.displayArrayDequeSize();
        queue.displayAllArrayDequeObjects();
        queue.deleteSecondOrderFromTheEnd();
        queue.displayArrayDequeSize();
        queue.displayAllArrayDequeObjects();
        queue.deleteAllOrders();
        queue.displayArrayDequeSize();
        queue.addObjectToArrayDequeLifo(orderDate1, orderDate2, orderDate3, orderDate4, orderDate5, orderDate6, orderDate7, orderDate8, orderDate9, orderDate10, orderDate11, orderDate12, orderDate13, orderDate14);
        queue.peekFirst();
        queue.displayAllArrayDequeObjects();
        queue.peekFirst();
        queue.deleteThirdOrder();
        queue.displayAllArrayDequeObjects();
        queue.deleteSecondOrderFromTheEnd();
        queue.displayAllArrayDequeObjects();
        queue.peekFirst();


    }
}
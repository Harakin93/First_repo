package org.example;

public class Template {

    public static void runProgram() {

        LinkedListClass linkedListClass = new LinkedListClass();
        HashMapClass hashMapClass = new HashMapClass();
        linkedListClass.addRandomBooksToLinkedList();
        linkedListClass.displayBookLinkedListSize();
        linkedListClass.removeFirstBookFromListAndShowTimeSpent();
        linkedListClass.removeFirstBookFromListAndShowTimeSpent();
        linkedListClass.removeLastBookFromListAndShowTimeSpent();
        linkedListClass.removeFirstBookFromListAndShowTimeSpent();
        linkedListClass.removeLastBookFromListAndShowTimeSpent();
        linkedListClass.displayBookLinkedListSize();
        linkedListClass.addBookAsFirstElementToListAndShowTimeSpent();
        linkedListClass.addBookAsLastElementToListAndShowTimeSpent();
        linkedListClass.displayBookLinkedListSize();
        linkedListClass.clearLinkedList();
        linkedListClass.displayBookLinkedListSize();
        hashMapClass.createAndPairKeyWithBookAndAddToHashMap();
        hashMapClass.displayHashMapSize();
        hashMapClass.showTimeToDisplayElementFromHashMap("aaaaaaaa");
        hashMapClass.showTimeToDisplayElementFromHashMap("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        hashMapClass.showTimeToDeleteElementFromHashMap("aaaaaaaaaaaaaa");
        hashMapClass.displayHashMapSize();
        hashMapClass.showTimeToAddNewElementToHashMap("bbbbbbbbbbbbb", "X", "Y");
        hashMapClass.displayHashMapSize();
    }
}

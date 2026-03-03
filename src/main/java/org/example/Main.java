package org.example;

public class Main{

    public static void main(String[] args){
        ComputerScienceGrades computerScienceGrades = new ComputerScienceGrades();
        System.out.println("The Beginning of the computer science grade calculation process!");
        computerScienceGrades.addElementToArrayList(2);
        computerScienceGrades.addElementToArrayList(4);
        computerScienceGrades.addElementToArrayList(3);
        computerScienceGrades.addElementToArrayList(3);
        computerScienceGrades.addElementToArrayList(1);
        computerScienceGrades.addElementToArrayList(5);
        computerScienceGrades.addElementToArrayList(3);
        computerScienceGrades.addElementToArrayList(3);
        computerScienceGrades.addElementToArrayList(6);
        computerScienceGrades.addElementToArrayList(3);
        computerScienceGrades.addElementToArrayList(2);
        computerScienceGrades.addElementToArrayList(5);
        computerScienceGrades.addElementToArrayList(6);
        computerScienceGrades.addElementToArrayList(4);
        computerScienceGrades.listManipulator();
        System.out.println("Computer science grade calculation process is finished!");

        BookList booklist = new BookList();
        System.out.println("Starting the process of adding books to the list.");
        booklist.addElementToLinkedList("The Dunwich Horror and others",1929);
        booklist.addElementToLinkedList("Elantris",2005);
        booklist.addElementToLinkedList("The Final Empire",2006);
        booklist.addElementToLinkedList("The Well of Ascension",2007);
        booklist.addElementToLinkedList("The Last Wish",1993);
        booklist.addElementToLinkedList("Sword of Destiny",1992);
        booklist.addElementToLinkedList("Dune",1965);
        booklist.addElementToLinkedList("Lord of the Rings",1954);
        booklist.addElementToLinkedList("The Hobbit",1937);
        booklist.addElementToLinkedList("The Warded Man",2008);
        System.out.println("All book are now added to the list. Starting the process of display of the books written before 2001.");
        booklist.bookDisplay();
        System.out.println("Books are now displayed! Shutting down the program.");

    }
}

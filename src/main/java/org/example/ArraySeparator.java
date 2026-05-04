package org.example;
import java.util.*;

public class ArraySeparator {

    private ArrayList<String> listWithEvenStrings = new ArrayList<>();
    private ArrayList<String> listWithOddStrings = new ArrayList<>();

    public void separateQueueToOddAndEvenStrings(ArrayDeque<String> queue) {
        System.out.println();
        for(String o: queue) {
            if(o.length() % 2 == 0) {
                listWithEvenStrings.add(queue.poll());
                System.out.println("Completed task has been added to the listWithEvenStrings");
            } else {
                listWithOddStrings.add(queue.poll());
                System.out.println("Completed task has been added to the listWithOddStrings");
            }
        }
        System.out.println("Tasks has been completed and separated into lists");
    }

    public ArrayList<String> getListWithEvenStrings() {
        return listWithEvenStrings;
    }

    public ArrayList<String> getListWithOddStrings() {
        return listWithOddStrings;
    }

    public void displayArrayAndItsSize(ArrayList<String> list) {
        int arrayCounter = 1;
        System.out.println();
        if(list.getFirst().length() % 2 == 0){
            System.out.println("Displaying the list of completed even tasks. Array size: " + list.size());
        } else {
            System.out.println("Displaying the list of completed odd tasks. Array size: " + list.size());
        }

        for(String tempString: list) {
            System.out.println(arrayCounter + ". Task length: " + tempString.length() + " Task: " + tempString);
            arrayCounter++;
        }
    }
}

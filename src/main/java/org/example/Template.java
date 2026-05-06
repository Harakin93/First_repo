package org.example;

public class Template {

    public static void runProgram() {
        StringArray stringArray = new StringArray();
        ArraySeparator arraySeparator = new ArraySeparator();
        stringArray.fillQueue();
        stringArray.showQueueSize();
        stringArray.showQueue();
        stringArray.peekQueue();
        stringArray.isFirstTaskLengthEven();
        arraySeparator.separateQueueToOddAndEvenStrings(stringArray.getRandomStringQueue());
        stringArray.showQueueSize();
        arraySeparator.displayArrayAndItsSize(arraySeparator.getListWithEvenStrings());
        arraySeparator.displayArrayAndItsSize(arraySeparator.getListWithOddStrings());
    }
}

package org.example;

class Main {

    public static void main (String...args) {

        StringArray stringArray = new StringArray();
        ArraySeparator arraySeparator = new ArraySeparator();
        stringArray.fillArray();
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
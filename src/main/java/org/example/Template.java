package org.example;

public class Template {

    public static void runProgram() {
        OrderHashMap orderHashMap = new OrderHashMap();
        orderHashMap.crateAndAddPairToHashMap(23, 2016, 12, 4, "Toyota", "Square balls", 73);
        orderHashMap.crateAndAddPairToHashMap(23, 2016, 12, 4, "Toyota", "Square balls", 73);
        orderHashMap.crateAndAddPairToHashMap(22, 2016, 12, 4, "Toyota", "Square balls", 73);
        orderHashMap.crateAndAddPairToHashMap(14, 2025, 11, 22, "Ferrari", "Termobulbulators", 118);
        orderHashMap.crateAndAddPairToHashMap(92, 2010, 8, 15, "Kia", "Nokia's",2 );
        orderHashMap.displayHashMap();
    }
}

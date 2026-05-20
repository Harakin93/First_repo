package org.example;
import java.util.HashMap;

public class OrderHashMap {

    private int counter = 0;
    private HashMap<OrderInfo, Order> hashMapOfOrders = new HashMap<>();

    public void crateAndAddPairToHashMap(int orderNumberLessThanHundred, int year, int month, int day, String companyName, String productOrdered, Integer numberOfProductsOrdered) {
        OrderInfo orderInfo = new OrderInfo(orderNumberLessThanHundred, year, month, day);
        Order order = new Order(companyName, productOrdered, numberOfProductsOrdered);
        hashMapOfOrders.put(orderInfo, order);
    }

    public void displayHashMap() {
        for(HashMap.Entry<OrderInfo, Order> entry: hashMapOfOrders.entrySet()) {
            counter ++;
            System.out.println("Entry " + counter + ". Order number: " + entry.getKey().getOrderNumberLessThanThousand() + " Order date: " + entry.getKey().getDateOfOrder() + " Order: " + entry.getValue().getCompanyName() + " ordered " +entry.getValue().getNumberOfProductsOrdered() + "x " + entry.getValue().getProductOrdered());
        }
        System.out.print("\n");
    }
}
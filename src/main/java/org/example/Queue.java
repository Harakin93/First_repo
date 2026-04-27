package org.example;
import java.util.ArrayDeque;

public class Queue {

    private ArrayDeque<OrderedBook> orderedBookArrayDeque = new ArrayDeque<>();

    public void addObjectToArrayDequeFifo(OrderedBook... args) {
        System.out.println();
        System.out.println("Orders added to the queue.");
        for (OrderedBook arg : args) orderedBookArrayDeque.offer(arg);
    }

    public void displayAllArrayDequeObjects() {
        System.out.println(" ");
        System.out.println("Queue contains following orders:");
        for(OrderedBook order: orderedBookArrayDeque) {
            orderedBookArrayDeque.poll();
            System.out.println(order);
            orderedBookArrayDeque.offer(order);
        }
    }

    public void addObjectToArrayDequeLifo(OrderedBook... args) {
        System.out.println();
        System.out.println("Orders added to the queue.");
        for (OrderedBook arg : args) orderedBookArrayDeque.push(arg);
    }

    public void displayArrayDequeSize() {
        System.out.println(" ");
        System.out.println("Queue size: " + orderedBookArrayDeque.size());
    }

    public void deleteThirdOrder() {
        System.out.println(" ");
        System.out.println("Deleting the third order from the queue.");
        for(int p = 0; p < (orderedBookArrayDeque.size() + 1); p++) {
            if(p == 2 && orderedBookArrayDeque.size() > 2) {
                OrderedBook deletedOrder = orderedBookArrayDeque.poll();
                System.out.println("Order: " + deletedOrder + " This order is now deleted.");
            } else {
                OrderedBook temp = orderedBookArrayDeque.poll();
                orderedBookArrayDeque.offer(temp);
            }
        }
    }

    public void deleteSecondOrderFromTheEnd() {
        System.out.println(" ");
        System.out.println("Deleting the second order from the end from the queue.");
        for(int x = 0; x < (orderedBookArrayDeque.size() + 1); x++) {
            if(x == (orderedBookArrayDeque.size() - 2) ) {
                OrderedBook deletedOrder = orderedBookArrayDeque.poll();
                System.out.println("Order: " + deletedOrder + " This order is now deleted.");
            } else {
                OrderedBook temp = orderedBookArrayDeque.poll();
                orderedBookArrayDeque.offer(temp);
            }
        }
    }

    public void deleteAllOrders() {
        System.out.println(" ");
        for(OrderedBook t: orderedBookArrayDeque) orderedBookArrayDeque.poll();
        System.out.println("All orders are now deleted.");
    }

    public void peekFirst() {
        System.out.println();
        System.out.println("First order in the queue: " + orderedBookArrayDeque.peekFirst());
    }
}

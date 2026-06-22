package org.example;
import java.util.LinkedList;
import java.util.Random;

public class Program {

    private static LinkedList<Cannon> cannonLinkedList;
    private int timesToShoot;

    public static void main() {
        cannonLinkedList = new LinkedList<>();
        System.out.println("Linked list initialized" + "\n");
    }

    public void createSomeCannons() {
        Random random = new Random();
        int cannonsCreated = random.nextInt(10) + 20;
        for(int x = 0; x < cannonsCreated; x++) {
            cannonLinkedList.add(new Cannon(random.nextBoolean()));
        }
        System.out.println(cannonsCreated + " cannons were created." + "\n");
    }

    public void fireEveryCannonOrLoadIt(int timesToShoot) {
        for(int t = 0; t < timesToShoot; t++) {
            System.out.println("Salvo number: " + (t + 1) + ". Fire every cannon we have! Bring them havoc!" + "\n");
            for (Cannon cannon : cannonLinkedList) {
                cannon.fire();
            }
        }
    }
}

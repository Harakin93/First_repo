package org.example;
import java.util.LinkedList;
import java.util.Random;

public class Program {

    private static LinkedList<Cannon> cannonLinkedList;

    public static void main() {
        cannonLinkedList = new LinkedList<>();
        System.out.println("Linked list initialized" + "\n");
    }

    public void createSomeCannons() {
        Random random = new Random();
        int cannonsCreated = random.nextInt(30) + 20;
        for(int x = 0; x < cannonsCreated; x++) {
            cannonLinkedList.add(new Cannon(random.nextBoolean()));
        }
        System.out.println(cannonsCreated + " cannons were created." + "\n");
    }

    public void fireEveryCannonOrLoadIt() {
        System.out.println("Fire every cannon we have! Bring them havoc!" + "\n");
        for(Cannon cannon: cannonLinkedList) {
            cannon.fire();
        }
    }
}

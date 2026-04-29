package org.example;
import java.util.Random;

public class Iterator {

    int sumA = 1000;
    int sumB = 0;
    int loopCounter = 0;
    public Iterator() {
    }

    public void loopTest() {
        Random random = new Random();
        while(sumA > sumB){
            loopCounter++;
            System.out.println();
            System.out.println("This is loop number " + loopCounter);
            sumA += random.nextInt(10);
            sumB += random.nextInt(50);
            System.out.println("sumA= " + sumA + "  ||  sumB= " + sumB);
        }
        System.out.println();
        System.out.println("sumB became higher than sumA after " + loopCounter + " tries.");
    }
}

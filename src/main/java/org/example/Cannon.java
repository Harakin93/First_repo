package org.example;

public class Cannon {

    public boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if(loaded) {
            System.out.println("Fire!");
            loaded = false;
            System.out.println("Direct hit to the target." + "\n");
        } else {
            System.out.println("Cannon isn't loaded! Loading cannonball.");
            loaded = true;
            System.out.println("Cannon is now loaded and ready to fire." + "\n");
        }
    }
}

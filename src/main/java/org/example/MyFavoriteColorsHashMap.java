package org.example;
import java.util.*;

public class MyFavoriteColorsHashMap {

    Map<Integer,String> myFavoriteColors = new HashMap<Integer,String>();

    public void addColorsToMyFavoriteColorsHashMap() {
        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);
    }

    public HashMap<Integer, String> getMyFavoriteColors() {
        return (HashMap<Integer, String>) myFavoriteColors;
    }
}
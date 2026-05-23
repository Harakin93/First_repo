package org.example;
import java.util.*;

public class MyFriendsFavoriteColorsHashMap {

    Map<Integer,String> myFriendsFavoriteColors = new HashMap<Integer,String>();

    public void addColorsToMyFriendsFavoriteColorsHashMap() {
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in first map: " + myFriendsFavoriteColors);
    }

    public HashMap<Integer, String> getMyFriendsFavoriteColors() {
        return (HashMap<Integer, String>) myFriendsFavoriteColors;
    }
}

package org.example;
import java.util.*;

public class OurFavoriteColorsHashMap {

    Map<Integer,String> ourFavoriteColors = new HashMap<Integer,String>();

    public void addColorsFromHashMapsToOurFavoriteColorsHashMap(HashMap<Integer,String> hashMapToBeUsed1, HashMap<Integer,String> hashMapToBeUsed2) {
        ourFavoriteColors.putAll(hashMapToBeUsed1);
        ourFavoriteColors.putAll(hashMapToBeUsed2);
        System.out.println("Our favorite colors: " + ourFavoriteColors + "\n");
    }

    public void showOurFavoriteColorsHashMapSize() {
        System.out.println("ourFavoriteColors's HashMap size: " + ourFavoriteColors.size());
    }
}

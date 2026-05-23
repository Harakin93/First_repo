package org.example;

public class Template {

    public static void runProgram() {
        MyFavoriteColorsHashMap myFavoriteColorsHashMap = new MyFavoriteColorsHashMap();
        MyFriendsFavoriteColorsHashMap myFriendsFavoriteColorsHashMap = new MyFriendsFavoriteColorsHashMap();
        OurFavoriteColorsHashMap ourFavoriteColorsHashMap = new OurFavoriteColorsHashMap();
        myFavoriteColorsHashMap.addColorsToMyFavoriteColorsHashMap();
        myFriendsFavoriteColorsHashMap.addColorsToMyFriendsFavoriteColorsHashMap();
        ourFavoriteColorsHashMap.addColorsFromHashMapsToOurFavoriteColorsHashMap(myFavoriteColorsHashMap.getMyFavoriteColors(), myFriendsFavoriteColorsHashMap.getMyFriendsFavoriteColors());
        ourFavoriteColorsHashMap.showOurFavoriteColorsHashMapSize();
    }
}

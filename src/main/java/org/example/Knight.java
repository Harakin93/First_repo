package org.example;

public class Knight {
    int number = (int) (Math.random() * 98)+ 1;
    String numberStr = Integer.toString(number);

    public String ventureQuest(Quest quest){
        return  "Mighty hero "+ quest.name() + "went on a mission to save the princess. While his journey he fought fearsome enemies like " + numberStr + " " + quest.firstEnemy() + quest.secondEnemy() + "He looted many of his foes. The most memorable thing found was a " + quest.lootGathered() + "He visited many places and the locals blessed him on his journey. Some of the blessings were crucial to completing his quest. The rest? Well.. Not exactly. Take " + quest.randomBlessing() + "for example. Anyway our hero achieved his goal and slayed " + quest.bossEncounter() + "He freed the princess (of her virginity obviously) and swore to go on another quest. The end.";
    }
}

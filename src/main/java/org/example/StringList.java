package org.example;
import java.util.*;

class StringList {

    private List<String> companies = new ArrayList<>();

    public void addCompaniesToTheList() {
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");
    }

    public void concatenation() {
        System.out.println(companies.get(0) + ", " + companies.get(1) + ", " + companies.get(2) + ", " + companies.get(3) + ", " + companies.get(4));
    }
}

package org.example;

public class Book{

    private String title;
    private Integer year;

    public Book(String title, Integer year){
        this.year = year;
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public Integer getYear() {
        return this.year;
    }
}
package org.example;

public class converter {
    public static void main (String[]args) {
        char c = 'W';
        Character q = c;
        if(q == c){
            System.out.println("Char and Character are equal.");
            } else {
            System.out.println("Char and Character aren't equal.");}

        double d = 3.22;
        Double t = d;
        if(d == t){
            System.out.println("Double and double are equal.");
        } else {
            System.out.println("Double and double aren't equal.");}

        byte b = 120;
        Byte p = b;
        if(b == p){
            System.out.println("Byte and byte are equal.");
        } else {
            System.out.println("Byte and byte aren't equal.");}
    }
}

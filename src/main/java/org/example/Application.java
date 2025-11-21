package org.example;

public class Application {
    public static void main (String[] args)
    {
        HashCodeSample obj = new HashCodeSample();
        int sampleNumber = obj.hashCode();

        System.out.println(sampleNumber);
    }
}

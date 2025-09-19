package org.example;

public interface ATM{
    void depositCash(Double amount, String currency);

    void withdrawCash(Double amount, String currency);

    default void accessBankAccount(){
        System.out.println("Connecting to Your bank account.");
    }
    static String terminateConnection(){
        return "Connection terminated.";
    }
}

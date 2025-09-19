package org.example;

class ATMImpl implements ATM {
    public void depositCash(Double amount, String currency){
        System.out.println("Adding Your "+amount +" "+ currency +" to account balance.");
    }
    public void withdrawCash(Double amount, String currency){
        System.out.println("Withdrawing " +amount +" "+ currency+ " from Your account");
    }
}
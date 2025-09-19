package org.example;

class Application {
    public static void main (String[]args){
        ATMImpl atmimpl = new ATMImpl();

        atmimpl.accessBankAccount();
        atmimpl.withdrawCash(35.2,"PLN");
        atmimpl.depositCash(100.0,"PLN");
        System.out.println(ATM.terminateConnection());
    }
}

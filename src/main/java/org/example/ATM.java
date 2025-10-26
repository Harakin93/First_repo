package org.example;

class ATM extends Bank {
    void insertCardRequest() {
        System.out.println("Please enter Your debit Card.");
    }

    void pinRequest() {
        System.out.println("Please enter Your PIN number.");
    }

    void amountToWithdraw() {
        System.out.println("How much do You want to withdraw?");
    }

    void cashWithdraw() {
        System.out.println("Your cash is being withdrawed.");
    }

    void connectionTerminated() {
        System.out.println("Thank You for using our serviced. Have a good day.");
    }
}

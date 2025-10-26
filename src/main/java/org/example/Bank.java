package org.example;

abstract class Bank {

    abstract void insertCardRequest();

    abstract void pinRequest();

    abstract void amountToWithdraw();

    private void requestAccepted() {
        System.out.println("Your request is being processed.");
    }

    private void accountBalanceCheck() {
        System.out.println("Checking Your account balance.");
    }

    private void requestConfirmation() {
        System.out.println("Transaction confirmed. Please take out Your cash.");
    }

    abstract void cashWithdraw();

    abstract void connectionTerminated();

    public void run() {
        this.insertCardRequest();
        this.pinRequest();
        this.amountToWithdraw();
        this.requestAccepted();
        this.accountBalanceCheck();
        this.requestConfirmation();
        this.cashWithdraw();
        this.connectionTerminated();
    }
}
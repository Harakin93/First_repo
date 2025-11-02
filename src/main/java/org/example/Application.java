package org.example;

public class Application {

    public static void main(String args[]) {

        BonusFixedSalaryEmployee employee = new BonusFixedSalaryEmployee(2000, 400, false
        );

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

    }
}
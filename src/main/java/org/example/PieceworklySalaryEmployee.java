package org.example;

public class PieceworklySalaryEmployee implements Employee {

    private double pieceworkAmount;
    private double payPerPiecework;

    public PieceworklySalaryEmployee(double pieceworkAmount, double payPerPiecework) {
        this.pieceworkAmount = pieceworkAmount;
        this.payPerPiecework = payPerPiecework;
    }

    public double calculateSalary(){
        return this.pieceworkAmount * this.payPerPiecework;
    }
}

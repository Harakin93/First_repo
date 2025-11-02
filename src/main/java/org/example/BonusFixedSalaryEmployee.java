package org.example;

public class BonusFixedSalaryEmployee implements Employee {

    private double salary;
    private double bonus;
    boolean madeAdditionalSales;

    public BonusFixedSalaryEmployee(double salary, double bonus, boolean madeAdditionalSales) {
        this.salary = salary;
        this.bonus = bonus;
        this.madeAdditionalSales = madeAdditionalSales;
    }

    public double calculateSalary() {
        if(madeAdditionalSales) {
            return this.salary + this.bonus;
        } else {
            return this.salary;
        }
    }

}
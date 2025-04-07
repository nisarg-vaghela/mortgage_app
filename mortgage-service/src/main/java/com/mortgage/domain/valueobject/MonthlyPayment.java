package com.mortgage.domain.valueobject;

public class MonthlyPayment {
    private double amount;

    public MonthlyPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
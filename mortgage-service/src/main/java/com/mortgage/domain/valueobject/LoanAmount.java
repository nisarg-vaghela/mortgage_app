package com.mortgage.domain.valueobject;

import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;

@Getter
public class LoanAmount {

    @DecimalMin(value = "0.0", inclusive = false, message = "Loan amount must be greater than 0")
    private final double amount;

    public LoanAmount(double amount) {
        this.amount = amount;
    }
}
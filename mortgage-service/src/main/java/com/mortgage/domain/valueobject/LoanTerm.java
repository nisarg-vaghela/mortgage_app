package com.mortgage.domain.valueobject;

import jakarta.validation.constraints.Min;

public class LoanTerm {

    @Min(value = 0, message = "Loan term must be greater than or equal to 0")
    private int termInYears;

    public LoanTerm(int termInYears) {
        this.termInYears = termInYears;
    }

    public int getTermInYears() {
        return termInYears;
    }
}
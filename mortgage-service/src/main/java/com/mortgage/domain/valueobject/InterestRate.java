package com.mortgage.domain.valueobject;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public class InterestRate {

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    @DecimalMax(value = "1.0", inclusive = false)
    private final double rate;

    public InterestRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
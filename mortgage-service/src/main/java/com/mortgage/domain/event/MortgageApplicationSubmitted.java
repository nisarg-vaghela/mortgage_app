package com.mortgage.domain.event;

import com.mortgage.domain.entity.MortgageApplication;

public class MortgageApplicationSubmitted {

    private final MortgageApplication mortgageApplication;

    public MortgageApplicationSubmitted(MortgageApplication mortgageApplication) {
        this.mortgageApplication = mortgageApplication;
    }

    public MortgageApplication getMortgageApplication() {
        return mortgageApplication;
    }
}
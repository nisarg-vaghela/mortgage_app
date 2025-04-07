package com.mortgage.domain.event;

import com.mortgage.domain.entity.MortgageApplication;

public class MortgageApplicationRejected {
    private final MortgageApplication mortgageApplication;

    public MortgageApplicationRejected(MortgageApplication mortgageApplication) {
        this.mortgageApplication = mortgageApplication;
    }

    public MortgageApplication getMortgageApplication() {
        return mortgageApplication;
    }
}
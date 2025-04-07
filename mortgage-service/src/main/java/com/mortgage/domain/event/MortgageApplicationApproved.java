package com.mortgage.domain.event;

import com.mortgage.domain.entity.MortgageApplication;

public class MortgageApplicationApproved {

    private final MortgageApplication mortgageApplication;

    public MortgageApplicationApproved(MortgageApplication mortgageApplication) {
        this.mortgageApplication = mortgageApplication;
    }

    public MortgageApplication getMortgageApplication() {
        return mortgageApplication;
    }
}
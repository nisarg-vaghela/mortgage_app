package com.mortgage.controller;

import com.mortgage.domain.valueobject.InterestRate;
import com.mortgage.domain.valueobject.LoanAmount;
import com.mortgage.domain.valueobject.LoanTerm;
import com.mortgage.domain.valueobject.MonthlyPayment;
import com.mortgage.service.MortgageCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mortgage")
public class MortgageController {

    @Autowired
    private MortgageCalculationService mortgageCalculationService;

    @PostMapping("/calculate")
    public MonthlyPayment calculateMortgage(@RequestBody LoanAmount loanAmount,
                                            @RequestBody InterestRate interestRate,
                                            @RequestBody LoanTerm loanTerm) {
        return mortgageCalculationService.calculateMortgage(loanAmount, interestRate, loanTerm);
    }
}
package com.mortgage.service;

import com.mortgage.domain.entity.MortgageApplication;
import com.mortgage.domain.repository.MortgageApplicationRepository;
import com.mortgage.domain.valueobject.InterestRate;
import com.mortgage.domain.valueobject.LoanAmount;
import com.mortgage.domain.valueobject.LoanTerm;
import com.mortgage.domain.valueobject.MonthlyPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MortgageCalculationService {

    @Autowired
    private MortgageApplicationRepository mortgageApplicationRepository;

    public MonthlyPayment calculateMortgage(LoanAmount loanAmount, InterestRate interestRate, LoanTerm loanTerm) {
        double principal = loanAmount.getAmount();
        double monthlyInterestRate = interestRate.getRate() / 12;
        int numberOfPayments = loanTerm.getTermInYears() * 12;

        double monthlyPaymentAmount;
        if (monthlyInterestRate == 0) {
             monthlyPaymentAmount = principal / numberOfPayments;
        } else {
            monthlyPaymentAmount = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        }

        return new MonthlyPayment(monthlyPaymentAmount);
    }

    @Transactional
    public MortgageApplication saveMortgageApplication(MortgageApplication mortgageApplication) {
        return mortgageApplicationRepository.save(mortgageApplication);
    }
}
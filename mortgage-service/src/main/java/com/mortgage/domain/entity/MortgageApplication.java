package com.mortgage.domain.entity;

import com.mortgage.domain.valueobject.InterestRate;
import com.mortgage.domain.valueobject.LoanAmount;
import com.mortgage.domain.valueobject.LoanTerm;
import com.mortgage.domain.valueobject.MonthlyPayment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MortgageApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private LoanAmount loanAmount;

    @Embedded
    private InterestRate interestRate;

    @Embedded
    private LoanTerm loanTerm;

    @Embedded
    private MonthlyPayment monthlyPayment;

    public MortgageApplication() {
    }

    public MortgageApplication(LoanAmount loanAmount, InterestRate interestRate, LoanTerm loanTerm, MonthlyPayment monthlyPayment) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.monthlyPayment = monthlyPayment;
    }
}
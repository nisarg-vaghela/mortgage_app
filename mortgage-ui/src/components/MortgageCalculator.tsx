import React, { useState } from 'react';

interface MortgageCalculatorProps {
}

const MortgageCalculator: React.FC<MortgageCalculatorProps> = () => {
  const [loanAmount, setLoanAmount] = useState<number | string>('');
  const [interestRate, setInterestRate] = useState<number | string>('');
  const [loanTerm, setLoanTerm] = useState<number | string>('');
  const [calculationResult, setCalculationResult] = useState<string>('');

  const handleLoanAmountChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setLoanAmount(event.target.value);
  };

  const handleInterestRateChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setInterestRate(event.target.value);
  };

  const handleLoanTermChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setLoanTerm(event.target.value);
  };

  const handleCalculateClick = () => {
    setCalculationResult('Calculate button clicked');
  };

  return (
    <div className="container mt-5">
      <h2 className="mb-3">Mortgage Calculator</h2>
      <div className="mb-3">
        <label htmlFor="loanAmount" className="form-label">
          Loan Amount:
        </label>
        <input type="number" className="form-control" id="loanAmount" value={loanAmount} onChange={handleLoanAmountChange} />
      </div>
      <div className="mb-3">
        <label htmlFor="interestRate" className="form-label">
          Interest Rate:
        </label>
        <input type="number" className="form-control" id="interestRate" value={interestRate} onChange={handleInterestRateChange} />
      </div>
      <div className="mb-3">
        <label htmlFor="loanTerm" className="form-label">
          Loan Term (Years):
        </label>
        <input type="number" className="form-control" id="loanTerm" value={loanTerm} onChange={handleLoanTermChange} />
      </div>
      <button className="btn btn-primary" onClick={handleCalculateClick}>
        Calculate
      </button>
      {calculationResult && (
        <div className="mt-3">
          <strong>Calculation Result:</strong>
          <p>{calculationResult}</p>
        </div>
      )}
    </div>
  );
};

export default MortgageCalculator;
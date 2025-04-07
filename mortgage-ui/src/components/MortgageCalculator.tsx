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
    <div>
      <div>
        <label htmlFor="loanAmount">Loan Amount:</label>
        <input
          type="number"
          id="loanAmount"
          value={loanAmount}
          onChange={handleLoanAmountChange}
        />
      </div>
      <div>
        <label htmlFor="interestRate">Interest Rate:</label>
        <input
          type="number"
          id="interestRate"
          value={interestRate}
          onChange={handleInterestRateChange}
        />
      </div>
      <div>
        <label htmlFor="loanTerm">Loan Term (Years):</label>
        <input
          type="number"
          id="loanTerm"
          value={loanTerm}
          onChange={handleLoanTermChange}
        />
      </div>
      <button onClick={handleCalculateClick}>Calculate</button>
      {calculationResult && <p>{calculationResult}</p>}
    </div>
  );
};

export default MortgageCalculator;
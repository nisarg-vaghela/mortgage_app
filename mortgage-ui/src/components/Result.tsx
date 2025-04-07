import React from 'react';

interface ResultProps {
  monthlyPayment: number | null;
}

const Result: React.FC<ResultProps> = ({ monthlyPayment }) => {
  return (
    <div>
      {monthlyPayment !== null ? (
        <p>Monthly Payment: {monthlyPayment.toFixed(2)}</p>
      ) : (
        <p>No result yet</p>
      )}
    </div>
  );
};

export default Result;
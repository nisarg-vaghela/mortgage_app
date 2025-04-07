import React from 'react';

interface LandingProps {
  user: string;
}

const Landing: React.FC<LandingProps> = ({ user }) => {
  return (
    <div>
      <h1>Welcome to Landing Page</h1>
      <p>Hello, {user}!</p>
    </div>
  );
};

export default Landing;
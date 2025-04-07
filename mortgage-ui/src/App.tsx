import { useState } from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Login from './components/Login';
import MortgageCalculator from './components/MortgageCalculator';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState<boolean>(false);
  const [username, setUsername] = useState<string>('');

  const handleLogin = (user: string) => {
    setIsLoggedIn(true);
    setUsername(user);
  };

  return (
    <Router>
      <div className="App">
        <Routes>
          <Route
            path="/"
            element={<Login onLogin={handleLogin} />}
          />
          <Route
            path="/landing"
            element={isLoggedIn ? <Navigate to="/calculator" /> : <Navigate to="/" />}
          />
          <Route
            path="/calculator"
            element={isLoggedIn ? <MortgageCalculator /> : <Navigate to="/" />}
          />

        </Routes>
      </div>
    </Router>
  );
}
export default App;

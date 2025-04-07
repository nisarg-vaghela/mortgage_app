package com.mortgage.domain.repository;

import com.mortgage.domain.entity.MortgageApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageApplicationRepository extends JpaRepository<MortgageApplication, Long> {
}
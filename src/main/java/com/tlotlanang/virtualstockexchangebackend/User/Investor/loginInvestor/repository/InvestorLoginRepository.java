package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.repository;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.entity.InvestorLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorLoginRepository extends JpaRepository<InvestorLoginEntity, String> {
}

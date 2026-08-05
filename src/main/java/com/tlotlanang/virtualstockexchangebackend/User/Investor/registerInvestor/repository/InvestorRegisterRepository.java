package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InvestorRegisterRepository extends JpaRepository<InvestorRegisterEntity, UUID> {

}

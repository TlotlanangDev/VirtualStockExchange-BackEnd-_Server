package com.tlotlanang.virtualstockexchangebackend.User.Investor.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InvestorRegisterRepository extends JpaRepository<InvestorRegisterEntity, UUID> {

}

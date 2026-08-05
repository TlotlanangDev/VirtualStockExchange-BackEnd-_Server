package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.entity.BankerRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankerRegisterRepository extends JpaRepository<BankerRegisterEntity, UUID> {

}

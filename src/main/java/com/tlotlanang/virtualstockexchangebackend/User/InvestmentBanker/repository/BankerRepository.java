package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankerRepository extends JpaRepository<BankerEntity, UUID> {

}

package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.repository;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankerLoginRepository extends JpaRepository<BankerLoginEntity, String> {
}

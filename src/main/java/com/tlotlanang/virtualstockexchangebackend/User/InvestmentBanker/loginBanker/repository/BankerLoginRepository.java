package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.repository;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity.BankerLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankerLoginRepository extends JpaRepository<BankerLoginEntity, String> {
}

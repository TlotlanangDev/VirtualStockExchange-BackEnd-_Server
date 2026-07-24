package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.repository;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankerLoginRepository extends JpaRepository<BankerLoginEntity, String> {
}

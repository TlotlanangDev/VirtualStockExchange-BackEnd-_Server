package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.InvestorSelectsBrokerEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorSelectsBrokerRepository extends JpaRepository<InvestorSelectsBrokerEntity, String> {

    Slice<InvestorSelectsBrokerEntity>findBy(Pageable pageable);
}

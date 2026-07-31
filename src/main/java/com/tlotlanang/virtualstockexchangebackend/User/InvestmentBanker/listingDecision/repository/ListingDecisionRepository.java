package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.repository;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingDecisionRepository extends JpaRepository<ListingDecisionEntity, Integer> {

    Slice<ListingDecisionEntity>findBy(Pageable pageable);

}

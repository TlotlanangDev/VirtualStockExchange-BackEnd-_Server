package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;

public interface ListingDecisionMapper {

    ListingDecisionRequest fromDto(ListingDecisionDto listingDecisionDto);
    ListingDecisionResponseDto toDto(ListingDecisionEntity listingDecisionEntity);
}

package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import org.springframework.stereotype.Component;

@Component
public class ListingDecisionMapperImpl implements ListingDecisionMapper{
    @Override
    public ListingDecisionRequest fromDto(ListingDecisionDto listingDecisionDto) {
        return new ListingDecisionRequest(
                listingDecisionDto.id(),
                listingDecisionDto.companyName(),
                listingDecisionDto.registrationNumber(),
                listingDecisionDto.stockShare(),
                listingDecisionDto.pricePerShare());
    }

    @Override
    public ListingDecisionResponseDto toDto(ListingDecisionEntity listingDecisionEntity) {
        return new ListingDecisionResponseDto(
                listingDecisionEntity.getId(),
                listingDecisionEntity.getCompanyName(),
                listingDecisionEntity.getRegistrationNumber(),
                listingDecisionEntity.getStockShare(),
                listingDecisionEntity.getPricePerShare());
    }
}

package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.Entity.MainListingPendingEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.domain.MainListingPendingDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.domain.MainListingPendingRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.domain.MainListingPendingResponseDto;
import org.springframework.stereotype.Component;

@Component
public class MainListingPendingMapperImpl implements MainListingPendingMapper {
    @Override
    public MainListingPendingRequest fromDto(MainListingPendingDto mainListingPendingDto) {
        return new MainListingPendingRequest(
                mainListingPendingDto.id(),
                mainListingPendingDto.companyName(),
                mainListingPendingDto.registrationNumber(),
                mainListingPendingDto.stockShare(),
                mainListingPendingDto.pricePerShare());
    }

    @Override
    public MainListingPendingResponseDto toDto(MainListingPendingEntity mainListingPendingEntity) {
        return new MainListingPendingResponseDto(
                mainListingPendingEntity.getId(),
                mainListingPendingEntity.getCompanyName(),
                mainListingPendingEntity.getRegistrationNumber(),
                mainListingPendingEntity.getStockShare(),
                mainListingPendingEntity.getPricePerShare());
    }
}

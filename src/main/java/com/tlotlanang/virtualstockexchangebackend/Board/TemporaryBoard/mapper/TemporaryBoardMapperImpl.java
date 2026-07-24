package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardResponseDto;
import org.springframework.stereotype.Component;

@Component
public class TemporaryBoardMapperImpl implements TemporaryBoardMapper{
    @Override
    public TemporaryBoardRequest fromDto(TemporaryBoardDto temporaryBoardDto) {
        return new TemporaryBoardRequest(
                temporaryBoardDto.id(),
                temporaryBoardDto.companyName(),
                temporaryBoardDto.registrationNumber(),
                temporaryBoardDto.stockShare(),
                temporaryBoardDto.pricePerShare());
    }

    @Override
    public TemporaryBoardResponseDto toDto(TemporaryBoardEntity temporaryBoardEntity) {
        return new TemporaryBoardResponseDto(
                temporaryBoardEntity.getId(),
                temporaryBoardEntity.getCompanyName(),
                temporaryBoardEntity.getRegistrationNumber(),
                temporaryBoardEntity.getStockShare(),
                temporaryBoardEntity.getPricePerShare());
    }
}

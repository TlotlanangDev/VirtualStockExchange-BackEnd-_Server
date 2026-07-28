package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.mapper;


import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardResponseDto;
import org.springframework.stereotype.Component;

@Component
public class MainBoardMapperImpl implements MainBoardMapper{

    @Override
    public MainBoardRequest fromDto(MainBoardDto mainBoardDto) {
        return new MainBoardRequest(
                mainBoardDto.id(),
                mainBoardDto.companyName(),
                mainBoardDto.registrationNumber(),
                mainBoardDto.stockShare(),
                mainBoardDto.pricePerShare());
    }

    @Override
    public MainBoardResponseDto toDto(MainBoardEntity mainBoardEntity) {
        return new MainBoardResponseDto(
                mainBoardEntity.getId(),
                mainBoardEntity.getCompanyName(),
                mainBoardEntity.getRegistrationNumber(),
                mainBoardEntity.getStockShare(),
                mainBoardEntity.getPricePerShare());
    }
}

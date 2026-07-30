package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.domain.MainBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.domain.MainBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.domain.MainBoardResponseDto;

public interface MainBoardMapper {

    MainBoardRequest fromDto(MainBoardDto mainBoardDto);
    MainBoardResponseDto toDto(MainBoardEntity mainBoardEntity);
}

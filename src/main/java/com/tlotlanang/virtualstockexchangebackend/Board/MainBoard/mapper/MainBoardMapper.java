package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardResponseDto;

public interface MainBoardMapper {

    MainBoardRequest fromDto(MainBoardDto mainBoardDto);
    MainBoardResponseDto toDto(MainBoardEntity mainBoardEntity);
}

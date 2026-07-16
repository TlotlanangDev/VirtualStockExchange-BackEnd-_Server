package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardResponseDto;

public interface TemporaryBoardMapper {
    TemporaryBoardRequest fromDto(TemporaryBoardDto temporaryBoardDto);
    TemporaryBoardResponseDto toDto(TemporaryBoardEntity temporaryBoardEntity);
}

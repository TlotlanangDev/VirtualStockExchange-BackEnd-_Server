package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.mapper;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.domain.MainBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.domain.MainBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.domain.MainBoardResponseDto;

public interface MainBoardMapper {

    MainBoardRequest fromDto(MainBoardDto mainBoardDto);
    MainBoardResponseDto toDto(MainBoardEntity mainBoardEntity);
}

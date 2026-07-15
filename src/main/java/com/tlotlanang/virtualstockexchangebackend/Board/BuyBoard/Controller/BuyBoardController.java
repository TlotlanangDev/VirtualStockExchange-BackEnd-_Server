package com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;

import com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.domain.BuyBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.domain.BuyBoardResponseDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class BuyBoardController implements Board<BuyBoardResponseDto, BuyBoardRequestDto> {
    @Override
    public Collection<BuyBoardResponseDto> listings(BuyBoardRequestDto requestBody) {
        return List.of();
    }
}

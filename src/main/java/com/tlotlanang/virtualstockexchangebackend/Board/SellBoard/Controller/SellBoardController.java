package com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.domain.SellBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.domain.SellBoardResponseDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class SellBoardController implements Board<SellBoardResponseDto, SellBoardRequestDto> {
    @Override
    public Collection<SellBoardResponseDto> listings(SellBoardRequestDto requestBody) {
        return List.of();
    }
}

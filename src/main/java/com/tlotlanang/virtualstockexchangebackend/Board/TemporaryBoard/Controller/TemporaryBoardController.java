package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardResponseDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class TemporaryBoardController implements Board<TemporaryBoardResponseDto, TemporaryBoardRequestDto> {
    @Override
    public Collection<TemporaryBoardResponseDto> listings(TemporaryBoardRequestDto requestBody) {
        return List.of();
    }
}

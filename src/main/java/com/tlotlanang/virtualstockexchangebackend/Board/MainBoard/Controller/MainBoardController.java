package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardResponseDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class MainBoardController implements Board<MainBoardResponseDto, MainBoardRequestDto> {
    @Override
    public Collection<MainBoardResponseDto> listings(MainBoardRequestDto requestBody) {
        return List.of();
    }
}

package com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.domain.SellBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.SellBoard.domain.SellBoardResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class SellBoardController implements Board<SellBoardResponseDto, SellBoardRequestDto> {


    @Override
    public ResponseEntity<SlicedModel<EntityModel<SellBoardResponseDto>>> Temporarylisting(SellBoardRequestDto requestBody, Pageable pageable) {
        return null;
    }
}

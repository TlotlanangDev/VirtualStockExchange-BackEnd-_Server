package com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;

import com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.domain.BuyBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.BuyBoard.domain.BuyBoardResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class BuyBoardController implements Board<BuyBoardResponseDto, BuyBoardRequestDto> {


    @Override
    public ResponseEntity<SlicedModel<EntityModel<BuyBoardResponseDto>>> Temporarylisting(BuyBoardRequestDto requestBody, Pageable pageable) {
        return null;
    }
}

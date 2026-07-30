package com.tlotlanang.virtualstockexchangebackend.Board.BuySharesBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;

import com.tlotlanang.virtualstockexchangebackend.Board.BuySharesBoard.domain.BuyBoardResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;

//@RestController
public class BuyBoardController implements Board<BuyBoardResponseDto> {


    @Override
    public ResponseEntity<SlicedModel<EntityModel<BuyBoardResponseDto>>> listing(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<EntityModel<BuyBoardResponseDto>> getCompanyInfo(Integer id) {
        return null;
    }
}

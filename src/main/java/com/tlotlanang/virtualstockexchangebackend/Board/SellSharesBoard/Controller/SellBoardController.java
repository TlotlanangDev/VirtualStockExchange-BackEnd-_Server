package com.tlotlanang.virtualstockexchangebackend.Board.SellSharesBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.SellSharesBoard.domain.SellBoardResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;

//@RestController
public class SellBoardController implements Board<SellBoardResponseDto> {


    @Override
    public ResponseEntity<SlicedModel<EntityModel<SellBoardResponseDto>>> listing(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<EntityModel<SellBoardResponseDto>> getCompanyInfo(Integer id) {
        return null;
    }

}

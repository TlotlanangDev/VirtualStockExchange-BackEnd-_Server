package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardRequestDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardResponseDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

//@RestController
public class MainBoardController implements Board<MainBoardResponseDto> {


    @Override
    public ResponseEntity<SlicedModel<EntityModel<MainBoardResponseDto>>> temporarylisting(Pageable pageable) {
        return null;
    }
}

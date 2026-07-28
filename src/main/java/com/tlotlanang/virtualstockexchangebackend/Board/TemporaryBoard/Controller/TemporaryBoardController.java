package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardResponseDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.mapper.TemporaryBoardMapper;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service.TemporaryBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SlicedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
The Temporary board is only visible to Investment bankers, these are submitted listings form companies that must be
approved or rejected by Investment bankers, approval would list them on the main board for trading.
 */
@RestController
@RequestMapping("api/v1/stockExchange/temporaryboard")
public class TemporaryBoardController implements Board<TemporaryBoardResponseDto>{

    @Autowired
    private TemporaryBoardService temporaryBoardService;

    @Autowired
    private TemporaryBoardMapper temporaryBoardMapper;

    @Autowired
    private SlicedResourcesAssembler<TemporaryBoardEntity> slicedAssembler;

    @Override
    public ResponseEntity<SlicedModel<EntityModel<TemporaryBoardResponseDto>>> listing(Pageable pageable) {
        var temporaryEntitySlice = temporaryBoardService.getListings(pageable);

        SlicedModel<EntityModel<TemporaryBoardResponseDto>> temporaryBoardSlicedModel = slicedAssembler.toModel(
                temporaryEntitySlice,
                entity -> EntityModel.of(temporaryBoardMapper.toDto(entity))
        );

        return ResponseEntity.ok(temporaryBoardSlicedModel);
    }
}

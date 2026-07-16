package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardResponseDto;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.mapper.TemporaryBoardMapper;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service.TemporaryBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
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
@RequestMapping("api/v1/stockExchange/templisting")
public class TemporaryBoardController implements Board<TemporaryBoardResponseDto, TemporaryBoardDto> {

    @Autowired
    private TemporaryBoardService temporaryBoardService;

    @Autowired
    private TemporaryBoardMapper temporaryBoardMapper;

    @Autowired
    private SlicedResourcesAssembler<TemporaryBoardEntity> slicedAssembler;


    @Override
    public ResponseEntity<SlicedModel<EntityModel<TemporaryBoardResponseDto>>> Temporarylisting(TemporaryBoardDto temporaryBoardDto, Pageable pageable) {

        TemporaryBoardRequest temporaryBoardRequest = temporaryBoardMapper.fromDto(temporaryBoardDto);
        Slice<TemporaryBoardEntity> entitySlice = (Slice<TemporaryBoardEntity>) temporaryBoardService
                                                  .submitlisting(temporaryBoardRequest, pageable);
        SlicedModel<EntityModel<TemporaryBoardResponseDto>> slicedModel = slicedAssembler
                .toModel(entitySlice, entity -> EntityModel.of(temporaryBoardMapper.toDto(entity))
        );

        return ResponseEntity.ok(slicedModel);

    }
}

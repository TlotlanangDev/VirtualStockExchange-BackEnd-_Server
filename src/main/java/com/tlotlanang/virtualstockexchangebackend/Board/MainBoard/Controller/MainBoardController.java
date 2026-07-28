package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain.MainBoardResponseDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.mapper.MainBoardMapper;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.service.MainBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SlicedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/stockExchange/mainboard")
public class MainBoardController implements Board<MainBoardResponseDto> {

    @Autowired
    private MainBoardService mainBoardService;

    @Autowired
    private MainBoardMapper mainBoardMapper;

    @Autowired
    private SlicedResourcesAssembler<MainBoardEntity> slicedAssembler;


    @Override
    public ResponseEntity<SlicedModel<EntityModel<MainBoardResponseDto>>> listing(Pageable pageable) {

        var mainBoardEntitySlice = mainBoardService.getListings(pageable);

        SlicedModel<EntityModel<MainBoardResponseDto>>mainBoardSlicedModel = slicedAssembler.
                toModel(mainBoardEntitySlice, entity -> EntityModel.of(mainBoardMapper.toDto(entity))
                );

        return ResponseEntity.ok(mainBoardSlicedModel);
    }
}

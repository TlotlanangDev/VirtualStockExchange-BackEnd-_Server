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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
@RequestMapping("api/v1/stockExchange/mainboard/listings")
public class MainBoardController implements Board<MainBoardResponseDto> {

    @Autowired
    private MainBoardService mainBoardService;

    @Autowired
    private MainBoardMapper mainBoardMapper;

    @Autowired
    private SlicedResourcesAssembler<MainBoardEntity> slicedAssembler;

    @GetMapping
    @Override
    public ResponseEntity<SlicedModel<EntityModel<MainBoardResponseDto>>> listing(Pageable pageable) {

        var mainBoardEntitySlice = mainBoardService.getListings(pageable);

        SlicedModel<EntityModel<MainBoardResponseDto>>mainBoardSlicedModel = slicedAssembler.
                toModel(mainBoardEntitySlice, entity -> EntityModel.of(mainBoardMapper.toDto(entity))
                );

        return ResponseEntity.ok(mainBoardSlicedModel);
    }

    @GetMapping
    @Override
    public ResponseEntity<EntityModel<MainBoardResponseDto>> getByEmail(String emailAddress) {

        var entity = mainBoardService.viewByEmail(emailAddress);

        MainBoardResponseDto mainBoardResponseDto = mainBoardMapper.toDto(entity);

        var mainListedCompanyselfLink = linkTo(methodOn(MainBoardController.class).getByEmail(emailAddress)).withSelfRel();

        EntityModel<MainBoardResponseDto>mainResponseEntityModel = EntityModel.of(mainBoardResponseDto, mainListedCompanyselfLink);
        return ResponseEntity.ok(mainResponseEntityModel);
    }
}

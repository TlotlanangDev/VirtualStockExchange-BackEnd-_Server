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

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


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

    //@GetMapping
    @Override
    public ResponseEntity<SlicedModel<EntityModel<TemporaryBoardResponseDto>>> listing(Pageable pageable) {
        var temporaryEntitySlice = temporaryBoardService.getListings(pageable);

        SlicedModel<EntityModel<TemporaryBoardResponseDto>> temporaryBoardSlicedModel = slicedAssembler.toModel(
                temporaryEntitySlice,
                entity -> {
                    TemporaryBoardResponseDto temporaryBoardResponseDto = temporaryBoardMapper.toDto(entity);

                    var temporaryBoardSelfLink = linkTo(methodOn(TemporaryBoardController.class)
                            .getCompanyInfo(temporaryBoardResponseDto.Id())).withSelfRel();

                    return EntityModel.of(temporaryBoardResponseDto,temporaryBoardSelfLink);
                });

                    var temporaryBoardListToCollection = linkTo(methodOn(TemporaryBoardController.class)
                            .listing(pageable)).withSelfRel();
        temporaryBoardSlicedModel.add(temporaryBoardListToCollection);
        return ResponseEntity.ok(temporaryBoardSlicedModel);


    }

    //@GetMapping
    @Override
    public ResponseEntity<EntityModel<TemporaryBoardResponseDto>> getCompanyInfo(Integer id) {

        var entity = temporaryBoardService.viewByCompanyName(id);

        TemporaryBoardResponseDto temporaryBoardResponseDto = temporaryBoardMapper.toDto(entity);

        var temporaryListedSelflink = linkTo(methodOn(TemporaryBoardController.class)
                .getCompanyInfo(id)).withSelfRel();

        EntityModel<TemporaryBoardResponseDto>temporaryBoardResponseDtoEntityModel = EntityModel
                .of(temporaryBoardResponseDto, temporaryListedSelflink);
        return ResponseEntity.ok(temporaryBoardResponseDtoEntityModel);
    }
}

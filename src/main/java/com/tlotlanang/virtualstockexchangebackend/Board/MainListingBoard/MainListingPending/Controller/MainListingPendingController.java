package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.Controller;

import com.tlotlanang.virtualstockexchangebackend.Board.Board;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.Entity.MainListingPendingEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.domain.MainListingPendingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.mapper.MainListingPendingMapper;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.service.MainListingPendingService;
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
@RequestMapping("api/v1/stockExchange/listingpending")
public class MainListingPendingController implements Board<MainListingPendingResponseDto>{

    @Autowired
    private MainListingPendingService mainListingPendingService;

    @Autowired
    private MainListingPendingMapper mainListingPendingMapper;

    @Autowired
    private SlicedResourcesAssembler<MainListingPendingEntity> slicedAssembler;

    //@GetMapping
    @Override
    public ResponseEntity<SlicedModel<EntityModel<MainListingPendingResponseDto>>> listing(Pageable pageable) {
        var temporaryEntitySlice = mainListingPendingService.getListings(pageable);

        SlicedModel<EntityModel<MainListingPendingResponseDto>> temporaryBoardSlicedModel = slicedAssembler.toModel(
                temporaryEntitySlice,
                entity -> {
                    MainListingPendingResponseDto mainListingPendingResponseDto = mainListingPendingMapper.toDto(entity);

                    var temporaryBoardSelfLink = linkTo(methodOn(MainListingPendingController.class)
                            .getCompanyInfo(mainListingPendingResponseDto.Id())).withSelfRel();

                    return EntityModel.of(mainListingPendingResponseDto,temporaryBoardSelfLink);
                });

                    var temporaryBoardListToCollection = linkTo(methodOn(MainListingPendingController.class)
                            .listing(pageable)).withSelfRel();
        temporaryBoardSlicedModel.add(temporaryBoardListToCollection);
        return ResponseEntity.ok(temporaryBoardSlicedModel);


    }

    //@GetMapping
    @Override
    public ResponseEntity<EntityModel<MainListingPendingResponseDto>> getCompanyInfo(Integer id) {

        var entity = mainListingPendingService.viewByCompanyName(id);

        MainListingPendingResponseDto mainListingPendingResponseDto = mainListingPendingMapper.toDto(entity);

        var temporaryListedSelflink = linkTo(methodOn(MainListingPendingController.class)
                .getCompanyInfo(id)).withSelfRel();

        EntityModel<MainListingPendingResponseDto>temporaryBoardResponseDtoEntityModel = EntityModel
                .of(mainListingPendingResponseDto, temporaryListedSelflink);
        return ResponseEntity.ok(temporaryBoardResponseDtoEntityModel);
    }
}

package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.controller;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain.ListingDecisionResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.mapper.ListingDecisionMapper;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.service.ListingDecisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SlicedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/v1/stockExchange/listingdecision")
public class ListingDecisionController {

    @Autowired
    private ListingDecisionService listingDecisionService;

    @Autowired
    private ListingDecisionMapper listingDecisionMapper;

    @Autowired
    private SlicedResourcesAssembler<ListingDecisionEntity> slicedAssembler;

    @GetMapping
    public ResponseEntity<SlicedModel<EntityModel<ListingDecisionResponseDto>>>getListingRequests(Pageable pageable){

        var entitySlice = listingDecisionService.getRequestList(pageable);
        SlicedModel<EntityModel<ListingDecisionResponseDto>>listOfRequests = slicedAssembler.toModel(
                entitySlice, entity -> {

                    ListingDecisionResponseDto listingDecisionResponseDto = listingDecisionMapper.toDto(entity);

                    var listinglistSelflink = linkTo(methodOn(ListingDecisionController.class)
                            .selectRequestedListing(listingDecisionResponseDto
                            .id())).withSelfRel();
                    return EntityModel.of(listingDecisionResponseDto, listinglistSelflink);
                });
                    var listingRequestCollectionLink = linkTo(methodOn(ListingDecisionController.class)
                            .getListingRequests(pageable)).withSelfRel();
                    listOfRequests.add(listingRequestCollectionLink);


        return ResponseEntity.ok(listOfRequests);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<ListingDecisionResponseDto>>selectRequestedListing(@PathVariable("id") Integer id){

        var entity = listingDecisionService.viewById(id);

        ListingDecisionResponseDto listingDecisionResponseDto = listingDecisionMapper.toDto(entity);

        var RequestSelfLink = linkTo(methodOn(ListingDecisionController.class).selectRequestedListing(id)).withSelfRel();
        EntityModel<ListingDecisionResponseDto>requestResponseEntityModel = EntityModel
                .of(listingDecisionResponseDto,RequestSelfLink);

        return ResponseEntity.ok(requestResponseEntityModel);
    }

    @GetMapping("/reject/{id}")
    public ResponseEntity<EntityModel<ListingDecisionResponseDto>>rejectLisiting(@PathVariable("id") Integer id){

        var entity = listingDecisionService.rejectListingRequest(id);

        ListingDecisionResponseDto listingDecisionResponseDto = listingDecisionMapper.toDto(entity);

        var requestRejectSelfLink = linkTo(methodOn(ListingDecisionController.class).rejectLisiting(id)).withSelfRel();

        EntityModel<ListingDecisionResponseDto>deleteRequestEntityModel = EntityModel
                .of(listingDecisionResponseDto,requestRejectSelfLink);

        return ResponseEntity.ok(deleteRequestEntityModel);
    }

    @GetMapping("/approve/{id}")
    public ResponseEntity<EntityModel<ListingDecisionResponseDto>>approveLisiting(@PathVariable("id") Integer id){

        var entity = listingDecisionService.approveLisiting(id);

        ListingDecisionResponseDto listingDecisionResponseDto = listingDecisionMapper.toDto(entity);

        var requestApproveSelfLink = linkTo(methodOn(ListingDecisionController.class).rejectLisiting(id)).withSelfRel();

        EntityModel<ListingDecisionResponseDto>approveRequestEntityModel = EntityModel
                .of(listingDecisionResponseDto,requestApproveSelfLink);

        return ResponseEntity.ok(approveRequestEntityModel);

    }
}

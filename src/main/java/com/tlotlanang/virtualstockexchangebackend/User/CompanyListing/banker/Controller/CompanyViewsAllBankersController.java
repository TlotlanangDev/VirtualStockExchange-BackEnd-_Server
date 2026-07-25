package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain.CompanyViewsBankersResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.entity.CompanyViewsBankersEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.mapper.CompanyViewsBankersMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.service.CompanyViewsBankersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SlicedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class CompanyViewsAllBankersController {

    @Autowired
    private CompanyViewsBankersService companyViewsBankersService;

    @Autowired
    private CompanyViewsBankersMapper companyViewsBankersMapper;

    @Autowired
    private SlicedResourcesAssembler<CompanyViewsBankersEntity> slicedAssembler;

    @GetMapping("api/v1/stockExchange/CompanyViewsBankersList")
    public ResponseEntity<SlicedModel<EntityModel<CompanyViewsBankersResponseDto>>>getListOfBankers(Pageable pageable){

        var entitySlice = companyViewsBankersService.getBankersList(pageable);

        SlicedModel<EntityModel<CompanyViewsBankersResponseDto>>slicedModel= slicedAssembler.toModel(
                entitySlice, entity-> EntityModel.of(companyViewsBankersMapper.toDto(entity)));

        var selfLink = linkTo(methodOn(CompanyViewsAllBankersController.class).getListOfBankers(pageable)).withSelfRel();
        return ResponseEntity.ok(slicedModel);
    }
}

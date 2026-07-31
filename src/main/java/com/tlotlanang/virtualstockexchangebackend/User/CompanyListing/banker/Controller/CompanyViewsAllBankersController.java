package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain.CompanyViewsBankersResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.entity.CompanyViewsBankersEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.mapper.CompanyViewsBankersMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.service.CompanyViewsBankersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SlicedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


@RestController
@RequestMapping("api/v1/stockExchange/CompanyViewsBankersList")
public class CompanyViewsAllBankersController {

    @Autowired
    private CompanyViewsBankersService companyViewsBankersService;

    @Autowired
    private CompanyViewsBankersMapper companyViewsBankersMapper;

    @Autowired
    private SlicedResourcesAssembler<CompanyViewsBankersEntity> slicedAssembler;

    @GetMapping
    public ResponseEntity<SlicedModel<EntityModel<CompanyViewsBankersResponseDto>>> getListOfBankers(Pageable pageable) {

        var entitySlice = companyViewsBankersService.getBankersList(pageable);

        SlicedModel<EntityModel<CompanyViewsBankersResponseDto>> BankerLists = slicedAssembler.toModel(
                entitySlice, entity -> {
                    CompanyViewsBankersResponseDto companyViewsBankersResponseDto = companyViewsBankersMapper.toDto(entity);

                    var bankerSelfLink = linkTo(methodOn(CompanyViewsAllBankersController.class)
                            .selectBankerByEmail(companyViewsBankersResponseDto.emailAddress()))
                            .withSelfRel();
                    return EntityModel.of(companyViewsBankersResponseDto, bankerSelfLink);
                });

                    var bakerListcollectionSelfLink = linkTo(methodOn(CompanyViewsAllBankersController.class)
                            .getListOfBankers(pageable)).withSelfRel();
                    BankerLists.add(bakerListcollectionSelfLink);


        return ResponseEntity.ok(BankerLists);
    }


    @GetMapping("/{emailAddress}")
    public ResponseEntity<EntityModel<CompanyViewsBankersResponseDto>>selectBankerByEmail(@PathVariable("emailAddress") String emailAddress)
        {

            var entity = companyViewsBankersService.viewByEmail(emailAddress);

            CompanyViewsBankersResponseDto companyViewsBankersResponseDto = companyViewsBankersMapper.toDto(entity);

            var bankerSelfLink = linkTo(methodOn(CompanyViewsAllBankersController.class).selectBankerByEmail(emailAddress)).withSelfRel();
            EntityModel<CompanyViewsBankersResponseDto> BankerResponseEntityModel = EntityModel.of(companyViewsBankersResponseDto, bankerSelfLink);

            return ResponseEntity.ok(BankerResponseEntityModel);
        }


}


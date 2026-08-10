package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanySelectBankerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanySelectBankerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.mapper.CompanySelectBankerMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.service.CompanySelectBankerService;
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

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


@RestController
@RequestMapping("api/v1/stockExchange/companyselectbanker")
public class CompanySelectBankerController {

    @Autowired
    private CompanySelectBankerService companySelectBankerService;

    @Autowired
    private CompanySelectBankerMapper companySelectBankerMapper;

    @Autowired
    private SlicedResourcesAssembler<CompanySelectBankerEntity> slicedAssembler;

    @GetMapping
    public ResponseEntity<SlicedModel<EntityModel<CompanySelectBankerResponseDto>>> getListOfBankers(Pageable pageable) {

        var entitySlice = companySelectBankerService.getBankersList(pageable);

        SlicedModel<EntityModel<CompanySelectBankerResponseDto>> BankerLists = slicedAssembler.toModel(
                entitySlice, entity -> {
                    CompanySelectBankerResponseDto companySelectBankerResponseDto = companySelectBankerMapper.toDto(entity);

                    var bankerSelfLink = linkTo(methodOn(CompanySelectBankerController.class)
                            .selectBankerByEmail(companySelectBankerResponseDto.emailAddress()))
                            .withSelfRel();
                    return EntityModel.of(companySelectBankerResponseDto, bankerSelfLink);
                });

                    var bakerListcollectionSelfLink = linkTo(methodOn(CompanySelectBankerController.class)
                            .getListOfBankers(pageable)).withSelfRel();
                    BankerLists.add(bakerListcollectionSelfLink);


        return ResponseEntity.ok(BankerLists);
    }


    @GetMapping("/{emailAddress}")
    public ResponseEntity<EntityModel<CompanySelectBankerResponseDto>>selectBankerByEmail(@PathVariable("emailAddress") String emailAddress)
        {

            var entity = companySelectBankerService.viewByEmail(emailAddress);

            CompanySelectBankerResponseDto companySelectBankerResponseDto = companySelectBankerMapper.toDto(entity);

            var bankerSelfLink = linkTo(methodOn(CompanySelectBankerController.class).selectBankerByEmail(emailAddress)).withSelfRel();
            EntityModel<CompanySelectBankerResponseDto> BankerResponseEntityModel = EntityModel.of(companySelectBankerResponseDto, bankerSelfLink);

            return ResponseEntity.ok(BankerResponseEntityModel);
        }


}


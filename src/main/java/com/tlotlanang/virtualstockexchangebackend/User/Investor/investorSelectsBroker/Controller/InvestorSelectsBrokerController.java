package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.InvestorSelectsBrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerResponse;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.mapper.InvestorSelectsBrokerMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.service.InvestorSelectsBrokerService;
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
@RequestMapping("api/v1/stockExchange/investorselectbanker")
public class InvestorSelectsBrokerController {

    @Autowired
    private InvestorSelectsBrokerService investorSelectsBrokerService;

    @Autowired
    private InvestorSelectsBrokerMapper investorSelectsBrokerMapper;

    @Autowired
    private SlicedResourcesAssembler<InvestorSelectsBrokerEntity> slicedAssembler;

    @GetMapping
    public ResponseEntity<SlicedModel<EntityModel<InvestorSelectsBrokerResponse>>>getBrokerList(Pageable pageable){

        var entitySlice = investorSelectsBrokerService.getBrokersList(pageable);

        SlicedModel<EntityModel<InvestorSelectsBrokerResponse>>brokerList = slicedAssembler.toModel(
                entitySlice, entity ->{
                    InvestorSelectsBrokerResponse investorSelectsBrokerResponse = investorSelectsBrokerMapper
                            .toDto(entity);

                    var brokerSelflink = linkTo(methodOn(InvestorSelectsBrokerController.class)
                            .selectByEmail(investorSelectsBrokerResponse.emailAddress())).withSelfRel();

                    return EntityModel.of(investorSelectsBrokerResponse, brokerSelflink);
                });

                    var brokerCollectionSelfLink = linkTo(methodOn(InvestorSelectsBrokerController.class)
                            .getBrokerList(pageable)).withSelfRel();
                    brokerList.add(brokerCollectionSelfLink);

                    return ResponseEntity.ok(brokerList);

    }

    @GetMapping("/{emailAddress}")
    public ResponseEntity<EntityModel<InvestorSelectsBrokerResponse>>selectByEmail(@PathVariable("emailAddress") String emailaddress){

        var entity = investorSelectsBrokerService.viewByEmail(emailaddress);

        InvestorSelectsBrokerResponse investorSelectsBrokerResponse = investorSelectsBrokerMapper.toDto(entity);

        var brokerSelflink = linkTo(methodOn(InvestorSelectsBrokerController.class)
                .selectByEmail(emailaddress)).withSelfRel();

        EntityModel<InvestorSelectsBrokerResponse>brokerResponseEntityModel = EntityModel
                .of(investorSelectsBrokerResponse, brokerSelflink);

        return ResponseEntity.ok(brokerResponseEntityModel);

    }
}

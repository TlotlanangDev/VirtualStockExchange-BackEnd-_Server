package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.mapper.InvestorRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.service.InvestorRegisterService;
import com.tlotlanang.virtualstockexchangebackend.User.RegisterUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/investor")
public class InvestorRegisterController implements RegisterUser<InvestorRegisterResponseDto, InvestorRegisterDto> {
    @Autowired
    public InvestorRegisterService investorRegisterService;

    @Autowired
    public InvestorRegisterMapper investorRegisterMapper;


    @Override
    public ResponseEntity<InvestorRegisterResponseDto> registerUser(@Valid @RequestBody InvestorRegisterDto investorRegisterDto) {
        InvestorRegisterRequest investorRegisterRequest = investorRegisterMapper.fromDto(investorRegisterDto);
        InvestorRegisterEntity investorRegisterEntity = investorRegisterService.createUser(investorRegisterRequest);
        InvestorRegisterResponseDto investorRegisterResponseDto = investorRegisterMapper.toDto(investorRegisterEntity);

        return new ResponseEntity<>(investorRegisterResponseDto, HttpStatus.CREATED);
    }






}

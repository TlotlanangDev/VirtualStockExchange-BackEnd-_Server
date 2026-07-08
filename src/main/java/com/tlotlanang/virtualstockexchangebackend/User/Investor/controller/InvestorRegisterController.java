package com.tlotlanang.virtualstockexchangebackend.User.Investor.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper.InvestorRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.service.InvestorRegisterService;
import com.tlotlanang.virtualstockexchangebackend.User.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<InvestorRegisterResponseDto> registerUser(InvestorRegisterDto investorRegisterDto) {
        InvestorRegisterRequest investorRegisterRequest = investorRegisterMapper.fromDto(investorRegisterDto);
        InvestorRegisterEntity investorRegisterEntity = investorRegisterService.createUser(investorRegisterRequest);
        InvestorRegisterResponseDto investorRegisterResponseDto = investorRegisterMapper.toDto(investorRegisterEntity);

        return new ResponseEntity<>(investorRegisterResponseDto, HttpStatus.CREATED);
    }






}

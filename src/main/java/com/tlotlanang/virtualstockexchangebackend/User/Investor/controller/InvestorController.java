package com.tlotlanang.virtualstockexchangebackend.User.Investor.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper.InvestorMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.service.InvestorService;
import com.tlotlanang.virtualstockexchangebackend.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/investor")
public class InvestorController implements User<InvestorResponseDto, InvestorDto> {
    @Autowired
    public InvestorService investorService;

    @Autowired
    public InvestorMapper investorMapper;


    @Override
    public ResponseEntity<InvestorResponseDto> registerUser(InvestorDto investorDto) {
        InvestorRequest investorRequest = investorMapper.fromDto(investorDto);
        InvestorEntity investorEntity = investorService.createUser(investorRequest);
        InvestorResponseDto investorResponseDto = investorMapper.toDto(investorEntity);

        return new ResponseEntity<>(investorResponseDto, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<InvestorResponseDto> loginUser() {
        return null;
    }




}

package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.controller;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper.BankerMapper;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service.BankerService;
import com.tlotlanang.virtualstockexchangebackend.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/banker")
public class BankerController implements User<BankerResponseDto, BankerDto> {
    @Autowired
    public BankerService bankerService;

    @Autowired
    public BankerMapper bankerMapper;


    @Override
    public ResponseEntity<BankerResponseDto> registerUser(BankerDto bankerDto) {
        BankerRequest bankerRequest = bankerMapper.fromDto(bankerDto);
        BankerEntity bankerEntity = bankerService.createUser(bankerRequest);
        BankerResponseDto bankerResponseDto = bankerMapper.toDto(bankerEntity);

        return new ResponseEntity<>(bankerResponseDto, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<BankerResponseDto> loginUser() {
        return null;
    }




}

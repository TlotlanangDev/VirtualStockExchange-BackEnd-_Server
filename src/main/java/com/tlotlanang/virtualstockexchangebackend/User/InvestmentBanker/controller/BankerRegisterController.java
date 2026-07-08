package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.controller;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper.BankerRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service.BankerRegisterService;
import com.tlotlanang.virtualstockexchangebackend.User.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/banker")
public class BankerRegisterController implements RegisterUser<BankerRegisterResponseDto, BankerRegisterDto> {
    @Autowired
    public BankerRegisterService bankerRegisterService;

    @Autowired
    public BankerRegisterMapper bankerRegisterMapper;


    @Override
    public ResponseEntity<BankerRegisterResponseDto> registerUser(BankerRegisterDto bankerRegisterDto) {
        BankerRegisterRequest bankerRegisterRequest = bankerRegisterMapper.fromDto(bankerRegisterDto);
        BankerRegisterEntity bankerRegisterEntity = bankerRegisterService.createUser(bankerRegisterRequest);
        BankerRegisterResponseDto bankerRegisterResponseDto = bankerRegisterMapper.toDto(bankerRegisterEntity);

        return new ResponseEntity<>(bankerRegisterResponseDto, HttpStatus.CREATED);
    }






}

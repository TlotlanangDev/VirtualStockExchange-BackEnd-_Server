package com.tlotlanang.virtualstockexchangebackend.User.Broker.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper.BrokerMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.service.BrokerService;
import com.tlotlanang.virtualstockexchangebackend.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/broker")
public class BrokerController implements User<BrokerResponseDto, BrokerDto> {
    @Autowired
    public BrokerService brokerService;

    @Autowired
    public BrokerMapper brokerMapper;


    @Override
    public ResponseEntity<BrokerResponseDto> registerUser(BrokerDto brokerDto) {
        BrokerRequest brokerRequest = brokerMapper.fromDto(brokerDto);
        BrokerEntity brokerEntity = brokerService.createUser(brokerRequest);
        BrokerResponseDto brokerResponseDto = brokerMapper.toDto(brokerEntity);

        return new ResponseEntity<>(brokerResponseDto, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<BrokerResponseDto> loginUser() {
        return null;
    }




}

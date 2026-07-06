package com.tlotlanang.virtualstockexchangebackend.userRegister.controller;

import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.userRegister.mapper.UserRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.userRegister.service.UserRegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@RequestMapping("api/v1/stockExchange/userRegister")
public class UserRegisterController {
    @Autowired
    public UserRegisterService userRegisterService;

    @Autowired
    public UserRegisterMapper userRegisterMapper;

    @PostMapping
    public ResponseEntity<UserRegisterResponseDto> createUser(@Valid @RequestBody UserRegisterDto userRegisterDto){
        UserRegisterRequest userRegisterRequest = userRegisterMapper.fromDto(userRegisterDto);
        UserRegisterEntity userRegisterEntity = userRegisterService.createUser(userRegisterRequest);
        UserRegisterResponseDto userRegisterResponseDto = userRegisterMapper.toDto(userRegisterEntity);

        return new ResponseEntity<>(userRegisterResponseDto, HttpStatus.CREATED);
    }





}

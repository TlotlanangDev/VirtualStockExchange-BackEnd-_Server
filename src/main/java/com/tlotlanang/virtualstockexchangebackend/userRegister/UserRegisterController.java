package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/v1/stockExchange/userRegister")
public class UserRegisterController {
    @Autowired
    public RegisterUserService registerUserService;

    @Autowired
    public UserRegisterMapper userRegisterMapper;


    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserRegisterDto userRegisterDto){
        UserRegisterRequest userRegisterRequest = userRegisterMapper.fromDto(userRegisterDto);
        UserRegisterEntity userRegisterEntity = registerUserService.createUser(userRegisterRequest);
        UserDto userDto = userRegisterMapper.toDto(userRegisterEntity);

        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }





}

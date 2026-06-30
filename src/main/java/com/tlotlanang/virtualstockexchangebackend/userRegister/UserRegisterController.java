package com.tlotlanang.virtualstockexchangebackend.userRegister;

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

    @PostMapping
    private ResponseEntity<UserRegisterDto> createUser(@Valid @RequestBody UserRegisterDto usersdto){

        UserRegisterDto saved = userRegisterService.dtoConverter(usersdto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }





}

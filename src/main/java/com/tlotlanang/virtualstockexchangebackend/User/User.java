package com.tlotlanang.virtualstockexchangebackend.User;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface User<ResponseDto,RequestDto> {
    @PostMapping("/register")
    ResponseEntity<ResponseDto> registerUser(@Valid @RequestBody RequestDto requestBody);

    @GetMapping("/login")
    ResponseEntity<ResponseDto> loginUser();
}

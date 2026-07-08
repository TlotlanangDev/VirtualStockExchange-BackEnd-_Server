package com.tlotlanang.virtualstockexchangebackend.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface LoginUser<ResponseDto,RequestDto>{


    @GetMapping("/login")
    ResponseEntity<ResponseDto> loginUser(@RequestBody RequestDto requestBody);


}

package com.tlotlanang.virtualstockexchangebackend.homeLander;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/home")
public class HomeLandingController {
    @Autowired
    public HomelandingService homelandingService;

    @GetMapping
    private ResponseEntity<HomeLandingDto>requestHomeLinks(HomeLandingDto homeLandingDto){

        return new ResponseEntity<>();
    }

}

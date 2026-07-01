package com.tlotlanang.virtualstockexchangebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
//@Configuration
//@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.UBER)
public class VirtualStockExchangeBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirtualStockExchangeBackEndApplication.class, args);
    }

}

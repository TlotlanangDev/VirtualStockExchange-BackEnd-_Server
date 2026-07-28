package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.domain;

import lombok.Builder;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.math.BigDecimal;

@Builder
public record MainBoardRequest(

        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {}

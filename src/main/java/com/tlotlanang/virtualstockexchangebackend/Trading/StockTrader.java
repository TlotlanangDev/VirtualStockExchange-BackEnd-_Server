package com.tlotlanang.virtualstockexchangebackend.Trading;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface StockTrader<StockTradeResponseDto, StockTradeRequestDto> {
    @GetMapping("/buyStock")
    ResponseEntity<StockTradeResponseDto>buyStock(@RequestBody StockTradeRequestDto requestBody);

    @GetMapping("/sellStock")
    ResponseEntity<StockTradeResponseDto>sellStock(@RequestBody StockTradeRequestDto requestBody);

}

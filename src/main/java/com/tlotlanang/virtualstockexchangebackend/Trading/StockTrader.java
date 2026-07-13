package com.tlotlanang.virtualstockexchangebackend.Trading;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface StockTrader<TradeResponseDto, TradeRequestDto> {
    @GetMapping("/trade")
    ResponseEntity<TradeResponseDto> buyStock(@RequestBody TradeRequestDto requestBody);
    ResponseEntity<TradeResponseDto> sellStock(@RequestBody TradeRequestDto requestBody);

}

package com.tlotlanang.virtualstockexchangebackend.Board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface Board <BoardResponseDto, BoardRequestDto>{

    @GetMapping("/listings")
    Collection<BoardResponseDto> listings(@RequestBody BoardRequestDto requestBody);
}

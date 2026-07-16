package com.tlotlanang.virtualstockexchangebackend.Board;

import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface Board <BoardResponseDto, BoardRequestDto>{

    @GetMapping("/listings")

    ResponseEntity<SlicedModel<EntityModel<BoardResponseDto>>>Temporarylisting(@Valid @RequestBody BoardRequestDto requestBody, Pageable pageable );
}

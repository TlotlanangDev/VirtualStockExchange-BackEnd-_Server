package com.tlotlanang.virtualstockexchangebackend.Board;

import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.SlicedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface Board <BoardResponseDto>{

    @GetMapping
    ResponseEntity<SlicedModel<EntityModel<BoardResponseDto>>> listing(@Valid Pageable pageable );

    @GetMapping("/{emailAddress}")
    ResponseEntity<EntityModel<BoardResponseDto>>getByEmail(@PathVariable("emailAddress") String emailAddress);
}

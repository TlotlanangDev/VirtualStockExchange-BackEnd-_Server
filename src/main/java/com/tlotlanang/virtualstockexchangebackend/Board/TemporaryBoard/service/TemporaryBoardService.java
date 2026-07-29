package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface TemporaryBoardService {

    Slice<TemporaryBoardEntity> getListings(Pageable pageable);
    TemporaryBoardEntity viewByCompanyName(Integer id);
}

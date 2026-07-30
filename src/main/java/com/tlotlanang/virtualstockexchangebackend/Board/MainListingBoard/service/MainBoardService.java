package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.Entity.MainBoardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface MainBoardService {

    Slice<MainBoardEntity> getListings(Pageable pageable);
    MainBoardEntity viewByEmail(Integer id);
}

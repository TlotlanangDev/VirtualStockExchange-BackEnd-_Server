package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Entity.MainBoardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface MainBoardService {

    Slice<MainBoardEntity> getListings(Pageable pageable);
    MainBoardEntity viewByEmail(String emailAddress);
}

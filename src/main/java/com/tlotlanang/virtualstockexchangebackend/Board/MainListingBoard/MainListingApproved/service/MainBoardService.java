package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.Entity.MainBoardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface MainBoardService {

    Slice<MainBoardEntity> getListings(Pageable pageable);
    MainBoardEntity viewByEmail(Integer id);
}

package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.Entity.MainListingPendingEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface MainListingPendingService {

    Slice<MainListingPendingEntity> getListings(Pageable pageable);
    MainListingPendingEntity viewByCompanyName(Integer id);
}

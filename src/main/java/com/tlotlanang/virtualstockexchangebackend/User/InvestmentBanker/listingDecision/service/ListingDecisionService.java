package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.service;


import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface ListingDecisionService {

    Slice<ListingDecisionEntity>getRequestList(Pageable pageable);
    ListingDecisionEntity viewById(Integer id);
    ListingDecisionEntity deleteListingRequest(Integer id);
    MainBoardEntity approveLisiting(Integer id);

}

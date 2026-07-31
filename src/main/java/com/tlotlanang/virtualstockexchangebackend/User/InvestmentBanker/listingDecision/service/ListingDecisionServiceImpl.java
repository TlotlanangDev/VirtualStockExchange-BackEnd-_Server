package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.repository.ListingDecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ListingDecisionServiceImpl implements ListingDecisionService{

    @Autowired
    private ListingDecisionRepository listingDecisionRepository;


    @Override
    public Slice<ListingDecisionEntity> getRequestList(Pageable pageable) {
        return listingDecisionRepository.findBy(pageable);
    }

    @Override
    public ListingDecisionEntity viewById(Integer id) {
        return listingDecisionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Id: " + id));
    }

    @Override
    public ListingDecisionEntity deleteListingRequest(Integer id) {
        return listingDecisionRepository.deleteById(id);
    }

    @Override
    public MainBoardEntity approveLisiting(Integer id) {
        return listingDecisionRepository.save(id);
    }
}

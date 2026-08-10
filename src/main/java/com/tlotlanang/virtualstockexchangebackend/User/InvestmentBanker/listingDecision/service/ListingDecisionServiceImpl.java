package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.repository.MainBoardRepository;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.entity.ListingDecisionEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.repository.ListingDecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ListingDecisionServiceImpl implements ListingDecisionService{

    @Autowired
    private ListingDecisionRepository listingDecisionRepository;

    @Autowired
    private MainBoardRepository mainBoardRepository;


    @Override
    public Slice<ListingDecisionEntity> getRequestList(Pageable pageable) {
        return listingDecisionRepository.findBy(pageable);
    }

    @Override
    public ListingDecisionEntity viewById(Integer id) {
        return listingDecisionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Id: " + id));
    }
    @Transactional
    @Override
    public ListingDecisionEntity rejectListingRequest(Integer id) {
        ListingDecisionEntity listingDecisionEntity = listingDecisionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Id: " + id));
        listingDecisionRepository.deleteById(id);

        return listingDecisionEntity;
    }

    @Transactional
    @Override
    public ListingDecisionEntity approveLisiting(Integer id) {

        ListingDecisionEntity listingDecisionEntity = listingDecisionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Id: " + id));

        MainBoardEntity approveToMainList = new MainBoardEntity();

                approveToMainList.setCompanyName(listingDecisionEntity.getCompanyName());
                approveToMainList.setRegistrationNumber(listingDecisionEntity.getRegistrationNumber());
                approveToMainList.setStockShare(listingDecisionEntity.getStockShare());
                approveToMainList.setPricePerShare(listingDecisionEntity.getPricePerShare());

        mainBoardRepository.save(approveToMainList);
        listingDecisionRepository.delete(listingDecisionEntity);

        return listingDecisionEntity;
    }
}

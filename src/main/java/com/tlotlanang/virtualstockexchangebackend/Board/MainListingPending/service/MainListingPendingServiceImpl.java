package com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.Entity.MainListingPendingEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.repository.MainListingPendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MainListingPendingServiceImpl implements MainListingPendingService {

    @Autowired
    private MainListingPendingRepository mainListingPendingRepository;

    @Override
    public Slice<MainListingPendingEntity> getListings(Pageable pageable) {


        return mainListingPendingRepository.findBy(pageable);
    }

    @Override
    public MainListingPendingEntity viewByCompanyName(Integer companyName) {
        return mainListingPendingRepository.findById(companyName).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Email Address: " + companyName));
    }
}

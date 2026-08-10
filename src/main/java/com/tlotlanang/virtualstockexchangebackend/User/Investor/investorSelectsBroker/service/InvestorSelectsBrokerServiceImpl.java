package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.InvestorSelectsBrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.repository.InvestorSelectsBrokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class InvestorSelectsBrokerServiceImpl implements InvestorSelectsBrokerService{

    @Autowired
    private InvestorSelectsBrokerRepository investorSelectsBrokerRepository;

    @Override
    public Slice<InvestorSelectsBrokerEntity> getBrokersList(Pageable pageable) {
        return investorSelectsBrokerRepository.findAll(pageable);
    }

    @Override
    public InvestorSelectsBrokerEntity viewByEmail(String emailAddress) {
        return investorSelectsBrokerRepository.findById(emailAddress).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Banker not found with Email Address: " + emailAddress));
    }
}

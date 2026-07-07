package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.repository.BankerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankerServiceImplement implements BankerService {

    @Autowired
    private BankerRepository userregisterrepository;


    @Override
    public BankerEntity createUser(BankerRequest bankerRequest) {

        BankerEntity bankerEntity = new BankerEntity(
                null,
                bankerRequest.name(),
                bankerRequest.surName(),
                bankerRequest.dateOfBirth(),
                bankerRequest.phoneNumber(),
                bankerRequest.emailAddress(),
                bankerRequest.passWord()
        );
        return userregisterrepository.save(bankerEntity);
    }

}
